
package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JInternalFrame;


public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        FondoMenuPrincipal fondo = new FondoMenuPrincipal();
        this.add(fondo, BorderLayout.CENTER);
        this.pack();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JPanel();
        fondoMenuPrincipal1 = new vista.FondoMenuPrincipal();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmNuevaVta = new javax.swing.JMenuItem();
        itmLibroDiario = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuProd = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaPrincipal.setMaximumSize(new java.awt.Dimension(3000, 2000));
        VentanaPrincipal.setPreferredSize(new java.awt.Dimension(1000, 660));

        javax.swing.GroupLayout fondoMenuPrincipal1Layout = new javax.swing.GroupLayout(fondoMenuPrincipal1);
        fondoMenuPrincipal1.setLayout(fondoMenuPrincipal1Layout);
        fondoMenuPrincipal1Layout.setHorizontalGroup(
            fondoMenuPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        fondoMenuPrincipal1Layout.setVerticalGroup(
            fondoMenuPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoMenuPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoMenuPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(26, 19, 22));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(280, 40));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menuIcono.jpg"))); // NOI18N
        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setText("Ayuda");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(81, 25));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(153, 153, 153));
        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ventasIcono.png"))); // NOI18N
        jMenu2.setText("Ventas");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        itmNuevaVta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        itmNuevaVta.setText("Nueva venta");
        itmNuevaVta.setPreferredSize(new java.awt.Dimension(109, 25));
        itmNuevaVta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNuevaVtaActionPerformed(evt);
            }
        });
        jMenu2.add(itmNuevaVta);

        itmLibroDiario.setText("Libro Diario");
        itmLibroDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLibroDiarioActionPerformed(evt);
            }
        });
        jMenu2.add(itmLibroDiario);

        jMenuItem3.setText("Señas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimIcono.png"))); // NOI18N
        jMenu3.setText("Mantenimiento");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem4.setText("Cliente");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(93, 25));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        menuProd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        menuProd.setText("Producto");
        menuProd.setPreferredSize(new java.awt.Dimension(93, 25));
        menuProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdActionPerformed(evt);
            }
        });
        jMenu3.add(menuProd);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem6.setText("Vendedor");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(97, 25));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscarIcon.png"))); // NOI18N
        jMenu5.setText("Buscar");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem8.setText("Facturas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Productos");
        jMenu5.add(jMenuItem9);

        jMenuItem5.setText("Libros Diarios");
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cierresIcono.png"))); // NOI18N
        jMenu6.setText("Cierres");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem7.setText("Caja diaria");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem10.setText("Cierre Mensual");
        jMenu6.add(jMenuItem10);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
      
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void itmNuevaVtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNuevaVtaActionPerformed
        VentasForm vf = new VentasForm();
        System.out.println("Ingresando a VentasForm");
        CentrarVentana(vf);
        
    }//GEN-LAST:event_itmNuevaVtaActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void menuProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdActionPerformed
        ProductoForm cf = new ProductoForm();
        System.out.println("Ingresando a ProductoForm");
        CentrarVentana(cf);
    }//GEN-LAST:event_menuProdActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      ClienteForm cf = new ClienteForm();
      System.out.println("Ingresando a ClienteForm");
      CentrarVentana(cf);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
            VendedorForm vdf = new VendedorForm();
             CentrarVentana(vdf);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void itmLibroDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLibroDiarioActionPerformed
        LibroDiarioForm ldv = new LibroDiarioForm();
        CentrarVentana(ldv);
    }//GEN-LAST:event_itmLibroDiarioActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CajaDiariaForm cdf = new CajaDiariaForm();
       CentrarVentana(cdf);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        SeniasForm sf = new SeniasForm();
        CentrarVentana(sf);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Creo el metodo Centrar Ventana
    
   void CentrarVentana(JInternalFrame frame){
            VentanaPrincipal.add(frame);
            Dimension dimension = VentanaPrincipal.getSize();
            Dimension Dframe = frame.getSize();
            frame.setLocation((dimension.width-Dframe.width)/2,(dimension.height-Dframe.height)/2);
            frame.show();
 
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
   public static void main(String args[]){
            
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MenuPrincipal().setVisible(true);
                }
            });
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel VentanaPrincipal;
    private vista.FondoMenuPrincipal fondoMenuPrincipal1;
    private javax.swing.JMenuItem itmLibroDiario;
    private javax.swing.JMenuItem itmNuevaVta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem menuProd;
    // End of variables declaration//GEN-END:variables
}
