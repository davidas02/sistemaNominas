/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.*;

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

    public void crearEmpleados() {
        String dni, nombre, tipo;
        float salario;
        int horas;
        Empleado e = null;

        dni = vista.getDni();
        nombre = vista.getNombre();
        tipo = vista.getTipo();
        salario = vista.getSalario();
        if (tipo.equals("FIJO")) {
            try {
                e = new EmpleadoFijo(new Dni(dni), nombre, salario);
            } catch (DniException ex) {
                vista.mostrarMensaje(ex.getMessage());
            }
        } else {
            try {
                horas = vista.getHoras();
                e = new EmpleadoEventual(new Dni(dni), nombre, salario, horas);
            } catch (DniException ex) {
                vista.mostrarMensaje(ex.getMessage());
            }
        }
        vista.mostrarIngresos(e.ingresos());
        if (modelo.incluirEmpleado(e)) {
            vista.listarEmpleados(modelo.listarEmpleados());
            vista.mostrarMensaje("Empleado incluido en el sistema");
        } else {
            vista.mostrarMensaje("No se ha podido incluir al empleado en el sistema");
        }
        
    }

    public void buscarEmpleado() {
        String dni;
        Empleado e;

        dni = vista.getDni();
        e = modelo.getEmpleado(dni);
        if (dni != null) {
            vista.mostrarNombre(e.getNombre());
            if (e instanceof EmpleadoFijo) {
                vista.mostrarTipo("FIJO");
                vista.mostrarSalario(((EmpleadoFijo) e).getSalario());
            } else {
                vista.mostrarTipo("Eventual");
                vista.mostrarSalario((float) ((EmpleadoEventual) e).getSalarioHora());
                vista.mostrarHoras(((EmpleadoEventual) e).getHoras());
            }
        } else {
            vista.mostrarMensaje("No existe empleado con ese DNI");
        }
    }

    public void borrarEmpleado() {
        String dni = vista.getDni();
        Empleado empleado;
        empleado = modelo.getEmpleado(dni);
        if (empleado != null) {
            if (modelo.eliminarEmpleado(empleado)) {
                vista.mostrarMensaje("Empleado Eliminado");
            } else {
                vista.mostrarMensaje("No se ha podido eliminar el empleado");
            }
        }else{
            vista.mostrarMensaje("No existe el empleado");
        }
    }

    public void modficarEmpleado() {
        String dni;
        Empleado empleado;
        String nombre,tipo;
        Float salario;
        dni=vista.getDni();
        empleado=modelo.getEmpleado(dni);
        if(empleado!=null){
        nombre=vista.getNombre();
        tipo=vista.getTipo();
        if(tipo.equals("FIJO")){
        ((EmpleadoFijo)empleado).setSalario(vista.getSalario());
        }else{
            ((EmpleadoEventual)empleado).setSalarioHora(vista.getSalario());
            ((EmpleadoEventual)empleado).setHoras(vista.getHoras());
        }
        vista.mostrarIngresos(empleado.ingresos());
        
        }else{
            vista.mostrarMensaje("No existe el empleado");
        }
        
    }

    public void listarEmpleados() {
        String orden=vista.getOrden(); 
        List<Empleado> listado=null;
        switch(orden){
            case "DNI":
               listado=modelo.listarEmpleados();
                break;
            case "INGRESOS":
                    listado=modelo.listarEmpleadosPorSueldo();
                    break;
            case "NOMBRE":
                listado=modelo.listarEmpleados();
                Collections.sort(listado,new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
                
                break;
        }
        vista.listarEmpleados(modelo.listarEmpleados());
    }

    public void guardarEmpleados() {

    }

    public void cargarEmpleados() {
        String archivo;
        EmpleadoDao empleadoDao;
    }

    public void iniciar() {
        vista.mostrar();

    }

    public static EmpleadoDao getDao(String archivo) {
        String extension = archivo.substring(archivo.lastIndexOf(".") + 1);
        switch (extension) {
            case "obj":
                return (new EmpleadoObj(archivo));
            case "csv":
                return (new EmpleadoCsv(archivo));
            case "json":
                return (new EmpleadoJson(archivo));
            case "xml":
                return (new EmpleadoXml(archivo));
        }
        return null;
    }
}
