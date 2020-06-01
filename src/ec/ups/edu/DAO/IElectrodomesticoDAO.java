
package ec.ups.edu.DAO;

import ec.ups.edu.modelo.Electrodomestico;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IElectrodomesticoDAO {
    
    
    //CRUD
    
    public void create(Electrodomestico electrodomestico);
    public Electrodomestico read(int codigo);
    public void update(Electrodomestico electrodomestico);
    public void delete(Electrodomestico electrodomestico);
    public List<Electrodomestico> findAll();
    
}
