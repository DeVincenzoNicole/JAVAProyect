
package modelo;


public class FormaDePago {
    
    int idVentas;
    int numComp;
    int numCupon;
    double efectivo;
    double debito;
    double credito;
    double desc;
    double montoTotal;
    
    public FormaDePago(){
        
    }

    public FormaDePago(int idVentas, int numComp, int numCupon, double efectivo, double debito, double credito, double desc, double montoTotal) {
        this.idVentas = idVentas;
        this.numComp = numComp;
        this.numCupon = numCupon;
        this.efectivo = efectivo;
        this.debito = debito;
        this.credito = credito;
        this.desc = desc;
        this.montoTotal = montoTotal;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getNumComp() {
        return numComp;
    }

    public void setNumComp(int numComp) {
        this.numComp = numComp;
    }

    public int getNumCupon() {
        return numCupon;
    }

    public void setNumCupon(int numCupon) {
        this.numCupon = numCupon;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

      public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }
    
    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    
    
}
