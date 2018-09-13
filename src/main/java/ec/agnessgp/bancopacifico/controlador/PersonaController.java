/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.com.agnessgp.personas.controlador;

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

import ec.com.agnessgp.personas.modelo.Persona;
import ec.com.agnessgp.personas.servicio.PersonaService;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 13 ago. 2018 $]</p>
*/
@Controller
@SessionAttributes("persona")
public class PersonaController {

	@Autowired
	PersonaService personaServicio;
	
	@GetMapping("ver/{id}")
	public String ver(@PathVariable(value="id") Long id, Map<String,Object> model) {
		Optional <Persona> personaOptional=null;
		personaOptional = personaServicio.obtenerPorId(id);
		System.out.println("--------"+personaOptional.toString());
		personaOptional.ifPresent((x)->System.out.println(x.getId()));

		if(personaOptional.isPresent()){
		    Persona persona = personaOptional.get();
		    model.put("persona",persona);
		}
		return "ver";
	}
	
	@RequestMapping(value="/formulario")
	public String crear(Map<String,Object> model) {
		
		Persona persona = new Persona();
		model.put("persona", persona);
		model.put("titulo", "Registro de Personas");
		return "formulario";
	}
	
	@RequestMapping(value="/formulario" , method=RequestMethod.POST)
	public String guardar(Persona persona, @RequestParam("file") MultipartFile foto ) {
		
		persona.setCodigoGenero("GENPER");
		persona.setTipoGenero("MAS");
		persona.setCodigoIdentificacion("IDEPER");
		persona.setTipoIdentificacion("CED");
		persona.setFechaNacimiento(LocalDate.of(1981,8,3));
		
		
		
		if(!foto.isEmpty()) {
			//Path directorioRecursos = Paths.get(".//src//main//resources//static//uploads");
			//String rootPath= directorioRecursos.toFile().getAbsolutePath();
			String rootPath = "C://agness-workspace-eclipse//Temp//uploads";
			
			try {
				byte[] bytes = foto.getBytes();
				System.out.println("Ruta Foto"+rootPath+"//"+foto.getOriginalFilename());
				Path rutaCompleta = Paths.get(rootPath+"//"+foto.getOriginalFilename());
				Files.write(rutaCompleta, bytes);
				persona.setFoto(foto.getOriginalFilename());
			} catch (IOException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		personaServicio.crear(persona);
		return "redirect:listar";
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de clientes");
		model.addAttribute("personas", personaServicio.listarPersonas());
		return "listar";
	}
	
	
	


}
