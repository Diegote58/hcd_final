package com.sistema.service;

import java.util.List;

import com.sistema.entity.Persona;

public interface PersonaService {

	public void save(Persona persona);
	
	public void update(Persona persona);
	
	public void delete(Persona persona);
	
	public List<Persona> findAll();
	
	public List<Persona> findAllAdmins();
	
	public List<Persona> findAllProfesionales();
	
	public List<Persona> findAllPacientes();
	
	public Persona findById(int id);
	
	public Persona findByDNI(int dni);
	
	public List<Persona> findByName(String name);
	
	public Persona findByMail(String m);
	
	public List<Persona> findByNamePacientes(String apellido1);
	
 	public Persona findByDNIPacientes(int dni);
 	
	public List<Persona > findPacientesSinHistoria();
	
	public List<Persona> searchPersona(String search);
	
	
}
