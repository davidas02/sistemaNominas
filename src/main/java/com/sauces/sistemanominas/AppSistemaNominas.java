package com.sauces.sistemanominas;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daw1
 */
public class AppSistemaNominas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SistemaNominas sn = new SistemaNominas();
        Scanner teclado = new Scanner(System.in);
        String dni, nombre;
        float salario, salarioHora;
        int horas;
        int opcion1, opcion2;
        Empleado e = null;
        do {
            System.out.println("1- Crear Empleado Fijo");
            System.out.println("2- Crear Empleado Eventual");
            System.out.println("3- Consultar empleado");
            System.out.println("4- Eliminar Empleado");
            System.out.println("5- listar empleados");
            System.out.println("6- Listar empleados por sueldo");
            System.out.println("7- Consultar total salarios");
            System.out.println("8- Guardar Empleados");
            System.out.println("9- Cargar Empleados");
            System.out.println("0- Cerrar");
            System.out.println("Seleccione opcion");
            opcion1 = teclado.nextInt();

            teclado.nextLine();
            switch (opcion1) {
                case 1:
                    System.out.println("Introduzca dni");
                    dni = teclado.nextLine();
                    System.out.println("Introduzca nombre del empleado");
                    nombre = teclado.nextLine();
                    System.out.println("Introduce salario del empleado");
                    salario = teclado.nextFloat();
                    teclado.nextLine();
                    e = new EmpleadoFijo(dni, nombre, salario);
                    if (sn.incluirEmpleado(e)) {
                        System.out.println("El empleado se ha incluido correctamente");
                    } else {
                        System.out.println("El empleado no se ha incluido");
                    }
                    break;
                case 2:
                    System.out.println("Introduzca dni");
                    dni = teclado.nextLine();
                    System.out.println("Introduzca nombre del empleado");
                    nombre = teclado.nextLine();
                    System.out.println("Introduce salario del empleado");
                    salarioHora = teclado.nextFloat();
                    teclado.nextLine();
                    System.out.println("Introduce las horas trabajadas del empleado");
                    horas = teclado.nextInt();
                    teclado.nextLine();
                    e = new EmpleadoEventual(dni, nombre, salarioHora, horas);
                    if (sn.incluirEmpleado(e)) {
                        System.out.println("El empleado se ha incluido correctamente");
                    } else {
                        System.out.println("El empleado no se ha incluido");
                    }
                    break;
                case 3:
                    System.out.println("Introduce el dni a buscar");
                    dni = teclado.nextLine();
                    e = sn.getEmpleado(dni);
                    if (dni != null) {
                        System.out.println(e);
                    } else {
                        System.out.println("No existe empleado con ese DNI");
                    }
                    break;
                case 4:
                    sn.eliminarEmpleado(e);
                    break;
                case 5:
                    System.out.println(sn.listarEmpleados());
                    break;
                case 6:
                    for (Empleado empleado : sn.listarEmpleadosPorSueldo()) {
                        System.out.println(sn.listarEmpleadosPorSueldo());
                    }
                    break;
                case 7:
                    System.out.println("El total de los salarios es " + sn.getTotalSalarios());
                    break;
                case 8:
                    System.out.println("Introduce el nombre del archivo");
                    String nombreArchivo = teclado.nextLine();
                    String extension = "csv";
                    switch (extension) {
                        case "csv":
                            EmpleadoDao empleadoDao = new EmpleadoCsv(nombreArchivo);
                            break;
                        case "obj":
                            break;
                        case "json":
                            break;
                        case "xml":
                            break;
                    }
                    if (EmpleadoDao != null) {
                        try {
                            sn.setEmpleadoDao(EmpleadoDao);
                            n = sn.cargarEmpleados();
                        }
                    }
                    break;
                case 9:
                    System.out.println("Introduce el nombre del archivo");
                    nombreArchivo = teclado.nextLine();
                    extension = "csv";
                    switch (extension) {
                        case "csv":
                            EmpleadoDao empleadoDao = new EmpleadoCsv(nombreArchivo);
                            break;
                        case "obj":
                            break;
                        case "json":
                            break;
                        case "xml":
                            break;
                    }
                    break;
            }
        } while (opcion1 != 0);
        System.out.println("Hasta luego");
    }
}
