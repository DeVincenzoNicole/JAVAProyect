
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SeniasBD implements metMantenim {
    
    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection conn;   
    
    @Override
    public List listar() {
        List<Senias> lista = new ArrayList<>();
        String sql= "select Fecha, Vence, Nombre, CodCliente, Telefono, NomProd, Cantidad, MontoSenia from senias";
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Senias s = new Senias();
                s.setFecha(rs.getString(1));
                s.setVence(rs.getString(2));
                s.setNomCliente(rs.getString(3));
                s.setCodCliente(rs.getInt(4));
                s.setTelefono(rs.getInt(5));
                s.setNomProd(rs.getString(6));
                s.setCant(rs.getInt(7));
                s.setMontoSenia(rs.getInt(8));
                
                lista.add(s);     
            }
        } catch (SQLException ex) {
             Logger.getLogger(SeniasBD.class.getName()).log(Level.SEVERE, null, ex);
          }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
            String sql = "insert into senias(Fecha, Vence, Nombre, CodCliente, Telefono, NomProd, Cantidad, MontoSenia) values (?,?,?,?,?,?,?,?)";
            try {
                conn = con.conexion();
                ps = conn.prepareStatement(sql);
                ps.setObject(1, o[0]);
                ps.setObject(2, o[1]);
                ps.setObject(3, o[2]);
                ps.setObject(4, o[3]);
                ps.setObject(5, o[4]);
                ps.setObject(6, o[5]);
                ps.setObject(7, o[6]);
                ps.setObject(8, o[7]);
                
                r = ps.executeUpdate();                
            } catch (SQLException ex) {
                System.out.println("Error al agregar seña");
                Logger.getLogger(SeniasBD.class.getName()).log(Level.SEVERE, null, ex);
            } 
         return r;       
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql= "update senias set Nombre=?, Telefono=?, NomProd=?, Cantidad=?, MontoSenia=? where CodCliente=? ";
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            
            r = ps.executeUpdate();                
        } catch (SQLException ex) {
            Logger.getLogger(SeniasBD.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return r;
    }

    @Override
    public void eliminar(int codSenia) {
        String sql  = "delete from senias where CodCliente=?";
      try {
          conn = con.conexion();
          ps = conn.prepareStatement(sql);
          ps.setInt(1,codSenia);
          ps.executeUpdate();
      } catch (SQLException ex) {
          Logger.getLogger(SeniasBD.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    
    
    
    
}
