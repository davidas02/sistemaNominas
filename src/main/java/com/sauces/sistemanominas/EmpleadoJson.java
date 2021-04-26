/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.sistemanominas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.nio.file.*;
import java.util.List;

/**
 *
 * @author daw1
 */
public class EmpleadoJson implements EmpleadoDao {

    private Path path;

    public EmpleadoJson(Path path) {
        this.path = path;
    }

    @Override
    public List<Empleado> listar() throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(List<Empleado> listado) throws DaoException {
        //Definimos un tipo para poder trabajar con colecciones
        java.lang.reflect.Type tipo = new com.google.gson.reflect.TypeToken<List<Empleado>>() {
        }.getType();
        //registramos las clases hijas
        RuntimeTypeAdapterFactory<Empleado> empleadoAdapter = RuntimeTypeAdapterFactory.of(Empleado.class, "type");
        empleadoAdapter.registerSubtype(EmpleadoFijo.class, "Fijo");
        empleadoAdapter.registerSubtype(EmpleadoEventual.class, "Eventual");
        GsonBuilder builder=new GsonBuilder();
        builder.setPrettyPrinting();
        builder.registerTypeAdapterFactory(empleadoAdapter);
        Gson gson = builder.create();
        try(BufferedWriter fichero=files.newBufferedWriter(path))(Gson.toJson)
    }

}
