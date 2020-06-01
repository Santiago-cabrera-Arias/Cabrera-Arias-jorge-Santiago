
package ec.edu.ups.test;

import ec.edu.ups.ElectrodomesticoDAO.ElectrodomesticoDAO;
import ec.edu.ups.vista.VistaElectrodomestico;
import ec.ups.edu.DAO.IElectrodomesticoDAO;
import ec.ups.edu.controladores.ControladorElectrodomestico;



/**
 *
 * @author santi
 */
public class Test {
    
    ElectrodomesticoDAO electrodomestico = new ElectrodomesticoDAO();
    VistaElectrodomestico vista = new VistaElectrodomestico();
    ControladorElectrodomestico controlador = new ControladorElectrodomestico(vista, electrodomestico, electrodomestico,electrodomestico);
            
            
    
    
    
    public static void main(String[] args) {
        
       
        
        
        
        
    }
    
    
}
