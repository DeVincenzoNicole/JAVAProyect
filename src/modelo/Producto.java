
package modelo;

        // declaracion de variables del form Productos
public class Producto {
        int idProd;
        String nom;
        double pcio;
        int stock;
        String marca;
        
    public Producto(){
        
    }    

     // Constructor para inicializar las variables
    public Producto (int idProd, String nom, double pcio, int stock, String marca) {
        this.idProd = idProd;
        this.nom = nom;
        this.pcio = pcio;
        this.stock = stock;
        this.marca = marca;       
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPcio() {
        return pcio;
    }

    public void setPcio(int pcio) {
        this.pcio = pcio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
        
        
        
        
        
        
}
