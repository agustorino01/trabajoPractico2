package org.tp2.Lugar;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Lugar {
	
	@Column(length=80) @Required
	private String aulas_teoria;
	
	@Column(length=80) @Required
	private String aulas_taller;
	
	@Id @Column(length=80) @Required
	private String Disponible;
	
	@Column(length=80) @Required
	private String gimnacio; 
	
	public String getGimnacio() {
		return gimnacio;
	}

	public void setGimnacio(String gimnacio) {
		this.gimnacio = gimnacio;
	}

	public String getDisponible() {
		return Disponible;
	}

	public void setDisponible(String disponible) {
		Disponible = disponible;
	}

	public String getAulas_teoria() {
		return aulas_teoria;
	}

	public void setAulas_teoria(String aulas_teoria) {
		this.aulas_teoria = aulas_teoria;
	}

	public String getAulas_taller() {
		return aulas_taller;
	}

	public void setAulas_taller(String aulas_taller) {
		this.aulas_taller = aulas_taller;
	}
	
}
