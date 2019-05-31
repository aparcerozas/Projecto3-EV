package tiendaUI;

import Excepciones.Excepcion_Definida;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tienda.dto.Producto;
import tienda.jdbc.CarroDaoJDBC;
import tienda.jdbc.TiendaDaoJDBC;
import utilities.IO;

/**
 *
 * @author finfanterodal
 */
public class ClienteTienda extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public ClienteTienda() {
        initComponents();
        cargarTablaCatalogo();
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
        añadirB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carroTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        catalogoTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eliminarB = new javax.swing.JButton();
        confirmarB = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        quitarB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        añadirB.setText("Añadir");
        añadirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirBActionPerformed(evt);
            }
        });

        carroTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "nº Unidades", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(carroTable);

        catalogoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "nº Unidades", "Tipo"
            }
        ));
        jScrollPane2.setViewportView(catalogoTable);

        jLabel1.setText("Catálogo:");

        jLabel2.setText("Carro:");

        eliminarB.setText("Eliminar");
        eliminarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBActionPerformed(evt);
            }
        });

        confirmarB.setText("Confirmar");
        confirmarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        quitarB.setText("Quitar Unidades");
        quitarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(añadirB)
                        .addGap(45, 45, 45)
                        .addComponent(eliminarB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quitarB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(refresh)
                        .addGap(18, 18, 18)
                        .addComponent(confirmarB))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirB)
                    .addComponent(eliminarB)
                    .addComponent(confirmarB)
                    .addComponent(refresh)
                    .addComponent(quitarB))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirBActionPerformed
        TiendaDaoJDBC tienda = new TiendaDaoJDBC();
        CarroDaoJDBC carro = new CarroDaoJDBC();
        int fila = catalogoTable.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada");
        } else {
            try {
                int numUnidades = IO.introducirInt(IO.VENTANA, "Introduce la cantidad que deseas:");
                Producto product1 = new Producto(String.valueOf(catalogoTable.getValueAt(fila, 0)), Double.parseDouble(catalogoTable.getValueAt(fila, 1).toString()), Integer.parseInt(catalogoTable.getValueAt(fila, 2).toString()), String.valueOf(catalogoTable.getValueAt(fila, 3)));
                Producto product2 = new Producto(catalogoTable.getValueAt(fila, 0).toString(), Double.parseDouble(catalogoTable.getValueAt(fila, 1).toString()), Integer.parseInt(catalogoTable.getValueAt(fila, 2).toString()) - numUnidades, catalogoTable.getValueAt(fila, 3).toString());
                excepcionAñadirUnidades(product1, numUnidades);
                if (numUnidades == product1.getNumUnid()) {
                    tienda.deleteProducto(product1.getNome());
                    carro.insertProducto(product1, numUnidades);
                } else if (numUnidades != product1.getNumUnid()) {
                    IO.devolver(IO.VENTANA, product1.toString());
                    tienda.updateProducto(product2);
                    carro.insertProducto(product1, numUnidades);
                }
            } catch (Excepcion_Definida e) {
                IO.devolver(IO.VENTANA, e.getMessage());
            }
            cargarTablaCatalogo();
            cargarTablaCarro();
        }

    }//GEN-LAST:event_añadirBActionPerformed

    private void eliminarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBActionPerformed
        CarroDaoJDBC carro = new CarroDaoJDBC();
        TiendaDaoJDBC tienda = new TiendaDaoJDBC();
        int fila = carroTable.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada");
        } else {
            Producto product1 = new Producto(String.valueOf(carroTable.getValueAt(fila, 0)), Double.parseDouble(carroTable.getValueAt(fila, 1).toString()), Integer.parseInt(carroTable.getValueAt(fila, 2).toString()), String.valueOf(carroTable.getValueAt(fila, 3)));
            Producto productoaux = tienda.buscarProducto(product1.getNome());
            Producto product2;
            if (productoaux != null) {
                product2 = new Producto(carroTable.getValueAt(fila, 0).toString(), Double.parseDouble(carroTable.getValueAt(fila, 1).toString()), productoaux.getNumUnid() + product1.getNumUnid(), carroTable.getValueAt(fila, 3).toString());
                tienda.updateProducto(product2);
            } else {
                product2 = new Producto(carroTable.getValueAt(fila, 0).toString(), Double.parseDouble(carroTable.getValueAt(fila, 1).toString()), product1.getNumUnid(), carroTable.getValueAt(fila, 3).toString());
                tienda.insertProducto(product2);
            }
            int rows = carro.deleteProducto(product1.getNome());
            IO.devolver(IO.VENTANA, "Registros borrados correctamente: " + rows);

            cargarTablaCatalogo();
            cargarTablaCarro();
        }

    }//GEN-LAST:event_eliminarBActionPerformed

    private void confirmarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBActionPerformed


    }//GEN-LAST:event_confirmarBActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        cargarTablaCatalogo();
        cargarTablaCarro();
    }//GEN-LAST:event_refreshActionPerformed

    private void quitarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarBActionPerformed
        CarroDaoJDBC carro = new CarroDaoJDBC();
        TiendaDaoJDBC tienda = new TiendaDaoJDBC();
        int numUnidades = IO.introducirInt(IO.VENTANA, "Introduce la cantidad que deseas quitar:");
        try {
            int fila = carroTable.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada");
            } else {
                Producto product1 = new Producto(String.valueOf(carroTable.getValueAt(fila, 0)), Double.parseDouble(carroTable.getValueAt(fila, 1).toString()), Integer.parseInt(carroTable.getValueAt(fila, 2).toString()), String.valueOf(carroTable.getValueAt(fila, 3)));
                Producto productoaux = tienda.buscarProducto(product1.getNome());
                Producto product2;
                int rows = 0;
                excepcionAñadirUnidades(product1, numUnidades);
                if (productoaux != null) {
                    product2 = new Producto(carroTable.getValueAt(fila, 0).toString(), Double.parseDouble(carroTable.getValueAt(fila, 1).toString()), productoaux.getNumUnid() + numUnidades, carroTable.getValueAt(fila, 3).toString());
                    tienda.updateProducto(product2);
                } else {
                    product2 = new Producto(carroTable.getValueAt(fila, 0).toString(), Double.parseDouble(carroTable.getValueAt(fila, 1).toString()), product1.getNumUnid(), carroTable.getValueAt(fila, 3).toString());
                    tienda.insertProducto(product2);
                }
                if (product1.getNumUnid() != numUnidades) {
                    product2 = new Producto(carroTable.getValueAt(fila, 0).toString(), Double.parseDouble(carroTable.getValueAt(fila, 1).toString()), product1.getNumUnid() - numUnidades, carroTable.getValueAt(fila, 3).toString());
                    rows = carro.updateProducto(product2);
                } else {
                    rows = carro.deleteProducto(product1.getNome());
                }

                IO.devolver(IO.VENTANA, "Registros borrados correctamente: " + rows);
            }
        } catch (Excepcion_Definida e) {
            IO.devolver(IO.VENTANA, e.getMessage());
        }
        cargarTablaCatalogo();
        cargarTablaCarro();


    }//GEN-LAST:event_quitarBActionPerformed

    /**
     * Recojo los datos del ArrayList actualizado y los añado a la tabla de la
     * interfaz.
     */
    public void cargarTablaCatalogo() {

        //Cargamos la tabla de la interfaz con los datos de la base que están almacenados en un Array
        TiendaDaoJDBC tienda = new TiendaDaoJDBC();
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
    public void cargarTablaCarro() {

        //Cargamos la tabla de la interfaz con los datos de la base que están almacenados en un Array
        CarroDaoJDBC carro = new CarroDaoJDBC();
        DefaultTableModel mode2 = (DefaultTableModel) carroTable.getModel();
        ArrayList<Producto> product = carro.refreshArrayProductoCarro();
        mode2.setRowCount(0);
        for (int j = 0; j < product.size(); j++) {
            Object[] row = {product.get(j).getNome(), product.get(j).getPrecio(), product.get(j).getNumUnid(), product.get(j).getTipo()};
            mode2.addRow(row);
        }

    }

    //Trata que el número de unidades no pueda ser negativo y que elnúmero de unidades que queramos añadir al carro no pueda ser mayor de las unidades que hay en el catalogo.
    public void excepcionAñadirUnidades(Producto product, int numUnid) throws Excepcion_Definida {
        if (product.getNumUnid() < numUnid & numUnid > 0) {
            throw new Excepcion_Definida("Esa cantidad es mayor de la que hay en la tienda.");
        } else if (numUnid < 0) {
            throw new Excepcion_Definida("Esa cantidad no puede ser negativa.");
        }
    }

    //Trata que el número de unidades que queremos quitar no sea mayor del que hay y que este no sea un número negativo.
    public void excepcionQuitarUnidades(Producto product, int numUnid) throws Excepcion_Definida {
        if (product.getNumUnid() < numUnid) {
            throw new Excepcion_Definida("Esa cantidad es mayor de la que hay en el carro.");
        } else if (numUnid < 0) {
            throw new Excepcion_Definida("Esa cantidad no puede ser negativa.");
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
            java.util.logging.Logger.getLogger(ClienteTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirB;
    private javax.swing.JTable carroTable;
    private javax.swing.JTable catalogoTable;
    private javax.swing.JButton confirmarB;
    private javax.swing.JButton eliminarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton quitarB;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
