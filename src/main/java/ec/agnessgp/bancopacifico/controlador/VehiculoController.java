/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.bancopacifico.controlador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import ec.agnessgp.bancopacifico.modelo.Vehiculo;
import ec.agnessgp.bancopacifico.servicio.VehiculoService;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 13 ago. 2018 $]</p>
*/
@Controller
@SessionAttributes("Vehiculo")
public class VehiculoController {

	@Autowired
	VehiculoService VehiculoServicio;
	
	@RequestMapping(value = "/listaVehiculos", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Vehículos");
		model.addAttribute("vehiculos", VehiculoServicio.listarVehiculos());
		return "listaVehiculos";
	}
	
	
	


}
