package pe.com.cotic.test.modelo;

// Generated 17/11/2017 11:16:10 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol implements java.io.Serializable {

	private Integer codigoRol;
	private String nombreRol;
	private String descripcionRol;
	private int estado;
	private Set rolmenus = new HashSet(0);
	private Set rolusuarios = new HashSet(0);

	public Rol() {
	}

	public Rol(String nombreRol, String descripcionRol, int estado) {
		this.nombreRol = nombreRol;
		this.descripcionRol = descripcionRol;
		this.estado = estado;
	}

	public Rol(String nombreRol, String descripcionRol, int estado,
			Set rolmenus, Set rolusuarios) {
		this.nombreRol = nombreRol;
		this.descripcionRol = descripcionRol;
		this.estado = estado;
		this.rolmenus = rolmenus;
		this.rolusuarios = rolusuarios;
	}

	public Integer getCodigoRol() {
		return this.codigoRol;
	}

	public void setCodigoRol(Integer codigoRol) {
		this.codigoRol = codigoRol;
	}

	public String getNombreRol() {
		return this.nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	public String getDescripcionRol() {
		return this.descripcionRol;
	}

	public void setDescripcionRol(String descripcionRol) {
		this.descripcionRol = descripcionRol;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Set getRolmenus() {
		return this.rolmenus;
	}

	public void setRolmenus(Set rolmenus) {
		this.rolmenus = rolmenus;
	}

	public Set getRolusuarios() {
		return this.rolusuarios;
	}

	public void setRolusuarios(Set rolusuarios) {
		this.rolusuarios = rolusuarios;
	}

}
