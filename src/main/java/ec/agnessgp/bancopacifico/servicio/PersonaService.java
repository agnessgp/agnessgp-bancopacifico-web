/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 

package ec.com.agnessgp.personas.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.agnessgp.personas.dao.PersonaRepository;
import ec.com.agnessgp.personas.modelo.Persona;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 12 ago. 2018 $]</p>
*/

@Service
public class PersonaService {

	@Autowired
	PersonaRepository personaDao; 
	
	public Persona crear(Persona persona) {
		return personaDao.saveAndFlush(persona);
	}
	
	public List<Persona> listarPersonas(){
		return personaDao.findAll();
	}
	
	public Persona obtenerPorIdentificacion(String identificacion) {
		return personaDao.findByIdentificacion(identificacion);
	}
	
	public Optional<Persona> obtenerPorId(Long id) {
		return personaDao.findById(id);
	}
}
