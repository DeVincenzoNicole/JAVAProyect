
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class VendedorBD {
    
    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection conn;

    public Vendedor ValidarVendedor(String Dni, String Usuario){
        
        Vendedor ev = new Vendedor();
        String sql = "select * from vendedor where Dni=? and Usuario=?";
        
            try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, Dni);
            ps.setString(2,Usuario);
            rs = ps.executeQuery();
                while (rs.next()) {
                    ev.setId(rs.getInt(1));
                    ev.setDni(rs.getString(2));
                    ev.setNom(rs.getString(3));
                    ev.setTel(rs.getString(4));
                    ev.setEstado(rs.getString(5));
                    ev.setUser(rs.getString(6));

                }
            } 
                catch (Exception e) {

                }
    
    return ev;
    
    }

}
