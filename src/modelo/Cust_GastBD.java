
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cust_GastBD {
    
    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection conn;
    
    
    public int guardarCustyGast(Cust_Gast cyg){
        int r=0;
        String sql = "insert into cust_gast(Fecha, Custodias, Gastos, Detalle_gastos) values (?,?,?,?)";
        try {
                conn = con.conexion();
                ps = conn.prepareStatement(sql);
                ps.setString(1, cyg.getFecha());
                ps.setInt(2, cyg.getCustodias());
                ps.setInt(3, cyg.getGastos());
                ps.setString(4, cyg.getDetalle_gastos());
               
                r = ps.executeUpdate();
        } catch (SQLException ex){
          Logger.getLogger(Cust_GastBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
    
    
    
    
}
