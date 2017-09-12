package pe.com.cotic.test.modelo;

// Generated 12/09/2017 11:38:48 AM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Institucionrol generated by hbm2java
 */
public class Institucionrol implements java.io.Serializable {

	private Integer codigoInstitucionRol;
	private Rol rol;
	private Institucion institucion;
	private Set usuarios = new HashSet(0);

	public Institucionrol() {
	}

	public Institucionrol(Rol rol, Institucion institucion) {
		this.rol = rol;
		this.institucion = institucion;
	}

	public Institucionrol(Rol rol, Institucion institucion, Set usuarios) {
		this.rol = rol;
		this.institucion = institucion;
		this.usuarios = usuarios;
	}

	public Integer getCodigoInstitucionRol() {
		return this.codigoInstitucionRol;
	}

	public void setCodigoInstitucionRol(Integer codigoInstitucionRol) {
		this.codigoInstitucionRol = codigoInstitucionRol;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Institucion getInstitucion() {
		return this.institucion;
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

	public Set getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set usuarios) {
		this.usuarios = usuarios;
	}

}