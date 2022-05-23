package unsis.edu.mx.webApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unsis.edu.mx.webApp.entity.Materia;
import unsis.edu.mx.webApp.service.IMateriaService;

@RestController
@RequestMapping("/materia")
public class MateriaController {
	@Autowired
	IMateriaService service;
	
	@PostMapping("/crear")
	public void crearMateria(@RequestBody Materia materia) {
		service.crearMateria(materia);
	}
	
	@PostMapping("/modificar/{idMateria}")
	public void actualizarMateria(@RequestBody Materia materia, @PathVariable("idMateria")Long idMateria) {
		materia.setCodigo(idMateria);
		
		
		
		//jo	qihugsadyfvhidskjs

		service.actualizarMateria(materia);
	}
	
	
	
	
	
	
	
}
