
package ec.ups.edu.modelo;

/**
 *
 * @author santi
 */
public class Television extends Electrodomestico{
    
    
    private int resolucion;
    private boolean puertoHDMI;

    public Television(int resolucion, boolean puertoHDMI, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.puertoHDMI = puertoHDMI;
    }

    public Television() {
        
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.resolucion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Television other = (Television) obj;
        if (this.resolucion != other.resolucion) {
            return false;
        }
        return true;
    }

    public double obtenerSalarioFinal(){
        
        int precio=0;
        
        if(resolucion >= 40 ){
        
           precio = (int) (getPrecioBase()+0.30);
            
    }else if (puertoHDMI == true){
    
       Electrodomestico ele = new Electrodomestico();
       precio = (int) (ele.getPrecioBase()+50);
            
       
    }
       
        return precio;
    }
    
    @Override
    public String toString() {
        return "Television{" + "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + '}';
    }

    
    
    
    
}
