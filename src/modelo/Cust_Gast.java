
package modelo;

public class Cust_Gast {
    
    int cust_gast;
    String fecha;
    int custodias;
    int gastos;
    String detalle_gastos;
    
    public Cust_Gast(){
    
    }

    public Cust_Gast(int cust_gast, String fecha, int custodias, int gastos, String detalle_gastos) {
        this.cust_gast = cust_gast;
        this.fecha = fecha;
        this.custodias = custodias;
        this.gastos = gastos;
        this.detalle_gastos = detalle_gastos;
    }

    public int getCust_gast() {
        return cust_gast;
    }

    public void setCust_gast(int cust_gast) {
        this.cust_gast = cust_gast;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCustodias() {
        return custodias;
    }

    public void setCustodias(int custodias) {
        this.custodias = custodias;
    }

    public int getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }

    public String getDetalle_gastos() {
        return detalle_gastos;
    }

    public void setDetalle_gastos(String detalle_gastos) {
        this.detalle_gastos = detalle_gastos;
    }

    public void setCustodias(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
