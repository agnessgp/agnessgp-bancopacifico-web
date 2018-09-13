/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.com.agnessgp.personas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.agnessgp.personas.dao.CatalogoDetalleRepository;
import ec.com.agnessgp.personas.dao.CatalogoRepository;
import ec.com.agnessgp.personas.modelo.CatalogoDetalle;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 15 ago. 2018 $]</p>
*/
@Service
public class CatalogoDetalleService {

	@Autowired
	CatalogoDetalleRepository catalogoDetalleDao;
	

	public CatalogoDetalle crear(CatalogoDetalle catalogoDetalle) {
		return catalogoDetalleDao.saveAndFlush(catalogoDetalle);
	}
	
	public List<CatalogoDetalle> listaCatalogoDetalleTodos(){
		return catalogoDetalleDao.findAll();
	}
}
