/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import modelo.Empleado;

/**
 *
 * @author daw1
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }
    private Controlador controlador;
    private DialogoEmpleado dialogo = new DialogoEmpleado(this, true);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gBotones = new javax.swing.ButtonGroup();
        selectorFicheros = new javax.swing.JFileChooser();
        panelDatos = new javax.swing.JPanel();
        lDni = new javax.swing.JLabel();
        tDni = new javax.swing.JTextField();
        lNombre = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        lTipo = new javax.swing.JLabel();
        liTipo = new javax.swing.JComboBox<>();
        lSalario = new javax.swing.JLabel();
        lIngresos = new javax.swing.JLabel();
        tIngresos = new javax.swing.JTextField();
        bBorrar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        lHoras = new javax.swing.JLabel();
        sHoras = new javax.swing.JSpinner();
        tSalario = new javax.swing.JFormattedTextField();
        panelListado = new javax.swing.JPanel();
        bListarEmpleados = new javax.swing.JButton();
        lOrder = new javax.swing.JLabel();
        bOrderDni = new javax.swing.JRadioButton();
        bOrderNombre = new javax.swing.JRadioButton();
        bOrderIngresos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        menuSuperior = new javax.swing.JMenuBar();
        miArchivo = new javax.swing.JMenu();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();
        miEmpleado = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        miBuscar = new javax.swing.JMenuItem();

        selectorFicheros.setCurrentDirectory(new java.io.File("D:\\Programación\\sistemaNominas\\src"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Empleado"));

        lDni.setText("DNI");

        tDni.setEditable(false);
        tDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDniActionPerformed(evt);
            }
        });

        lNombre.setText("NOMBRE");

        tNombre.setEditable(false);

        lTipo.setText("TIPO");

        liTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIJO", "EVENTUAL" }));
        liTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liTipoActionPerformed(evt);
            }
        });

        lSalario.setText("SALARIO");

        lIngresos.setText("INGRESOS");

        tIngresos.setEditable(false);
        tIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tIngresosActionPerformed(evt);
            }
        });

        bBorrar.setText("BORRAR");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        bModificar.setText("MODIFICAR");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        lHoras.setText("HORAS");

        sHoras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(lIngresos)
                        .addGap(3, 3, 3)
                        .addComponent(tIngresos))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNombre)
                                    .addComponent(lDni))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tNombre)
                                    .addComponent(tDni)))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(bBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bModificar))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lTipo, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(liTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sHoras)
                                    .addComponent(tSalario))))))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDni)
                    .addComponent(tDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNombre)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSalario)
                    .addComponent(tSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lHoras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lIngresos)
                    .addComponent(tIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBorrar)
                    .addComponent(bModificar))
                .addContainerGap())
        );

        panelListado.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Empleados"));

        bListarEmpleados.setText("LISTAR EMPLEADOS");
        bListarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarEmpleadosActionPerformed(evt);
            }
        });

        lOrder.setText("ORDEN DEL LISTADO");

        gBotones.add(bOrderDni);
        bOrderDni.setSelected(true);
        bOrderDni.setText("DNI");
        bOrderDni.setActionCommand("dni");
        bOrderDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrderDniActionPerformed(evt);
            }
        });

        gBotones.add(bOrderNombre);
        bOrderNombre.setText("NOMBRE");
        bOrderNombre.setActionCommand("nombre");

        gBotones.add(bOrderIngresos);
        bOrderIngresos.setText("INGRESOS");
        bOrderIngresos.setActionCommand("ingresos");
        bOrderIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrderIngresosActionPerformed(evt);
            }
        });

        etm=new EmpleadoTableModel();
        tablaEmpleados.setModel(etm);
        jScrollPane1.setViewportView(tablaEmpleados);

        javax.swing.GroupLayout panelListadoLayout = new javax.swing.GroupLayout(panelListado);
        panelListado.setLayout(panelListadoLayout);
        panelListadoLayout.setHorizontalGroup(
            panelListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoLayout.createSequentialGroup()
                .addGroup(panelListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bOrderDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bOrderNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bOrderIngresos))
                    .addGroup(panelListadoLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(bListarEmpleados))
                    .addGroup(panelListadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelListadoLayout.setVerticalGroup(
            panelListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bListarEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(panelListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lOrder)
                    .addComponent(bOrderDni)
                    .addComponent(bOrderNombre)
                    .addComponent(bOrderIngresos))
                .addGap(224, 224, 224))
        );

        miArchivo.setText("Archivo");

        miAbrir.setText("Abrir");
        miAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAbrirActionPerformed(evt);
            }
        });
        miArchivo.add(miAbrir);

        miGuardar.setText("Guardar");
        miGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuardarActionPerformed(evt);
            }
        });
        miArchivo.add(miGuardar);

        menuSuperior.add(miArchivo);

        miEmpleado.setText("Empleado");

        miNuevo.setText("Nuevo");
        miNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNuevoActionPerformed(evt);
            }
        });
        miEmpleado.add(miNuevo);

        miBuscar.setText("Buscar");
        miBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarActionPerformed(evt);
            }
        });
        miEmpleado.add(miBuscar);

        menuSuperior.add(miEmpleado);

        setJMenuBar(menuSuperior);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelListado, javax.swing.GroupLayout.PREFERRED_SIZE, 399, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDniActionPerformed

    private void liTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liTipoActionPerformed

    private void tIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tIngresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tIngresosActionPerformed

    private void miGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarActionPerformed
        // TODO add your handling code here:
        if (selectorFicheros.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            int SAVE_DIALOG = JFileChooser.SAVE_DIALOG;
        }

    }//GEN-LAST:event_miGuardarActionPerformed

    private void miAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbrirActionPerformed
        // TODO add your handling code here:
        if (selectorFicheros.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            int OPEN_DIALOG = JFileChooser.OPEN_DIALOG;
        }
    }//GEN-LAST:event_miAbrirActionPerformed

    private void bOrderDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrderDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bOrderDniActionPerformed

    private void miNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNuevoActionPerformed
        // TODO add your handling code here:
        if (this.dialogo.mostrar() == DialogoEmpleado.ACEPTAR) {
            mostrarDni(dialogo.getDni());
            mostrarNombre(dialogo.getNombre());
            mostrarSalario(dialogo.getSalario());
            mostrarHoras(dialogo.getHoras());
            mostrarTipo(dialogo.getTipo());
            controlador.crearEmpleados();
        }
    }//GEN-LAST:event_miNuevoActionPerformed

    private void bListarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarEmpleadosActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_bListarEmpleadosActionPerformed

    private void miBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarActionPerformed
        // TODO add your handling code here:
        String dni = JOptionPane.showInputDialog("Introduce el dni del Empleado a buscar");
        if (dni != null) {
            limpiarCampos();
            mostrarDni(dni);
        }
    }//GEN-LAST:event_miBuscarActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        // TODO add your handling code here:
        if(this.tDni.getText().trim().length()>0){
            if (JOptionPane.showConfirmDialog(this, "¿Seguro?") == JOptionPane.OK_OPTION) {
                controlador.borrarEmpleado();
                limpiarCampos();
            }
        }
    }//GEN-LAST:event_bBorrarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bModificarActionPerformed

    private void bOrderIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrderIngresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bOrderIngresosActionPerformed

    public String getTipo() {
        return this.liTipo.toString();
    }

    public String getDni() {
        return this.tDni.getText();
    }

    public String getNombre() {
        return this.tNombre.getText();
    }

    public float getSalario() {
        return ((Number)this.tSalario.getValue()).floatValue();
    }

    public String getArchivo() {
        return selectorFicheros.getSelectedFile().getAbsolutePath();
    }

     public String getOrden(){
         return gBotones.getSelection().getActionCommand();
    }
    public void mostrarTipo(String tipo) {

    }

    public void mostrarDni(String dni) {
        this.tDni.setText(dni);
    }

    public void mostrarNombre(String nombre) {
        this.tNombre.setText(nombre);
    }

    public void mostrarSalario(float salario) {
        this.tSalario.setValue(salario);
    }

    public void mostrarHoras(int horas) {
        this.sHoras.setValue(horas);
    }

    public void mostrarIngresos(float ingresos) {
        this.tIngresos.setText(Float.toString(ingresos));
    }

    public void listarEmpleados(List<Empleado> listado) {
        etm.setListado(listado);
        tablaEmpleados.revalidate();
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public int getHoras() {
        return (int) sHoras.getValue();
    }

    //metodo que permite fijar el controlador
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void limpiarCampos() {
        this.tDni.setText("");
        this.tIngresos.setText("");
        this.tNombre.setText("");
    }

    public void mostrar() {
        setVisible(true);
    }

    private void seleccionadoEmpleado(ListSelectionEvent e){
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bListarEmpleados;
    private javax.swing.JButton bModificar;
    private javax.swing.JRadioButton bOrderDni;
    private javax.swing.JRadioButton bOrderIngresos;
    private javax.swing.JRadioButton bOrderNombre;
    private javax.swing.ButtonGroup gBotones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lDni;
    private javax.swing.JLabel lHoras;
    private javax.swing.JLabel lIngresos;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lOrder;
    private javax.swing.JLabel lSalario;
    private javax.swing.JLabel lTipo;
    private javax.swing.JComboBox<String> liTipo;
    private javax.swing.JMenuBar menuSuperior;
    private javax.swing.JMenuItem miAbrir;
    private javax.swing.JMenu miArchivo;
    private javax.swing.JMenuItem miBuscar;
    private javax.swing.JMenu miEmpleado;
    private javax.swing.JMenuItem miGuardar;
    private javax.swing.JMenuItem miNuevo;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelListado;
    private javax.swing.JSpinner sHoras;
    private javax.swing.JFileChooser selectorFicheros;
    private javax.swing.JTextField tDni;
    private javax.swing.JTextField tIngresos;
    private javax.swing.JTextField tNombre;
    private javax.swing.JFormattedTextField tSalario;
    private EmpleadoTableModel etm;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables
}
