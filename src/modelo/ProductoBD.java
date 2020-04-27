
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProductoBD implements metMantenim {
    
    int r;
    PreparedStatement ps;
    ResultSet rs;
    conexion con = new conexion();
    Connection conn;
    
    
    // buscar producto
    public Producto listarID(int idProductos) throws SQLException{
        Producto p  = new Producto(); 
        String sql = "select * from productos where idProductos=?";
        
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,idProductos);
            rs = ps.executeQuery();
            
            while (rs.next()){
                p.setIdProd(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setPcio(rs.getInt(3));
                p.setStock(rs.getInt(4));
                p.setMarca(rs.getString(5));
            }                    
        } catch (SQLException ex) {
          }
        
        return p;
    }
    
    public int actualizarStock(int cant, int idProd){
        String sql= "update productos set Stock=? where idProductos=? ";
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,cant);
            ps.setInt(2,idProd);
            ps.executeUpdate();
        } catch (SQLException ex) {
          }
        return r;
    }

    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql= "select * from productos";
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProd(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setPcio(rs.getInt(3));
                p.setStock(rs.getInt(4));
                p.setMarca(rs.getString(5));
                lista.add(p);     
            }
        } catch (SQLException ex) {
          }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int p = 0;
        String sql= "insert into productos(idProductos, Nombre, Precio, Stock, Marca) values(?,?,?,?,?)";
        try {
            conn = con.conexion();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            p = ps.executeUpdate();                
        } catch (SQLException ex) {
            System.out.println("Error al agregar");
            Logger.getLogger(ClienteBD.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return p;
    }

    @Override
    public int actualizar(Object[] o) {
        int p = 0;
        String sql= "update productos set Nombre=?, Precio=?, Stock=?, Marca=? where IdProductos=?";
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
        return p;
        
    }

    @Override
    public void eliminar(int idProd){
        String sql  = "delete from productos where idProductos=?";
      try {
          conn = con.conexion();
          ps = conn.prepareStatement(sql);
          ps.setInt(1,idProd);
          ps.executeUpdate();
      } catch (SQLException ex) {
            Logger.getLogger(ClienteBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
    
    
}
