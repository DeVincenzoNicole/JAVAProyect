package vista;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
// importo las clases a utilizar
import modelo.Cliente;
import modelo.ClienteBD;
import modelo.Producto;
import modelo.ProductoBD;
import modelo.Ventas;
import modelo.VentasBD;
import modelo.DetalleVentas;
import modelo.FormaDePago;
import modelo.FormaDePagoBD;
import modelo.VendedorBD;

public final class VentasForm extends javax.swing.JInternalFrame {

    ClienteBD cbd = new ClienteBD();
    ProductoBD pbd = new ProductoBD();
    VendedorBD vbd = new VendedorBD();
    VentasBD vtasbd = new VentasBD();
    Ventas v = new Ventas();
    DetalleVentas dv = new DetalleVentas();
    Producto p = new Producto();
    Cliente cliente = new Cliente();
    FormaDePago fdp = new FormaDePago();
    FormaDePagoBD pagobd = new FormaDePagoBD();

    int idProd;
    int cant;
    int cont = 0;
    double pcio, totApagar;
    DefaultTableModel modelo = new DefaultTableModel();
  
        
        
    
    public VentasForm() {
        
        initComponents();
        System.out.println("VentasForm");
        generarComprobante();
        txtFecha.setText(fecha());     
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        spnCant = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtProd = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnAgregarProd = new javax.swing.JButton();
        btnBuscarCod = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtVend = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        txtDesc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ckbEfectivo = new javax.swing.JCheckBox();
        ckbTarjDeb = new javax.swing.JCheckBox();
        ckbTarjCred = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtImpEf = new javax.swing.JTextField();
        txtImpTD = new javax.swing.JTextField();
        cmbTarjDeb = new javax.swing.JComboBox<>();
        cmbTarjCred = new javax.swing.JComboBox<>();
        txtImpTC = new javax.swing.JTextField();
        cmbCuotas = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtCupon = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtRecargo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setTitle("Ventas");
        setPreferredSize(new java.awt.Dimension(753, 629));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("PUNTO DE VENTA 00002");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cnel. Machado 704 - Morón");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tel: (011) 4489-4254");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("SMALL PLANET");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SERIE Nº");

        txtSerie.setEditable(false);
        txtSerie.setBackground(new java.awt.Color(153, 153, 153));
        txtSerie.setForeground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(110, 110, 110))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cod. Producto:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cantidad:");

        txtCodProd.setBackground(new java.awt.Color(153, 153, 153));

        txtPrecio.setBackground(new java.awt.Color(153, 153, 153));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        spnCant.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spnCant.setBackground(new java.awt.Color(153, 153, 153));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Producto:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Stock:");

        txtProd.setBackground(new java.awt.Color(153, 153, 153));
        txtProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdActionPerformed(evt);
            }
        });

        txtStock.setBackground(new java.awt.Color(153, 153, 153));

        btnAgregarProd.setForeground(new java.awt.Color(0, 102, 204));
        btnAgregarProd.setText("Agregar");
        btnAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProdActionPerformed(evt);
            }
        });

        btnBuscarCod.setForeground(new java.awt.Color(0, 102, 204));
        btnBuscarCod.setText("Buscar");
        btnBuscarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(txtPrecio))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(spnCant)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCod))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(spnCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarProd)))
                .addContainerGap())
        );

        txtProd.getAccessibleContext().setAccessibleName("");

        tablaDetalle.setBackground(new java.awt.Color(153, 153, 153));
        tablaDetalle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, new java.awt.Color(0, 102, 204)));
        tablaDetalle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaDetalle.setForeground(new java.awt.Color(255, 255, 255));
        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Cod.", "Producto", "Cantidad", "Pcio. Unidad", "Subtotal"
            }
        ));
        tablaDetalle.setGridColor(new java.awt.Color(255, 255, 255));
        tablaDetalle.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tablaDetalle.setSelectionForeground(new java.awt.Color(0, 102, 204));
        tablaDetalle.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tablaDetalle);

        btnCancelar.setForeground(new java.awt.Color(0, 102, 204));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirm.setForeground(new java.awt.Color(0, 102, 204));
        btnConfirm.setText("Generar Venta");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 204));
        jLabel14.setText("TOTAL");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(153, 153, 153));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cliente:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Vendedor:");

        txtVend.setBackground(new java.awt.Color(153, 153, 153));

        txtCliente.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cod. Cliente:");

        txtCodCliente.setBackground(new java.awt.Color(153, 153, 153));
        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });

        btnBuscarCliente.setForeground(new java.awt.Color(0, 102, 204));
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        txtDesc.setBackground(new java.awt.Color(153, 153, 153));
        txtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescKeyTyped(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Desc:");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        ckbEfectivo.setBackground(new java.awt.Color(51, 51, 51));
        ckbEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        ckbEfectivo.setText("Efectivo");
        ckbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbEfectivoActionPerformed(evt);
            }
        });

        ckbTarjDeb.setBackground(new java.awt.Color(51, 51, 51));
        ckbTarjDeb.setForeground(new java.awt.Color(255, 255, 255));
        ckbTarjDeb.setText("T. Débito");
        ckbTarjDeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbTarjDebActionPerformed(evt);
            }
        });

        ckbTarjCred.setBackground(new java.awt.Color(51, 51, 51));
        ckbTarjCred.setForeground(new java.awt.Color(255, 255, 255));
        ckbTarjCred.setText("T. Crédito");
        ckbTarjCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbTarjCredActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Importe");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Importe");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Importe");

        txtImpEf.setBackground(new java.awt.Color(153, 153, 153));
        txtImpEf.setText("00.0");

        txtImpTD.setBackground(new java.awt.Color(153, 153, 153));
        txtImpTD.setText("00.0");

        cmbTarjDeb.setBackground(new java.awt.Color(51, 51, 51));
        cmbTarjDeb.setForeground(new java.awt.Color(255, 255, 255));
        cmbTarjDeb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "Cabal", "Maestro" }));

        cmbTarjCred.setBackground(new java.awt.Color(51, 51, 51));
        cmbTarjCred.setForeground(new java.awt.Color(255, 255, 255));
        cmbTarjCred.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "Cabal", "Mastercard", "Amex" }));

        txtImpTC.setBackground(new java.awt.Color(153, 153, 153));
        txtImpTC.setText("00.0");

        cmbCuotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuotas", "1", "2", "3" }));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("F. de pago:");

        txtCupon.setBackground(new java.awt.Color(153, 153, 153));
        txtCupon.setForeground(new java.awt.Color(51, 51, 51));
        txtCupon.setText("0000");
        txtCupon.setToolTipText("");
        txtCupon.setName(""); // NOI18N
        txtCupon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCuponMouseClicked(evt);
            }
        });
        txtCupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuponActionPerformed(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cupón Nº");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtImpEf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbEfectivo))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ckbTarjDeb)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtImpTD, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(cmbTarjDeb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ckbTarjCred)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cmbTarjCred, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtImpTC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbCuotas, 0, 70, Short.MAX_VALUE)
                    .addComponent(txtCupon))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbEfectivo)
                    .addComponent(ckbTarjDeb)
                    .addComponent(ckbTarjCred)
                    .addComponent(cmbTarjDeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTarjCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(cmbCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtImpEf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtImpTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtImpTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(153, 153, 153));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Fecha:");

        txtRecargo.setBackground(new java.awt.Color(153, 153, 153));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Rec:");

        btnEliminar.setForeground(new java.awt.Color(0, 102, 204));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(txtRecargo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtVend, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtRecargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed

    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        try {
            buscarCliente();
            
        } catch (SQLException ex) {
            Logger.getLogger(VentasForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnBuscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodActionPerformed
        try {
            buscarProducto();
            
        } catch (SQLException ex) {
            Logger.getLogger(VentasForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarCodActionPerformed

    private void btnAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProdActionPerformed
        agregarProducto();
        txtCodProd.setText("");
        txtProd.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        spnCant.setValue(0);
        
        
    }//GEN-LAST:event_btnAgregarProdActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        
                        double impEf = Double.parseDouble(txtImpEf.getText());
                        double impTD = Double.parseDouble(txtImpTD.getText());
                        double impTC = Double.parseDouble(txtImpTC.getText());
 
        if (txtTotal.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar al menos un producto.");
        } else {
                if ( impEf == 00.0 && impTD == 00.0 && impTC == 00.0){
                    JOptionPane.showMessageDialog(this, "Debe ingresar una forma de pago");
                } else {
                        double tot = Double.parseDouble(txtTotal.getText());                  
                        if ( impEf + impTD + impTC != tot ){
                            JOptionPane.showMessageDialog(this, "El importe no coincide con el total de la venta");
                        } else {
                                try {       
                                guardarVenta();
                                guardarDetalle();
                                guardarPago();
                                actualizarStock();
                                int op = JOptionPane.showConfirmDialog(this, "Venta registrada. Desea realizar otra venta?");
                                    if (op == 0) {
                                        nuevaVenta();
                                        generarComprobante();
                                    }
                                } catch (SQLException ex) {
                                    Logger.getLogger(VentasForm.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                        }
    }//GEN-LAST:event_btnConfirmActionPerformed
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdActionPerformed
        
        
    }//GEN-LAST:event_txtProdActionPerformed

    private void ckbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbEfectivoActionPerformed
        importeFormaDePago();
    }//GEN-LAST:event_ckbEfectivoActionPerformed

    private void ckbTarjDebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbTarjDebActionPerformed
        importeFormaDePago();
    }//GEN-LAST:event_ckbTarjDebActionPerformed

    private void ckbTarjCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbTarjCredActionPerformed
        importeFormaDePago();
    }//GEN-LAST:event_ckbTarjCredActionPerformed

    private void txtCuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuponActionPerformed
       
    }//GEN-LAST:event_txtCuponActionPerformed

    private void txtCuponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCuponMouseClicked
       
    }//GEN-LAST:event_txtCuponMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tablaDetalle.getSelectedRow(); 
        if(fila==-1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
        modelo.removeRow(fila);
        calcularTotal();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescKeyTyped
       
    }//GEN-LAST:event_txtDescKeyTyped

    private void txtDescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescKeyReleased
        // se ejecuta al presionar Enter
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            double desc = Double.parseDouble(txtDesc.getText());
            double total = Double.parseDouble(txtTotal.getText());
            txtTotal.setText(""+ (total - desc));
        }
    }//GEN-LAST:event_txtDescKeyReleased

    private void txtDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescKeyPressed
        
    }//GEN-LAST:event_txtDescKeyPressed

    public String fecha() {
        Calendar calendario = new GregorianCalendar();
        calendario.set(Calendar.MONTH,4);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int anio = calendario.get(Calendar.YEAR);
        String fecha = dia + "/" + mes + "/" + anio;
        return fecha;
    }

    void buscarCliente() throws SQLException {
        
        ClienteForm cf = new ClienteForm();
        String codCliente = txtCodCliente.getText();

        if (txtCodCliente.getText().equals("")) {
            MenuPrincipal.VentanaPrincipal.add(cf);
            cf.setVisible(true); 
        } else {
            cliente = cbd.listarID(codCliente);
            if (cliente.getDni() != null) {
                txtCliente.setText(cliente.getNom());
                txtCodProd.requestFocus();
            } else {
                int r = JOptionPane.showConfirmDialog(this, "Cliente No Registrado. Desea registrarlo?");
                if (r == 0) {   
                    MenuPrincipal.VentanaPrincipal.add(cf);
                    cf.setVisible(true); 
                }
            }
        }
    }

    void buscarProducto() throws SQLException {

        ProductoForm pf = new ProductoForm();        
        if (txtCodProd.getText().equals("")) {
            MenuPrincipal.VentanaPrincipal.add(pf);
            pf.setVisible(true);
        } else {
            int idProductos = Integer.parseInt(txtCodProd.getText());
            Producto prod = pbd.listarID(idProductos);
            if (prod.getIdProd() != 0) {
                txtProd.setText(prod.getNom());
                txtPrecio.setText("" + prod.getPcio());
                txtStock.setText("" + prod.getStock());
            } else {
                int r = JOptionPane.showConfirmDialog(this, "Producto No Registrado. Desea registrarlo?");
                if (r == 0) {        
                    MenuPrincipal.VentanaPrincipal.add(pf);
                    pf.setVisible(true);
                }
            }
        }     
    }
    
    void agregarProducto() {

        double total;
        modelo = (DefaultTableModel) tablaDetalle.getModel();
        cont = cont + 1;
        idProd = Integer.parseInt(txtCodProd.getText());
        String nomProd = txtProd.getText();
        pcio = Double.parseDouble(txtPrecio.getText());
        cant = Integer.parseInt(spnCant.getValue().toString());
        int stock = Integer.parseInt(txtStock.getText());
        total = cant * pcio;
        // para mostrar todo en la tabla
        ArrayList lista = new ArrayList();
        if (stock > 0) {
            lista.add(cont);
            lista.add(idProd);
            lista.add(nomProd);
            lista.add(cant);
            lista.add(pcio);
            lista.add(total);
            // agrego todos los datos dentro de un array
            Object[] ob = new Object[6];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            ob[4] = lista.get(4);
            ob[5] = lista.get(5);
            modelo.addRow(ob);
            calcularTotal();
            tablaDetalle.setModel(modelo);

        } else {
            JOptionPane.showMessageDialog(this, "Producto sin stock");
        }
    }

    void calcularTotal() {
        totApagar = 0;
        
        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            cant = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            pcio = Double.parseDouble(tablaDetalle.getValueAt(i, 4).toString());
            totApagar = totApagar + (cant * pcio);
        }
        txtTotal.setText("" + totApagar);
    }

    void guardarVenta() {
        int idv = v.getId();
        int idc = cliente.getId();
        String serie = txtSerie.getText();
        String fecha = txtFecha.getText();
        double monto = Double.parseDouble(txtTotal.getText());
        

        v.setIdCliente(idc);
        v.setIdVendedor(idv);
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);
        vtasbd.GuardarVentas(v);
        System.out.println("Venta guardada");

    }

    void guardarDetalle() throws SQLException {
        String idv = vtasbd.IdVentas();
        int idve = Integer.parseInt(idv);
        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            idProd = Integer.parseInt(tablaDetalle.getValueAt(i, 1).toString());
            cant = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            pcio = Double.parseDouble(tablaDetalle.getValueAt(i, 4).toString());
            dv.setIdVentas(idve);
            dv.setIdProducto(idProd);
            dv.setCantidad(cant);
            dv.setPcioVenta(pcio);
            vtasbd.GuardarDetalleVentas(dv);
        }
    }

    void generarComprobante() {
        String serie = vtasbd.NroComprobante();
        if (serie == null) {
            txtSerie.setText("0000001");
        } else {
            int acum = Integer.parseInt(serie);
            acum = acum + 1;
            txtSerie.setText("00000" + acum);
        }
    }

    void actualizarStock() throws SQLException {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Producto prod = new Producto();
            idProd = Integer.parseInt(tablaDetalle.getValueAt(i, 1).toString());
            cant = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            prod = pbd.listarID(idProd);
            int nuevoStock = prod.getStock() - cant;
            pbd.actualizarStock(nuevoStock, idProd);
        }
    }

    void nuevaVenta() {
        txtCodCliente.setText("");
        txtCodProd.setText("");
        txtProd.setText("");
        txtStock.setText("");
        txtPrecio.setText("");
        txtCliente.setText("");
        txtVend.setText("");
        txtTotal.setText("");
        txtSerie.setText("");
        spnCant.setValue(0);
        txtImpEf.setText("00.0");
        txtImpTC.setText("00.0");
        txtImpTD.setText("00.0");
        txtRecargo.setText("00.0");
        txtDesc.setText("00.0");
        limpiarTabla();
        cmbCuotas.setSelectedItem(0);
        ckbEfectivo.setSelected(false);
        ckbTarjDeb.setSelected(false);
        ckbTarjCred.setSelected(false);
        txtCliente.requestFocus();

    }

    void limpiarTabla() {
        for (int i = tablaDetalle.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    void importeFormaDePago(){
        
        double total = Double.parseDouble(txtTotal.getText());
        if (ckbEfectivo.isSelected()){
            txtImpEf.setText(""+total);
            txtImpTD.setText("00.0");
            txtImpTC.setText("00.0");        
        } 
        if (ckbTarjDeb.isSelected()){
            txtImpTD.setText(""+total);
            txtImpEf.setText("00.0");
            txtImpTC.setText("00.0");         
        } 
        if (ckbTarjCred.isSelected()){
            txtImpTC.setText(""+total);
            txtImpTD.setText("00.0");
            txtImpEf.setText("00.0");
            String cuotas = cmbCuotas.getSelectedItem().toString(); 
            if ("2".equals(cuotas) || "3".equals(cuotas)){
                double recargo = (total * 10) / 100;
                double totCred = total + recargo;
                txtImpTC.setText(""+totCred);
                txtRecargo.setText(""+ recargo);
                double totRec = total + recargo;
                txtTotal.setText(""+totRec);
            }
            
        } 
    }
   
    void guardarPago() throws SQLException{
            double impEf = Double.parseDouble(txtImpEf.getText());
            double impTD = Double.parseDouble(txtImpTD.getText());
            double impTC = Double.parseDouble(txtImpTC.getText());
            double desc = Double.parseDouble(txtDesc.getText());
            double monto = Double.parseDouble(txtTotal.getText());
           
            String idve = vtasbd.IdVentas();
            int idv = Integer.parseInt(idve);
            int comp = Integer.parseInt(txtSerie.getText());
            int cupon = Integer.parseInt(txtCupon.getText());

            fdp.setIdVentas(idv);
            fdp.setNumComp(comp);
            fdp.setNumCupon(cupon);
            fdp.setEfectivo(impEf);
            fdp.setDebito(impTD);
            fdp.setCredito(impTC);
            fdp.setDesc(desc);
            fdp.setMontoTotal(monto);  
            pagobd.GuardarPago(fdp);
       
       
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new VentasForm().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProd;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarCod;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JCheckBox ckbEfectivo;
    private javax.swing.JCheckBox ckbTarjCred;
    private javax.swing.JCheckBox ckbTarjDeb;
    private javax.swing.JComboBox<String> cmbCuotas;
    private javax.swing.JComboBox<String> cmbTarjCred;
    private javax.swing.JComboBox<String> cmbTarjDeb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JSpinner spnCant;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodCliente;
    public static javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtCupon;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtImpEf;
    private javax.swing.JTextField txtImpTC;
    private javax.swing.JTextField txtImpTD;
    public static javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtRecargo;
    private javax.swing.JTextField txtSerie;
    public static javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVend;
    // End of variables declaration//GEN-END:variables
}
