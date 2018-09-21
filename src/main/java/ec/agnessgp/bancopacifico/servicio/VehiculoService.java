package ec.agnessgp.bancopacifico.servicio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec.agnessgp.bancopacifico.dao.VehiculoRepository;
import ec.agnessgp.bancopacifico.modelo.Vehiculo;

/** 
 * <b>
 * Servicio Vehiculo.
 * </b>
 *  
 * @author Wilson Herrera
 * @version $Revision: 1.0 $ <p>[$Author: Wilson Herrera $, $Date: 21 sep. 2018 $]</p>
*/

@Service
public class VehiculoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2829689166445141497L;
	
	@Autowired
	VehiculoRepository VehiculoDao; 
	
	public Vehiculo crear(Vehiculo Vehiculo) {
		return VehiculoDao.saveAndFlush(Vehiculo);
	}
	
	public List<Vehiculo> listarVehiculos(){
		return VehiculoDao.findAll();
	}
	public List<Vehiculo> listarVehiculosPrecio(Float precio){
		List<Vehiculo>vehiculo=new ArrayList<>();
		vehiculo=(List<Vehiculo>) VehiculoDao.findByPrecio(precio);
		return vehiculo;
	}
	
}
