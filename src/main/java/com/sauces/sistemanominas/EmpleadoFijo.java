/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.sistemanominas;

/**
 *
 * @author David Aparicio
 */
public class EmpleadoFijo extends Empleado {
    private float salario;


    public EmpleadoFijo( String dni, String nombre,float salario) {
        super(dni, nombre);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
   
    @Override
    public String toString() {
        return super.toString()+","+salario; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public float ingresos() {
    return salario;
    }
}
