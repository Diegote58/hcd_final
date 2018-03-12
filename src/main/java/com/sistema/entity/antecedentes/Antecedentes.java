package com.sistema.entity.antecedentes;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.sistema.entity.consulta.Ficha;

@Entity
@Table(name="antecedentes")
public class Antecedentes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_antecedentes;
	
	private Timestamp fecha;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ficha_id")
	private Ficha ficha;

	@OneToOne(mappedBy="antecedentes")
	private HabitosToxicos habitos;

	@OneToOne(mappedBy="antecedentes")
	private Familiares familiares;
	
	@OneToOne(mappedBy="antecedentes")
	private Fisiologicos fisiologicos;
	
	@OneToOne(mappedBy="antecedentes")
	private Patologicos patologicos;
	
	@OneToOne(mappedBy="antecedentes")
	private Ginecologicos ginecologicos;
	
	public Antecedentes() {
		super();
	}

	public Antecedentes(Ficha ficha, HabitosToxicos habitos, Familiares familiares, Fisiologicos fisiologicos,Patologicos patologicos,Ginecologicos ginecologicos) {
		super();
		this.ficha = ficha;
		this.habitos = habitos;
		this.familiares = familiares;
		this.fisiologicos = fisiologicos;
		this.patologicos = patologicos;
		this.ginecologicos = ginecologicos;
	}

	public int getId_antecedentes() {
		return id_antecedentes;
	}

	public void setId_antecedentes(int id_antecedentes) {
		this.id_antecedentes = id_antecedentes;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	
	
	public HabitosToxicos getHabitos() {
		return habitos;
	}

	public void setHabitos(HabitosToxicos habitos) {
		this.habitos = habitos;
	}

	public Familiares getFamiliares() {
		return familiares;
	}

	public void setFamiliares(Familiares familiares) {
		this.familiares = familiares;
	}

	public Fisiologicos getFisiologicos() {
		return fisiologicos;
	}

	public void setFisiologicos(Fisiologicos fisiologicos) {
		this.fisiologicos = fisiologicos;
	}

	public Patologicos getPatologicos() {
		return patologicos;
	}

	public void setPatologicos(Patologicos patologicos) {
		this.patologicos = patologicos;
	}
	
	
	

	
	

	
	
	

	
	
}
