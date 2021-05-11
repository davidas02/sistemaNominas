/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw1
 */
public class EmpleadoCsv implements EmpleadoDao{
    private Path path;

    public EmpleadoCsv(String path) {
        this.path =Paths.get(path);
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    @Override
    public List<Empleado> listar() throws DaoException {
        List<Empleado> listado;
        listado = new ArrayList<>();
        String linea;
        
      try(BufferedReader fichero=Files.newBufferedReader(path)){
           linea=fichero.readLine();
           while(linea!=null){
                 
           linea=fichero.readLine();
           }
        }catch(IOException ex){
            throw new DaoException(ex.toString());
        }
      return listado;
    }

    @Override
    public int insertar(List<Empleado> listado) throws DaoException {
        int n=0;
        try(BufferedWriter fichero=Files.newBufferedWriter(path)){
            for(Empleado e: listado){
                fichero.write(getClass().getSimpleName()+","+e.toString());
                fichero.newLine();
                n++;
            }
        }catch(IOException ex){
            throw new DaoException(ex.toString());
        }
        return n;
    }
    
}
