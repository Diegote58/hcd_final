package com.sistema.entity.consulta;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.sistema.entity.antecedentes.Antecedentes;
import com.sistema.entity.consulta.Consulta;

@Entity
@Table(name = "ficha")
public class Ficha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ficha;
	private Timestamp fecha;
	private String alergias;
	private String vacunas;
	private String tratamientoHabitual;
	private String enfermedadesCronicas;

	@OneToOne
	@JoinColumn(name = "consulta_id")
	private Consulta consulta;

	@OneToOne(mappedBy = "ficha", orphanRemoval = true)
	private Antecedentes antecedentes;

	public Ficha() {

	}

	public Ficha(int id_ficha, String vacunas, String tratamientoHabitual, String enfermedadesCronicas,
			Consulta consulta) {
		super();
		this.id_ficha = id_ficha;
		this.vacunas = vacunas;
		this.tratamientoHabitual = tratamientoHabitual;
		this.enfermedadesCronicas = enfermedadesCronicas;
		this.consulta = consulta;
	}

	public int getId_ficha() {
		return id_ficha;
	}

	public void setId_ficha(int id_ficha) {
		this.id_ficha = id_ficha;
	}

	public String getVacunas() {
		return vacunas;
	}

	public void setVacunas(String vacunas) {
		this.vacunas = vacunas;
	}

	public String getTratamientoHabitual() {
		return tratamientoHabitual;
	}

	public void setTratamientoHabitual(String tratamientoHabitual) {
		this.tratamientoHabitual = tratamientoHabitual;
	}

	public String getEnfermedadesCronicas() {
		return enfermedadesCronicas;
	}

	public void setEnfermedadesCronicas(String enfermedadesCronicas) {
		this.enfermedadesCronicas = enfermedadesCronicas;
	}

	public Consulta getHistoria() {
		return consulta;
	}

	public void setHistoria(Consulta consulta) {
		this.consulta = consulta;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public Antecedentes getAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(Antecedentes antecedentes) {
		this.antecedentes = antecedentes;
	}

	@Override
	public String toString() {
		return "Ficha [id_ficha=" + id_ficha + ", fecha=" + fecha + ", alergias=" + alergias + ", vacunas=" + vacunas
				+ ", tratamientoHabitual=" + tratamientoHabitual + ", enfermedadesCronicas=" + enfermedadesCronicas
				+ ", consulta=" + consulta + "]";
	}

}
