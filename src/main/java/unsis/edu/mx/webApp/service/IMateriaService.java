package unsis.edu.mx.webApp.service;

import java.util.List;

import unsis.edu.mx.webApp.entity.Materia;

public interface IMateriaService {
	public void crearMateria (Materia materia);
	public void actualizarMateria(Materia materia);
	public void eliminarMateria(Materia materia);
	public Materia obtenerMateria(Long idMateria);
	public List<Materia>obtenerListaMateria();
	
}
