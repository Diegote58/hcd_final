package com.sistema.constant;

public interface ConstantConfig {

	
	
	public static final String LOGIN = "Login";
	public static final String LOGOUT = "Logout";
	/* Manejo de permisos PUBLIC - visible por el paciente inclusive PROTECTED -
	 * visible por cualquier médico CONFIDENTIAL - visible solo por el
	 * professional que hizo la consulta.*/
	public static final String PERMISOS_CONSULTA_PUBLIC = "PUBLIC";
	public static final String PERMISOS_CONSULTA_PROTECTED = "PROTECTED";
	public static final String PERMISOS_CONSULTA_CONFIDENTIAL = "CONFIDENTIAL";

	public static final String ROL_PACIENTE = "PACIENTE";
	public static final String ROL_PROFESIONAL = "PROFESIONAL";
	public static final String ROL_ENFERMERO = "ENFERMERO";
	public static final String ROL_ADMIN = "ADMIN";
}
