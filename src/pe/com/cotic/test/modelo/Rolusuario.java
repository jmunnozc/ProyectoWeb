package pe.com.cotic.test.modelo;

// Generated 13/10/2017 03:11:51 PM by Hibernate Tools 3.4.0.CR1

/**
 * Rolusuario generated by hbm2java
 */
public class Rolusuario implements java.io.Serializable {

	private Integer codigoRolUsuario;
	private Rol rol;
	private Usuario usuario;

	public Rolusuario() {
	}

	public Rolusuario(Rol rol, Usuario usuario) {
		this.rol = rol;
		this.usuario = usuario;
	}

	public Integer getCodigoRolUsuario() {
		return this.codigoRolUsuario;
	}

	public void setCodigoRolUsuario(Integer codigoRolUsuario) {
		this.codigoRolUsuario = codigoRolUsuario;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
