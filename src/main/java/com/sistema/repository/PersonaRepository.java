package com.sistema.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sistema.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

	@Query("SELECT p FROM Persona p WHERE Concat(p.nombre, p.apellido1, p.apellido2, p.nroDocumento) LIKE CONCAT('%',:search,'%')")
	List<Persona> searchPersonas(@Param("search") String search);
	
}
