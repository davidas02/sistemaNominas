/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
import javax.swing.table.AbstractTableModel;
import modelo.EmpleadoEventual;
import modelo.EmpleadoFijo;

/**
 *
 * @author daw1
 */
class EmpleadoTableModel extends AbstractTableModel{
    private List<Empleado> listado;
    private String[] columnas;

    public EmpleadoTableModel() {
        listado=new ArrayList<>();
        columnas=new String[]{"DNI","NOMBRE","SALARIO","HORAS","INGRESOS"};
    }

    public void setListado(List<Empleado> listado) {
        this.listado = listado;
        this.fireTableDataChanged();
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
           case 0:o=e.getDni().toString();
            break;
           case 1:o=e.getNombre();
            break;
           case 2:if(e instanceof EmpleadoFijo){
                        o=((EmpleadoFijo)e).getSalario();
                    }else{
                            o=((EmpleadoEventual)e).getSalarioHora();
                            }
           break;
           case 3:o=null;
           break;
           case 4: o=null;
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
            case 2: clase=float.class;
            break;
            case 3:clase=int.class;
            break;
            case 4:clase=float.class;
        }
               return clase;
    }

    public String getColumnName(int column) {
        return columnas[column];
    }
    
}
