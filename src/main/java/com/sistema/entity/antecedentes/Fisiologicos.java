package com.sistema.entity.antecedentes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fisiologicos")
public class Fisiologicos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String alimentacion;
	private String dipsia;
	private String diuresis;
	private String catarsis;
	private String somnia;
	private String otros;

	@OneToOne
	@JoinColumn(name = "antecedentes_id")
	private Antecedentes antecedentes;

	public Fisiologicos() {
	}

	public Fisiologicos(String alimentacion, String dipsia, String diuresis, String catarsis, String somnia,
			String otros, Antecedentes antecedentes) {
		super();
		this.alimentacion = alimentacion;
		this.dipsia = dipsia;
		this.diuresis = diuresis;
		this.catarsis = catarsis;
		this.somnia = somnia;
		this.otros = otros;
		this.antecedentes = antecedentes;
	}

	public int getId_fisiologicos() {
		return id;
	}

	public void setId_fisiologicos(int id_fisiologia) {
		this.id = id_fisiologia;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getDipsia() {
		return dipsia;
	}

	public void setDipsia(String dipsia) {
		this.dipsia = dipsia;
	}

	public String getDiuresis() {
		return diuresis;
	}

	public void setDiuresis(String diuresis) {
		this.diuresis = diuresis;
	}

	public String getCatarsis() {
		return catarsis;
	}

	public void setCatarsis(String catarsis) {
		this.catarsis = catarsis;
	}

	public String getSomnia() {
		return somnia;
	}

	public void setSomnia(String somnia) {
		this.somnia = somnia;
	}

	public String getOtros() {
		return otros;
	}

	public void setOtros(String otros) {
		this.otros = otros;
	}

	public Antecedentes getAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(Antecedentes antecedentes) {
		this.antecedentes = antecedentes;
	}

	@Override
	public String toString() {
		return "Fisiologicos [id_fisiologicos=" + id + ", alimentacion=" + alimentacion + ", dipsia=" + dipsia
				+ ", diuresis=" + diuresis + ", catarsis=" + catarsis + ", somnia=" + somnia + ", otros=" + otros
				+ ", antecedentes=" + antecedentes + "]";
	}

}
