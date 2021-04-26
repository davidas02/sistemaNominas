/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.sistemanominas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author daw1
 */
public class ComparadorSueldo implements Comparator<Empleado>{
    public int compare(Empleado e1, Empleado e2) {
        int salida = 0;
        float ingresos1, ingresos2;
        ingresos1 = e1.ingresos();
        ingresos2 = e2.ingresos();
        if (ingresos1 < ingresos2) {
            salida = -1;
        } else {
            if (ingresos1 > ingresos2) {
                salida = 1;
            }
        }
        return 0;
    }
}
