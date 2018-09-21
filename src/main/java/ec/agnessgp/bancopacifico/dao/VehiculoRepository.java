package ec.agnessgp.bancopacifico.dao;

/** 
 * <b>
 * Dao de vehiculo.
 * </b>
 *  
 * @author Wilson Herrera
 * @version $Revision: 1.0 $ <p>[$Author: Wilson Herrera $, $Date: 21 sep. 2018 $]</p>
*/
import org.springframework.data.jpa.repository.JpaRepository;

import ec.agnessgp.bancopacifico.modelo.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
	Vehiculo findByPrecio(Float precio);

}
