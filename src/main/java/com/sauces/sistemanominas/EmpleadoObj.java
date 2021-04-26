/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.sistemanominas;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw1
 */
public class EmpleadoObj implements EmpleadoDao{
 private Path path;   

    public EmpleadoObj(Path path) {
       path=Paths.get(path);
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }
    

    @Override
    public List<Empleado> listar() throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
