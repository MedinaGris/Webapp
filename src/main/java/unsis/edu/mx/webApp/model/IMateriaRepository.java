package unsis.edu.mx.webApp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unsis.edu.mx.webApp.entity.Materia;
@Repository//genera todo el crud
public interface IMateriaRepository extends JpaRepository<Materia, Long>{

}
