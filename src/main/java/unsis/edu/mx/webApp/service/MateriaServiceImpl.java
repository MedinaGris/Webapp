package unsis.edu.mx.webApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unsis.edu.mx.webApp.entity.Materia;
import unsis.edu.mx.webApp.model.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService{
	@Autowired//spring inyecta o hace una sola instancia
	IMateriaRepository repository;
	@Override
	public void crearMateria(Materia materia) {
	repository.save(materia);
		
	}

	@Override
	public void actualizarMateria(Materia materia) {
	repository.save(materia);	
		
	}

	@Override
	public void eliminarMateria(Materia materia) {
	repository.delete(materia);	
		
	}

	@Override
	public Materia obtenerMateria(Long idMateria) {
		
		return repository.findById(idMateria).get();
	}

	@Override
	public List<Materia> obtenerListaMateria() {
		
		return repository.findAll();
	}

}
