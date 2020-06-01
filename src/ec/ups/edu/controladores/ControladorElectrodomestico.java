package ec.ups.edu.controladores;

import ec.edu.ups.ElectrodomesticoDAO.ElectrodomesticoDAO;
import ec.edu.ups.vista.VistaElectrodomestico;
import ec.ups.edu.DAO.IElectrodomesticoDAO;
import ec.ups.edu.modelo.Electrodomestico;
import ec.ups.edu.modelo.Lavadora;
import ec.ups.edu.modelo.Television;
import java.util.List;

/**
 *
 * @author santi
 */
public class ControladorElectrodomestico {

    private VistaElectrodomestico vistaElectrodomestico;
    private ElectrodomesticoDAO electrodomesticoDao;
    private IElectrodomesticoDAO ielectrodomestico;
    private Electrodomestico electrodomestico;

    public ControladorElectrodomestico(VistaElectrodomestico vistaElectrodomestico, ElectrodomesticoDAO electrodomesticoDao, IElectrodomesticoDAO ielectrodomestico, Electrodomestico electrodomestico) {
        this.vistaElectrodomestico = vistaElectrodomestico;
        this.electrodomesticoDao = electrodomesticoDao;
        this.ielectrodomestico = ielectrodomestico;
        this.electrodomestico = electrodomestico;
    }

    public void registrarTelevision() {

        electrodomestico = vistaElectrodomestico.ingresarTelevision();
        electrodomesticoDao.create(electrodomestico);

    }

    public void registrarLavadora() {

        electrodomestico = vistaElectrodomestico.ingresarLavadora();
        electrodomesticoDao.create(electrodomestico);

    }

    public void verLavadora(List<Lavadora> lavadoras) {

        for (Lavadora lavadora : lavadoras) {

            System.out.println("Datos de lavadora: " + lavadora);

        }

    }

    public void verTelevision(List<Television> televisiones) {

        for (Television televisione : televisiones) {

            System.out.println("Datos de television: " + televisione);

        }

    }
}
