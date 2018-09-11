package org.tp2.Horarios;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Horarios {
	
	@Id @Column(length=80) @Required
	private String horario_teoria;
	
	@Column(length=80) @Required
	private String horarios_taller;
	
	@Column(length=80) @Required
	private String ed_fisica;
	
	public String getHorario_teoria() {
		return horario_teoria;
	}

	public void setHorario_teoria(String horario_teoria) {
		this.horario_teoria = horario_teoria;
	}

	public String getHorarios_taller() {
		return horarios_taller;
	}

	public void setHorarios_taller(String horarios_taller) {
		this.horarios_taller = horarios_taller;
	}

	public String getEd_fisica() {
		return ed_fisica;
	}

	public void setEd_fisica(String ed_fisica) {
		this.ed_fisica = ed_fisica;
	}

	
}
