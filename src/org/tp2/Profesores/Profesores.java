package org.tp2.Profesores;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Profesores {
	
	@Id @Column(length=100) @Required
	private String familia;

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}
	

}
