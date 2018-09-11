package org.tp2.Alumno;
import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Alumno {
	
	@Column(length=12) @Required
	private int fecha_n;
	
	@Column(length=100) @Required
	private String ciudad;
	
	@Id @Column(length=100) @Required
	private String provincia;
	
	public int getFecha_n() {
		return fecha_n;
	}

	public void setFecha_n(int fecha_n) {
		this.fecha_n = fecha_n;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Column(length=100) @Required
	private String nacionalidad;

}
