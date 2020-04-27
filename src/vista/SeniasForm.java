
package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Senias;
import modelo.SeniasBD;

public class SeniasForm extends javax.swing.JInternalFrame {
    
    Senias s = new Senias();
    SeniasBD sbd = new SeniasBD();
    VentasForm vf = new VentasForm();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public SeniasForm() {
        initComponents();
        listarSenias();
        txtFecha.setText(vf.fecha());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtVence = new javax.swing.JTextField();
        txtNomCli = new javax.swing.JTextField();
        txtNomProd = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtCodCli = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        txtSenia = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSenias = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hasta:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nom. Cliente:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cód. Cliente:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nom. Prod:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Seña ($):");

        btnEliminar.setForeground(new java.awt.Color(0, 102, 204));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setForeground(new java.awt.Color(0, 102, 204));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(0, 102, 204));
        jButton5.setText("Modificar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNomProd, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtFecha)
                            .addComponent(txtNomCli, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jButton5))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtVence, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(txtSenia)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(btnAgregar))
                        .addGap(90, 90, 90)))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtVence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(txtSenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVender.setForeground(new java.awt.Color(0, 102, 204));
        btnVender.setText("Generar Venta");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        tablaSenias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Vence", "Nombre", "Código", "Tel.", "Producto", "Cant", "Seña"
            }
        ));
        tablaSenias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSeniasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSenias);

        btnCancelar.setForeground(new java.awt.Color(0, 102, 204));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVender))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnVender))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiar();
        listarSenias();      
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiar();
        listarSenias();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaSeniasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSeniasMouseClicked
        int fila = tablaSenias.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            int FechaSelec = Integer.parseInt(tablaSenias.getValueAt(fila,0).toString());
            int VtoSelec = Integer.parseInt(tablaSenias.getValueAt(fila,1).toString());
            String NomSelec = tablaSenias.getValueAt(fila,2).toString();
            String CodSelec = tablaSenias.getValueAt(fila,3).toString();
            int TelSelec = Integer.parseInt(tablaSenias.getValueAt(fila,4).toString());
            String ProdSelec = tablaSenias.getValueAt(fila,5).toString();
            int CantSelec = Integer.parseInt(tablaSenias.getValueAt(fila,6).toString());
            int MontoSelec = Integer.parseInt(tablaSenias.getValueAt(fila,7).toString());
            txtFecha.setText(""+FechaSelec);
            txtVence.setText(""+VtoSelec);
            txtNomCli.setText(NomSelec);
            txtCodCli.setText(CodSelec);
            txtTel.setText(""+TelSelec);
            txtNomProd.setText(ProdSelec);
            txtCant.setText(""+CantSelec);
            txtSenia.setText(""+MontoSelec);
                   
        }
        
    }//GEN-LAST:event_tablaSeniasMouseClicked

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        this.setVisible(false);
        vf.setVisible(true);
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    void listarSenias(){
        List<Senias> lista = sbd.listar();
        modelo = (DefaultTableModel)tablaSenias.getModel();
        Object[] ob = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
        ob[0]= lista.get(i).getFecha();
        ob[1]= lista.get(i).getVence();
        ob[2]= lista.get(i).getNomCliente();
        ob[3]= lista.get(i).getCodCliente();
        ob[4]= lista.get(i).getTelefono();
        ob[5]= lista.get(i).getNomProd();
        ob[6]= lista.get(i).getCant();
        ob[7]= lista.get(i).getMontoSenia();
        modelo.addRow(ob);
        }
        tablaSenias.setModel(modelo);
        
    }
    
    void agregar(){
        
        String Fecha = txtFecha.getText();
        String Vence = txtVence.getText();
        String Cliente = txtNomCli.getText();
        int CodCliente = Integer.parseInt(txtCodCli.getText());
        int Telefono = Integer.parseInt(txtTel.getText());
        String NomProd = txtNomProd.getText();
        int Cant = Integer.parseInt(txtCant.getText());
        int MontoSenia = Integer.parseInt(txtSenia.getText());
        
        Object[] ob = new Object[8];
        ob[0]= Fecha;
        ob[1]= Vence;
        ob[2]= Cliente;
        ob[3]= CodCliente;
        ob[4]= Telefono;
        ob[5]= NomProd;
        ob[6]= Cant;
        ob[7]= MontoSenia;
        sbd.add(ob);
    }
    
    void limpiar() {
         for (int i=0; i < modelo.getRowCount(); i++) {
             modelo.removeRow(i);
             i= i-1;
         }
        txtVence.setText("");
        txtNomCli.setText("");
        txtCodCli.setText("");
        txtTel.setText("");
        txtNomProd.setText("");
        txtCant.setText("");
        txtSenia.setText("");
     }
    
    void eliminar(){
        int fila = tablaSenias.getSelectedRow();
        int codCliente = Integer.parseInt(tablaSenias.getValueAt(fila, 3).toString()); 
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            sbd.eliminar(codCliente);
        }
    }
    
    void modificar(){
        int fila = tablaSenias.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        } else {
            String Cliente = txtNomCli.getText();
            int CodCliente = Integer.parseInt(txtCodCli.getText());
            int Telefono = Integer.parseInt(txtTel.getText());
            String NomProd = txtNomProd.getText();
            int Cant = Integer.parseInt(txtCant.getText());
            int MontoSenia = Integer.parseInt(txtSenia.getText());
            
            Object[] ob = new Object[5];
            ob[0] = Cliente;
            ob[1] = Telefono;
            ob[2] = NomProd;
            ob[3] = Cant;
            ob[4] = MontoSenia;
            ob[5] = CodCliente;
            sbd.actualizar(ob);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSenias;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodCli;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNomCli;
    private javax.swing.JTextField txtNomProd;
    private javax.swing.JTextField txtSenia;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtVence;
    // End of variables declaration//GEN-END:variables
}
