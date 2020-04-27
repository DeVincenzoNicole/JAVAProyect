
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormaDePagoBD {
    
    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection conn;
    
    public int GuardarPago(FormaDePago fdp) {
        int r = 0;
        String sql= "insert into detalle_pago(idVentas, numComp, numCupon, efectivo, debito, credito, descuento, montoTotal) values(?,?,?,?,?,?,?,?)";
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
                ps.setInt(1, fdp.getIdVentas());
                ps.setInt(2, fdp.getNumComp());
                ps.setInt(3, fdp.getNumCupon());
                ps.setDouble(4, fdp.getEfectivo());
                ps.setDouble(5, fdp.getDebito());
                ps.setDouble(6, fdp.getCredito());
                ps.setDouble(7, fdp.getDesc());
                ps.setDouble(8, fdp.getMontoTotal());
                r = ps.executeUpdate();                
        } catch (SQLException ex) {
            System.out.println("Error al agregar forma de pago");
            Logger.getLogger(FormaDePagoBD.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return r;
    }
    
    
    
    
}
