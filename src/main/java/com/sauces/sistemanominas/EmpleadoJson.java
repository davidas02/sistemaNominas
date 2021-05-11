/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.sistemanominas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw1
 */
public class EmpleadoJson implements EmpleadoDao {

    Path path;

    public EmpleadoJson(String path) {
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
        List<Empleado> listado=new ArrayList<>();
        java.lang.reflect.Type tipo = new com.google.gson.reflect.TypeToken<List<Empleado>>(){}.getType();
        RuntimeTypeAdapterFactory<Empleado> vehiculoAdapter = RuntimeTypeAdapterFactory.of(Empleado.class, "type");
        vehiculoAdapter.registerSubtype(EmpleadoFijo.class, "Empleado Fijo");
        vehiculoAdapter.registerSubtype(EmpleadoEventual.class, "Empleado Eventual");
        GsonBuilder builder=new GsonBuilder();
        builder.setPrettyPrinting();
        builder.registerTypeAdapterFactory(vehiculoAdapter);
        Gson gson=builder.create();
        try(BufferedReader fichero=Files.newBufferedReader(path)){
        listado=gson.fromJson(fichero, tipo);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return listado;
    }

    @Override
    public int insertar(List<Empleado> listado) throws DaoException {
       int n=0;
        List<Empleado> empleados=new ArrayList<>();
        java.lang.reflect.Type tipo = new com.google.gson.reflect.TypeToken<List<Empleado>>(){}.getType();
        RuntimeTypeAdapterFactory<Empleado> empleadoAdapter = RuntimeTypeAdapterFactory.of(Empleado.class, "type");
        empleadoAdapter.registerSubtype(EmpleadoFijo.class, "Empleado Fijo");
        empleadoAdapter.registerSubtype(EmpleadoEventual.class, "Empleado Eventual");
        GsonBuilder builder=new GsonBuilder();
        builder.setPrettyPrinting();
        builder.registerTypeAdapterFactory(empleadoAdapter);
        Gson gson=builder.create();
         try(BufferedWriter fichero=Files.newBufferedWriter(path)){
        gson.toJson(listado,tipo,fichero);
        n=listado.size();
        } catch (IOException ex) {
            System.out.println(ex);
        }
         return n;
    }

}
