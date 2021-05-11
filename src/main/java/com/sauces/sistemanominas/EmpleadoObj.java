/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.sistemanominas;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw1
 */
public class EmpleadoObj implements EmpleadoDao{
    private Path path;

    public EmpleadoObj(String path) {
        this.path = Paths.get(path);
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }
    

    @Override
    public List<Empleado> listar() throws DaoException {
        List<Empleado> lista = new ArrayList<>();
        Empleado empleado;
        try(InputStream inputS=Files.newInputStream(path);
                ObjectInputStream entrada = new ObjectInputStream(inputS);){
            while(inputS.available() > 0){
                empleado=(Empleado)entrada.readObject();
                lista.add(empleado);
            }
        }catch(EOFException eofe){
            System.out.println("Fin de fichero");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Objeto no esperado");
        }catch(FileNotFoundException fnfe){
            System.out.println("No existe el fichero");
        }catch(IOException ioe){
            System.out.println("Error de entrada/salida");
        }  
        return lista;
    }

    @Override
    public int insertar(List<Empleado> listado) throws DaoException {
        int n=0;
        try(ObjectOutputStream fichero=new ObjectOutputStream(Files.newOutputStream(path))){
            for(Empleado e: listado){
                fichero.writeObject(e);
                n++;
            }
        } catch (IOException ex) {
         System.out.println(ex);
     }
        return n;
    }
}
