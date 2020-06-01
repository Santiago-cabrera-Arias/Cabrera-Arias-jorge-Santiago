
package ec.edu.ups.ElectrodomesticoDAO;

import ec.ups.edu.DAO.IElectrodomesticoDAO;
import ec.ups.edu.modelo.Electrodomestico;

import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author santi
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO{

SortedSet<Electrodomestico> listaElectrodomestico = new TreeSet<>();
    
    
    
    @Override
    public void create(Electrodomestico electrodomestico) {
        
    listaElectrodomestico.add(electrodomestico);
        
    }

    @Override
    public Electrodomestico read(int codigo) {
        
        for (Electrodomestico electrodomestico : listaElectrodomestico) {
            
            if (electrodomestico.getCodigo() == codigo) {
                
                return electrodomestico;
                
            }
            
        }
        
        return null;
        
    }

    @Override
    public void update(Electrodomestico electrodomestico) {
        
       
    }
            
      

    @Override
    public void delete(Electrodomestico electrodomestico) {
        
        Iterator <Electrodomestico> it = listaElectrodomestico.iterator();
        while(it.hasNext()){
            
            Electrodomestico elec = it.next();
            
            if (elec.getCodigo() == electrodomestico.getCodigo()) {
                
                it.remove();
                
                break;
                
            }
            
        }
        
        
    }

    @Override
    public List<Electrodomestico> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
