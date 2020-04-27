
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VentasBD {
 
    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection conn;
    int r=0;
    
    public String IdVentas() throws SQLException{
        String idv = "";
        String sql = "select max(IdVentas) from ventas";
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                idv = rs.getString(1);
            }
        } catch (SQLException e) {

                }
        return idv;
        
    }
        // ejecuto estos métodos en VentasForm
        public int GuardarVentas (Ventas v){
            
            String sql = "insert into ventas(idCliente, idVendedor, numComp,fechaVentas, monto) values (?,?,?,?,?)";
            try {
                conn = con.conexion();
                ps = conn.prepareStatement(sql);
                ps.setInt(1, v.getIdCliente());
                ps.setInt(2, v.getIdVendedor());
                ps.setString(3, v.getSerie());
                ps.setString(4, v.getFecha());
                ps.setDouble(5, v.getMonto());
                //ps.setString(6, v.getFormaDePago());
                r = ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println("Error al cargar los datos");
            }
            
            System.out.println("Venta guardada");
            return r;
            
        }
        
        public int  GuardarDetalleVentas (DetalleVentas dv){
            String sql = "insert into detalle_ventas(idVentas, idProducto, Cantidad, PrecioVenta) values (?,?,?,?)";
            try {
                conn = con.conexion();
                ps = conn.prepareStatement(sql);
                ps.setInt(1, dv.getIdVentas());
                ps.setInt(2, dv.getIdProducto());
                ps.setInt(3, dv.getCantidad());
                ps.setDouble(4, dv.getPcioVenta());               
                r = ps.executeUpdate();
        } catch (SQLException e){
          System.out.println("Error al cargar los datos");
        }
            return r;
        
        }
    
        public String NroComprobante(){
            String serie= "";
            String sql= "select max(numComp) from ventas";
            try {
                conn = con.conexion();
                ps = conn.prepareStatement(sql);               
                rs = ps.executeQuery();
                while (rs.next()){
                    serie = rs.getString(1);
                }
        } catch (SQLException e){
          System.out.println("Error al cargar los datos");
        }
            return serie;
            
        }
    
        public List FechaVentas(String fecha){
 
            String sql = " SELECT numComp, Cantidad, Nombre, productos.Marca, precio, monto  FROM ventas " +
                        "INNER JOIN detalle_ventas " +
                        "ON ventas.idVentas = detalle_ventas.idVentas " +
                        "INNER JOIN productos " +
                        "ON detalle_ventas.idProducto = productos.idProductos " +
                        "WHERE ventas.fechaVentas = ?";
            
            
            List<LibroDiario> lista = new ArrayList<>();
            
            try {
                conn = con.conexion();
                ps = conn.prepareStatement(sql); 
                ps.setString(1,fecha);
                rs = ps.executeQuery();
                
                while (rs.next()){
                    LibroDiario ld = new LibroDiario();
                    ld.setNumComp(rs.getString(1));
                    ld.setCant(rs.getInt(2));
                    ld.setNombre(rs.getString(3));
                    ld.setMarca(rs.getString(4));
                    ld.setPrecio(rs.getInt(5));
                    ld.setMonto(rs.getDouble(6));
                   
                   lista.add(ld);
                   System.out.println(lista);
                }
                
                
        } catch (SQLException e){
          Logger.getLogger(VentasBD.class.getName()).log(Level.SEVERE, null, e);
        }
            return lista;
        }
}
