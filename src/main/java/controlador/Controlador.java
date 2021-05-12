/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.SistemaNominas;
import vista.Ventana;

/**
 *
 * @author PC
 */
public class Controlador {
    private SistemaNominas modelo;
    private Ventana vista;

    public Controlador(SistemaNominas modelo, Ventana vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void crearEmpleado(){
    
    }
    public void buscarEmpleado(){
    
    }
    public void eliminarEmpleado(){
    
    }
    public void modficarEmpleado(){
        
    }
    public void listarEmpleados(){
        
    }
    public void guardarEmpleados(){
        
    }
    public void cargarEmpleados(){
        
    }
    public void iniciar(){
        vista.setVisible(true);
    
    }
}
