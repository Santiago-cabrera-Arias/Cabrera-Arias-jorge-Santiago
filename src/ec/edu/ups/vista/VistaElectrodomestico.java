
package ec.edu.ups.vista;

import ec.ups.edu.modelo.Lavadora;
import ec.ups.edu.modelo.Television;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class VistaElectrodomestico {
    
    public Scanner sc;

    public VistaElectrodomestico() {
    
    sc = new Scanner (System.in);
        
    }
    
    public Television ingresarTelevision(){
        
        sc = new Scanner (System.in);
        
        System.out.println("Ingrese la resolucion de la television");
        int resolucion = sc.nextInt();
        System.out.println("Ingrese el puerto");
        boolean puertoHDMI;
        
        
        return new Television();
        
    }
    
    public Lavadora ingresarLavadora(){
        
        System.out.println("Ingrese la carga de la lavadora");
        int carga = sc.nextInt();
        
        return new Lavadora(carga);
        
    }
    
    public void mostrarLavadoras(List<Lavadora> lista){
        
        for (Lavadora lavadora : lista) {
            
            System.out.println("Datos de lavadora"+lavadora);
            
        }
        
    }
    
    public void mostrarTelevisiones(List<Television> lista){
        
        for (Television television : lista) {
            
            System.out.println("Datos del televisor"+television);
            
        }
        
    }

    
    
}
