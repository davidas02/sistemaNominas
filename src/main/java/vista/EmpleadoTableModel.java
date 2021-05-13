/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;

/**
 *
 * @author daw1
 */
class EmpleadoTableModel {
    private List<Empleado> listado;
    private String[] columnas;

    public EmpleadoTableModel() {
        listado=new ArrayList<>();
        columnas=new String[]{"DNI","NOMBRE","TIPO","SALARIO","HORAS"};
    }

    public void setListado(List<Empleado> listado) {
        this.listado = listado;
    }
    public int getRowCount() {
        return listado.size();
    }

    public int getColumnCount() {
       return columnas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Empleado e=listado.get(rowIndex);
        Object o=null;
        switch(columnIndex){
           case 0:o=e.getDni();
            break;
           case 1:o=e.getNombre();
            break;
           case 2:o=e.getSalario();
           break;
           case 3:o=e.getHoras();
           break;
           case 4: o=e.getIngresos();
        }
        return o;
    }
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public Class<?> getColumnClass(int columnIndex) {
        Class<?> clase=null;
        switch(columnIndex){
            case 0: clase=String.class;
            break;
            case 1: clase=String.class;
            break;
            case 2: clase=String.class;
        }
               return clase;
    }

    public String getColumnName(int column) {
        return columnas[column];
    }
    
}
