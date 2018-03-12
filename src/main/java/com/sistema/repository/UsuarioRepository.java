package com.sistema.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.sistema.entity.User;

@Repository
public interface UsuarioRepository extends JpaRepository<User, Serializable>{

	public User findByUsername(String username);

	@Query("SELECT u FROM User u WHERE u.username = :username")
	public User getByUsername(@Param("username") String username);
	
}
