
package modelo;

        // declaración de variables de la tabla detalle_ventas de la BD
public class DetalleVentas {
        int id;
        int idVentas;
        int idProducto;
        int cantidad;
        double pcioVenta;
        
        // método constructor
        public DetalleVentas(){
            
        }
        
        // inicialización de las variables
        public DetalleVentas(int id, int idVentas, int idProducto, int cantidad, double pcioVenta){
            this.id = id;
            this.idVentas = idVentas;
            this.idProducto = idProducto;
            this.cantidad = cantidad;
            this.pcioVenta = pcioVenta;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPcioVenta() {
        return pcioVenta;
    }

    public void setPcioVenta(double pcioVenta) {
        this.pcioVenta = pcioVenta;
    }
        
        
}
        
        
        
     