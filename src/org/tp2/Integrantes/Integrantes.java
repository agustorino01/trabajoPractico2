package org.tp2.Integrantes;

import javax.persistence.*;

import org.openxava.annotations.*;

@MappedSuperclass
public class Integrantes {
	@RemoveSelectedAction(value = "")
	
	@Id @Column(length=30) @Required
	private int documento;
	
	@Column(length=100) @Required
	private String nombre;
	
	@Column(length=100) @Required
	private String apellido;
	
	@Column(length=100) @Required
	private String domicilio;

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
}
