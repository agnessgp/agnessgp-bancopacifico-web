/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.com.agnessgp.personas.servicio;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ec.com.agnessgp.personas.dao.CatalogoRepository;
import ec.com.agnessgp.personas.modelo.Catalogo;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 15 ago. 2018 $]</p>
*/
@Service
public class CatalogoService {

	@Autowired
	CatalogoRepository catalogoDao;
	
	public Catalogo crearCatalogo(Catalogo catalogo) {
		return catalogoDao.save(catalogo);
	}
	
	public Catalogo actualizarCatalogo(Catalogo catalogo) {
		return catalogoDao.save(catalogo);
	}
	
	public boolean existeCatalogo(String codigo) {
		return catalogoDao.existsById(codigo);
	}
	
	public List<Catalogo> listaCatalogoTodos(){
		return (List<Catalogo>) catalogoDao.findAll();
	}
	
	public Page<Catalogo> listaCatalogoTodos(Pageable pageable){
		return catalogoDao.findAll(pageable);
	}
	
	public Optional<Catalogo> obtenerCatalogo(String codigo) {
			return catalogoDao.findById(codigo);
	}
	

}
