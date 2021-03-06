package tiendaUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tienda.dto.Producto;
import tienda.jdbc.MetodosUsuario;
import tienda.jdbc.TiendaDaoJDBC;
import utilities.IO;

/**
 *
 * @author finfanterodal
 */
public class AdministracionTienda extends javax.swing.JFrame {

    //
    TiendaDaoJDBC tienda = new TiendaDaoJDBC();

    /**
     * Creates new form AdministracionTienda
     */
    public AdministracionTienda() {
        initComponents();
        this.setTitle("Administración tienda.");
        this.setLocation(400, 300);
        cargarTablaCatalogo();
        cargarTablaUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        catalogoTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        valorNom = new javax.swing.JTextField();
        valorPrecio = new javax.swing.JTextField();
        valorUnidades = new javax.swing.JTextField();
        añadirB = new javax.swing.JButton();
        eliminarB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        modificarB = new javax.swing.JButton();
        tipoCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuariosTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        catalogoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "nº Unidades", "Tipo"
            }
        ));
        jScrollPane2.setViewportView(catalogoTable);

        jLabel1.setText("Productos en Tienda:");

        añadirB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        añadirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirBActionPerformed(evt);
            }
        });

        eliminarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro (1).png"))); // NOI18N
        eliminarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        jLabel4.setText("nºUnidades");

        jLabel5.setText("Tipo");

        modificarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pruebas.png"))); // NOI18N
        modificarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBActionPerformed(evt);
            }
        });

        tipoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ropa", "Alimento", "Electronica", "Higiene", "Deporte", "Informatica" }));

        usuariosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuarios"
            }
        ));
        jScrollPane1.setViewportView(usuariosTable);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/espalda.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 603, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorNom, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorUnidades))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(añadirB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eliminarB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificarB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(eliminarB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(valorNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valorPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valorUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(añadirB)
                                    .addComponent(jButton1)
                                    .addComponent(modificarB))))))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirBActionPerformed

        try {
            String tipo = tienda.selectTipo(tipoCombo.getSelectedIndex());
            int rows = tienda.insertProducto(new Producto(valorNom.getText(), Double.parseDouble(valorPrecio.getText()), Integer.parseInt(valorUnidades.getText()), tipo));
            IO.devolver(IO.VENTANA, "Registros insertados correctamente: " + rows);
        } catch (NullPointerException e) {
            IO.devolver(IO.VENTANA, "No has introducido valores.");
        } catch (NumberFormatException ex) {
            IO.devolver(IO.VENTANA, "No has introducido bien valores.");
        }
        cargarTablaCatalogo();
    }//GEN-LAST:event_añadirBActionPerformed

    private void eliminarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBActionPerformed

        int fila = catalogoTable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada");
        } else {
            String nombre = catalogoTable.getValueAt(fila, 0).toString();
            int rows = tienda.deleteProducto(nombre);
            IO.devolver(IO.VENTANA, "Registros borrados correctamente: " + rows);
            cargarTablaCatalogo();
        }
    }//GEN-LAST:event_eliminarBActionPerformed

    private void modificarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBActionPerformed

        int fila = catalogoTable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada");
        } else {
            String nombre = catalogoTable.getValueAt(fila, 0).toString();
            double precio = IO.introducirDouble(IO.VENTANA, "Nuevo precio del producto:");
            int numUnidades = IO.introducirInt(IO.VENTANA, "Cantidad que deseas introducir.");
            String tipo = catalogoTable.getValueAt(fila, 3).toString();
            int rows = tienda.updateProducto(new Producto(nombre, precio, numUnidades, tipo));
            IO.devolver(IO.VENTANA, "Registros modificados correctamente: " + rows);
            cargarTablaCatalogo();
        }

    }//GEN-LAST:event_modificarBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.setVisible(false);
    Usuario user=new Usuario();
    user.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
  
    /**
     * Recojo los datos del ArrayList actualizado y los añado a la tabla de la
     * interfaz.
     */
    public void cargarTablaCatalogo() {

        //Cargamos la tabla de la interfaz con los datos de la base que están almacenados en un Array
        DefaultTableModel model = (DefaultTableModel) catalogoTable.getModel();
        ArrayList<Producto> product = tienda.refreshArrayProductoTienda();
        model.setRowCount(0);
        for (int j = 0; j < product.size(); j++) {
            Object[] row = {product.get(j).getNome(), product.get(j).getPrecio(), product.get(j).getNumUnid(), product.get(j).getTipo()};
            model.addRow(row);
        }

    }

    /**
     * Recojo los datos del ArrayList actualizado y los añado a la tabla de la
     * interfaz.
     */
    public void cargarTablaUsuarios() {

        //Cargamos la tabla de la interfaz con los datos de la base que están almacenados en un Array
        MetodosUsuario user = new MetodosUsuario();
        DefaultTableModel model = (DefaultTableModel) usuariosTable.getModel();
        ArrayList<String> usuarios = user.buscarUsuarios();
        model.setRowCount(0);
        for (int j = 0; j < usuarios.size(); j++) {
            Object[] row = {usuarios.get(j).toString()};
            model.addRow(row);
        }

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
            java.util.logging.Logger.getLogger(AdministracionTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracionTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracionTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracionTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministracionTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirB;
    private javax.swing.JTable catalogoTable;
    private javax.swing.JButton eliminarB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificarB;
    private javax.swing.JComboBox<String> tipoCombo;
    private javax.swing.JTable usuariosTable;
    private javax.swing.JTextField valorNom;
    private javax.swing.JTextField valorPrecio;
    private javax.swing.JTextField valorUnidades;
    // End of variables declaration//GEN-END:variables
}
