package org.tp2.Escuela;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Escuela {
	
	@Id @Column(length=50) @Required
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
