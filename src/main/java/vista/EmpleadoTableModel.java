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

    @Override
    public int getColumnCount() {
       return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Empleado e=listado.get(rowIndex);
        Object o=null;
        switch(columnIndex){
           case 0:o=e.getCodigo();
            break;
           case 1:o=e.getTitular();
            break;
           case 2:o=e.getSaldo();
           break;
        }
        return o;
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class<?> clase=null;
        switch(columnIndex){
            case 0: clase=String.class;
            break;
            case 1: clase=String.class;
            break;
            case 2: clase=Float.class;
        }
               return clase;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    
}
