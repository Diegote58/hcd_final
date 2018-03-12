package com.sistema.entity.consulta;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.sistema.entity.Profesional;
import com.sistema.entity.Persona;

@Entity
@Table(name = "consulta")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date fecha;
	private String anamnesis;
	private String exploracion;
	private String observaciones;
	private String permisos;

	@ManyToOne
	@JoinColumn(name = "historia_clinica_id")
	private HistoriaClinica historia;

	@ManyToOne
	@JoinColumn(name = "persona_id")
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name = "profesional_id")
	private Profesional profesional;
	

	@OneToOne(mappedBy = "consulta", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Diagnostico diagnostico;

	public Consulta() {
	}

	public Consulta(String anamnesis, String exploracion, String observaciones, HistoriaClinica historia,
			Persona persona, Diagnostico diagnostico) {
		super();
		this.anamnesis = anamnesis;
		this.exploracion = exploracion;
		this.observaciones = observaciones;
		this.historia = historia;
		this.persona = persona;
		this.diagnostico = diagnostico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getAnamnesis() {
		return anamnesis;
	}

	public void setAnamnesis(String anamnesis) {
		this.anamnesis = anamnesis;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public HistoriaClinica getHistoria() {
		return historia;
	}

	public void setHistoria(HistoriaClinica historia) {
		this.historia = historia;
	}

	

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Profesional getProfesional() {
		return profesional;
	}

	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}

	public String getExploracion() {
		return exploracion;
	}

	public void setExploracion(String exploracion) {
		this.exploracion = exploracion;
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getPermisos() {
		return permisos;
	}

	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}


}
