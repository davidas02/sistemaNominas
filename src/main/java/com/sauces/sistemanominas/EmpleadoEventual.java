package com.sauces.sistemanominas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw1
 */
public class EmpleadoEventual extends Empleado {
    private float salarioHora;
    private int horas;

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public EmpleadoEventual( String dni, String nombre,float salarioHora, int horas) {
        super(dni, nombre);
        this.salarioHora = salarioHora;
        this.horas = horas;
    }
    @Override
    public String toString() {
        return super.toString()+", "+salarioHora+", "+horas; //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public float ingresos() {
       float ingresos=salarioHora*horas;
    return ingresos;
    }
}
