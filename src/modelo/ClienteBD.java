
package modelo;

// Metodos para actualizar Cliente en la base de datos

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteBD implements metMantenim {
    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection conn;

    // buscar cliente
    public Cliente listarID(String dni) throws SQLException{
        Cliente c  = new Cliente(); 
        String sql = "select * from clientes where Dni=?";
        
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1,dni);
            rs = ps.executeQuery();
            
            while (rs.next()){
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDir(rs.getString(4));
                c.setEstado(rs.getString(5));
            }                    
        } catch (SQLException ex) {
          }
        
        return c;
    }
    
    
    
    
    
    @Override
    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql= "select * from clientes";
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDir(rs.getString(4));
                c.setEstado(rs.getString(5));
                lista.add(c);     
            }
        } catch (SQLException ex) {
          }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql= "insert into clientes(Dni,Nombre,Direccion,Estado) values(?,?,?,?)";
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();                
        } catch (SQLException ex) {
            System.out.println("Error al agregar");
            Logger.getLogger(ClienteBD.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
            int r = 0;
        String sql= "update clientes set Dni=?, Nombre=?, Direccion=?, Estado=? where IdClientes=?";
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();                
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBD.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return r;
    }

    @Override
    public void eliminar(int id) {
      String sql  = "delete from clientes where idClientes=?";
      try {
          conn = con.conexion();
          ps = conn.prepareStatement(sql);
          ps.setInt(1,id);
          ps.executeUpdate();
      } catch (SQLException ex) {
            Logger.getLogger(ClienteBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
