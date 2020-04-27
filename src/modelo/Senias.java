
package modelo;


public class Senias {
    
    int idSenia;
    String fecha;
    String vence;
    String nomCliente;
    int codCliente;
    int telefono;
    String nomProd;
    int cant;
    int montoSenia;

    public Senias(){
        
    }
    
    public Senias(int idSenia, String fecha, String vence, String nomCliente, int codCliente, int telefono, String nomProd, int cant, int montoSenia) {
        this.idSenia = idSenia;
        this.fecha = fecha;
        this.vence = vence;
        this.nomCliente = nomCliente;
        this.codCliente = codCliente;
        this.telefono = telefono;
        this.nomProd = nomProd;
        this.cant = cant;
        this.montoSenia = montoSenia;
    }

    public int getIdSenia() {
        return idSenia;
    }

    public void setIdSenia(int idSenia) {
        this.idSenia = idSenia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getVence() {
        return vence;
    }

    public void setVence(String vence) {
        this.vence = vence;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getMontoSenia() {
        return montoSenia;
    }

    public void setMontoSenia(int montoSenia) {
        this.montoSenia = montoSenia;
    }
    
    
    
    
    
    
    
}
