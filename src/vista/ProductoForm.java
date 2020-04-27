
package vista;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Producto;
import modelo.ProductoBD;
import static vista.VentasForm.spnCant;
import static vista.VentasForm.txtCodProd;
import static vista.VentasForm.txtPrecio;
import static vista.VentasForm.txtProd;
import static vista.VentasForm.txtStock;


public class ProductoForm extends javax.swing.JInternalFrame {

    Producto p = new Producto();
    ProductoBD pbd = new ProductoBD();
    
    
    
    DefaultTableModel modelo = new DefaultTableModel();
    int codProd;
    public String NombreSelec;
    public String CodigoSelec;
    public String PrecioSelec;
    public String StockSelec;
    TableRowSorter trs;
    
    public ProductoForm() {
        initComponents();
        listar();
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtNombreProd = new javax.swing.JTextField();
        txtCodigoProd = new javax.swing.JTextField();
        txtPcio = new javax.swing.JTextField();
        txtStockProd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setTitle("Producto");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMaximumSize(new java.awt.Dimension(560, 520));
        setMinimumSize(new java.awt.Dimension(560, 520));
        setPreferredSize(new java.awt.Dimension(560, 520));
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CÓDIGO:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRECIO:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STOCK:");

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 102, 204));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 102, 204));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnAct.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAct.setForeground(new java.awt.Color(0, 102, 204));
        btnAct.setText("Actualizar");
        btnAct.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 102, 204));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtNombreProd.setBackground(new java.awt.Color(153, 153, 153));
        txtNombreProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreProdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProdKeyTyped(evt);
            }
        });

        txtCodigoProd.setBackground(new java.awt.Color(153, 153, 153));

        txtPcio.setBackground(new java.awt.Color(153, 153, 153));

        txtStockProd.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MARCA:");

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Small", "Reef", "Pampero" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPcio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtStockProd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoProd))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMarca, 0, 82, Short.MAX_VALUE)))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtPcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStockProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tablaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nombre", "Precio", "Stock", "Marca"
            }
        ));
        tablaProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProd);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 102, 204));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 102, 204));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tablaProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProdMouseClicked
        int fila = tablaProd.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            codProd = Integer.parseInt(tablaProd.getValueAt(fila,0).toString());
            String nomProd = tablaProd.getValueAt(fila,1).toString();
            double pcio = Double.parseDouble(tablaProd.getValueAt(fila,2).toString());
            int stock = Integer.parseInt(tablaProd.getValueAt(fila,3).toString());
            String marca= tablaProd.getValueAt(fila,4).toString();
            txtNombreProd.setText(nomProd);
            txtCodigoProd.setText(""+codProd);
            txtPcio.setText(""+pcio);
            txtStockProd.setText(""+stock);
            cmbMarca.setSelectedItem(marca);
        }
    }//GEN-LAST:event_tablaProdMouseClicked

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnActActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtNombreProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProdKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProdKeyReleased

    // Filtro de búsqueda
    private void txtNombreProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProdKeyTyped
        
        txtNombreProd.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent k) {
                // (?i) insensitive, para filtrar mayusc y minusc
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtNombreProd.getText(),1));
            }
        });
        
        trs = new TableRowSorter(modelo);
        tablaProd.setRowSorter(trs);
    }//GEN-LAST:event_txtNombreProdKeyTyped

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        NombreSelec = txtNombreProd.getText();
        CodigoSelec = txtCodigoProd.getText();
        PrecioSelec = txtPcio.getText();
        StockSelec = txtStockProd.getText();
        this.setVisible(false);  
        
        txtCodProd.setText(""+CodigoSelec);
        txtProd.setText(""+NombreSelec);
        txtPrecio.setText(""+PrecioSelec);
        txtStock.setText(""+StockSelec);
        spnCant.setValue(1);
    }//GEN-LAST:event_btnAceptarActionPerformed

    
    void listar(){
        
        List<Producto> lista = pbd.listar();
        modelo = (DefaultTableModel)tablaProd.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
        ob[0]= lista.get(i).getIdProd();
        ob[1]= lista.get(i).getNom();
        ob[2]= lista.get(i).getPcio();
        ob[3]= lista.get(i).getStock();
        ob[4]= lista.get(i).getMarca();
        modelo.addRow(ob);
        }
        tablaProd.setModel(modelo);
        
    }

    void agregar(){
        
            String nomProd = txtNombreProd.getText();        
            int idProd = Integer.parseInt(txtCodigoProd.getText());
            double precio = Double.parseDouble(txtPcio.getText());
            int stock = Integer.parseInt(txtStockProd.getText());
            String marca = cmbMarca.getSelectedItem().toString();
            Object[] ob = new Object[5];
            ob[0] = idProd;
            ob[1] = nomProd;
            ob[2] = precio;
            ob[3] = stock;
            ob[4] = marca;
            pbd.add(ob); 
            
    }
    
    void limpiarTabla() {
        
         for (int i=0; i < modelo.getRowCount(); i++) {
             modelo.removeRow(i);
             i= i-1;
         }
     }
    
    
    void actualizar() {
        int fila = tablaProd.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        } else {
            codProd = Integer.parseInt(txtCodigoProd.getText());
            String nomProd = txtNombreProd.getText();
            double pcio = Double.parseDouble(txtPcio.getText());
            int stock = Integer.parseInt(txtStockProd.getText());
            String est = cmbMarca.getSelectedItem().toString();
            Object[] obj = new Object[5];
            obj[0] = nomProd;
            obj[1] = pcio;
            obj[2] = stock;
            obj[3] = est;
            obj[4] = codProd;
            pbd.actualizar(obj);
        }
    }
    
        void eliminar(){
        int fila = tablaProd.getSelectedRow();
        int idProd = Integer.parseInt(tablaProd.getValueAt(fila, 0).toString()); 
        if(fila==-1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            pbd.eliminar(idProd);
        }
    }
        
        void nuevo(){
        txtNombreProd.setText("");
        txtCodigoProd.setText("");
        txtStockProd.setText("");
        txtPcio.setText("");
        cmbMarca.setSelectedItem(0);
        txtNombreProd.requestFocus();    
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProd;
    private javax.swing.JTextField txtCodigoProd;
    private javax.swing.JTextField txtNombreProd;
    private javax.swing.JTextField txtPcio;
    private javax.swing.JTextField txtStockProd;
    // End of variables declaration//GEN-END:variables
}
