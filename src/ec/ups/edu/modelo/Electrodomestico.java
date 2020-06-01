
package ec.ups.edu.modelo;

/**
 *
 * @author santi
 */
public  class Electrodomestico {
    
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

   
    
    public Electrodomestico() {
    }
    
    public Electrodomestico(int codigo){
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codigo;
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
        final Electrodomestico other = (Electrodomestico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

     public double obtenerPrecioFinal(){
         
         int consumoEnergetico=0;
         int A = 0,B=0,C=0,D=0,E=0,F=0;
         int precio=0;
         int peso=0;
         
         if(consumoEnergetico == A || peso>0 && peso<=19 ){
             
             precio = 100 + 10;
             
         }else if(consumoEnergetico == B){
         
             precio = 80;
         
         }else if (consumoEnergetico == C){
             
             precio =60;
             
         }else if(consumoEnergetico == D){
             
             precio =50;
         }else if (precio == E){
             
             precio = 60;
         }
         
         return precio;
                 
     }
        
    
    
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
    
    
    
}
