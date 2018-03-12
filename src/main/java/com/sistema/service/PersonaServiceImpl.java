package com.sistema.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sistema.entity.Persona;
import com.sistema.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Resource
	PersonaRepository personaRepository;
	
	@Override
	public void save(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	@Override
	public List<Persona> findAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findAllProfesionales() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findAllPacientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona findByDNI(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona findByMail(String m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findByNamePacientes(String apellido1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona findByDNIPacientes(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findPacientesSinHistoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> searchPersona(String search) {
		return personaRepository.searchPersonas(search);
	}

}
