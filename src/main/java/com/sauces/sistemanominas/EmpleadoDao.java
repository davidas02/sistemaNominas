/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.sistemanominas;

import java.util.List;

/**
 *
 * @author daw1
 */
public interface EmpleadoDao {
List<Empleado> listar() throws DaoException;
int insertar(List<Empleado> listado) throws DaoException;
}
