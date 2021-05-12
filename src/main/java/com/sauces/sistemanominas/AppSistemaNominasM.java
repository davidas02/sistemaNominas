/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.sistemanominas;

import controlador.Controlador;
import modelo.SistemaNominas;
import vista.Ventana;

/**
 *
 * @author daw1
 */
public class AppSistemaNominasM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       SistemaNominas sn = new SistemaNominas();
        Ventana vista=new Ventana();
        Controlador controlador=new Controlador(sn,vista);
        vista.setControlador(controlador);
        controlador.iniciar();
    }
    
}
