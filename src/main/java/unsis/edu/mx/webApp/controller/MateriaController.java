package unsis.edu.mx.webApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import unsis.edu.mx.webApp.entity.Materia;
import unsis.edu.mx.webApp.service.IMateriaService;

//@RestController  // administra la comunicacion, se crean post, get put y delete ---se eliminaron
//@RequestMapping("/materia") // es la base del path --- se eliminaron

@Controller //agregada esta linea

public class MateriaController {
	@Autowired
	IMateriaService service;
	
	@RequestMapping("/home-controller")//línea agregada para llamar al jsp home
	public String paginaPrincipal(ModelMap model) {
		System.out.println("hola");
		return "home";
	}
	
	
	@PostMapping("/crear") 
	public void crearMateria(@RequestBody Materia materia) {
		service.crearMateria(materia);
	}
	
	@PutMapping("/modificar/{idMateria}") //lo que va entre llaves hace referencia a una variable
	// url:  /materia/modificar/005-- (ejemplo de url a enviar)
	public void actualizarMateria(@RequestBody Materia materia, @PathVariable("idMateria")Long idMateria) {
		materia.setIdMateria(idMateria);
		service.actualizarMateria(materia);
	}
	
	
	
	@DeleteMapping("/eliminar/{idMateria}") //lo que va entre llaves hace referencia a una variable
	// url:  /materia/modificar/005-- (ejemplo de url a enviar)
	public void eliminarMateria(@PathVariable("idMateria")Long idMateria) {
		Materia mat= service.obtenerMateria(idMateria);
		service.eliminarMateria(mat);
	}
	
	
	@GetMapping("/listar")
	public List <Materia> obtenerListaMateria(){
		return service.obtenerListaMateria();
	}
	
	@GetMapping("/mostrarUno/{idMateria}")
	public Materia obtenerUnaMateria(@PathVariable("idMateria")Long idMateria){
		return service.obtenerMateria(idMateria);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
}
