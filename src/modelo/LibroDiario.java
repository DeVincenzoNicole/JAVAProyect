
package modelo;


public class LibroDiario {
    
    
    String numComp;
    int cant;
    String nombre;
    String marca;
    int precio;
    double monto;
    
    public LibroDiario(){
        
    }

    public LibroDiario( String numComp, int cant, String nombre, String marca, int precio, double monto) {
        
        this.numComp = numComp;
        this.cant = cant;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.monto = monto;
    }

    public String getNumComp() {
        return numComp;
    }

    public void setNumComp(String numComp) {
        this.numComp = numComp;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
