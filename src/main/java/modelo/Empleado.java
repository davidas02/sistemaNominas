/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author daw1
 */
public abstract class Empleado implements Comparable<Empleado> {
    private String dni;
    private String nombre;

    public Empleado(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return dni + ", " + nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Empleado o) {
       return this.dni.compareTo(o.dni);
    }
    public abstract float ingresos();
    private boolean esDniValido(String dni){
        boolean esValido=false;
        int resto;
        String letras="TRAGMYFPDXBNJZSQVLCKE";
        char letra;
    String er="([0-9]{8}([A-Z]))";
    Pattern p=Pattern.compile(er);
    Matcher m=p.matcher(dni);
    resto=Integer.parseInt(m.group(1))%23;
    letra=letras.charAt(resto);
    if (letra==dni.charAt(8)){
        esValido=true;
    }
    return esValido;
    }
}
