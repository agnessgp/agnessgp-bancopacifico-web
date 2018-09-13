/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.bancopacifico.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.agnessgp.bancopacifico.modelo.Persona;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 12 ago. 2018 $]</p>
*/
public interface PersonaRepository extends JpaRepository<Persona, Long>{

	Persona findByIdentificacion(String identificacion);
	Persona findByNombresAndApellidos(String nombres, String apellidos);
}
