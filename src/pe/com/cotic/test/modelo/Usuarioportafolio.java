package pe.com.cotic.test.modelo;

// Generated 13/10/2017 03:11:51 PM by Hibernate Tools 3.4.0.CR1

/**
 * Usuarioportafolio generated by hbm2java
 */
public class Usuarioportafolio implements java.io.Serializable {

	private Integer codigoUsuarioPortafolio;
	private Nivel nivel;
	private Usuario usuario;
	private Portafolio portafolioByCodigoPortafolio;
	private Portafolio portafolioByCodigoPortafolioEnlace;

	public Usuarioportafolio() {
	}

	public Usuarioportafolio(Nivel nivel,
			Portafolio portafolioByCodigoPortafolio) {
		this.nivel = nivel;
		this.portafolioByCodigoPortafolio = portafolioByCodigoPortafolio;
	}

	public Usuarioportafolio(Nivel nivel, Usuario usuario,
			Portafolio portafolioByCodigoPortafolio,
			Portafolio portafolioByCodigoPortafolioEnlace) {
		this.nivel = nivel;
		this.usuario = usuario;
		this.portafolioByCodigoPortafolio = portafolioByCodigoPortafolio;
		this.portafolioByCodigoPortafolioEnlace = portafolioByCodigoPortafolioEnlace;
	}

	public Integer getCodigoUsuarioPortafolio() {
		return this.codigoUsuarioPortafolio;
	}

	public void setCodigoUsuarioPortafolio(Integer codigoUsuarioPortafolio) {
		this.codigoUsuarioPortafolio = codigoUsuarioPortafolio;
	}

	public Nivel getNivel() {
		return this.nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Portafolio getPortafolioByCodigoPortafolio() {
		return this.portafolioByCodigoPortafolio;
	}

	public void setPortafolioByCodigoPortafolio(
			Portafolio portafolioByCodigoPortafolio) {
		this.portafolioByCodigoPortafolio = portafolioByCodigoPortafolio;
	}

	public Portafolio getPortafolioByCodigoPortafolioEnlace() {
		return this.portafolioByCodigoPortafolioEnlace;
	}

	public void setPortafolioByCodigoPortafolioEnlace(
			Portafolio portafolioByCodigoPortafolioEnlace) {
		this.portafolioByCodigoPortafolioEnlace = portafolioByCodigoPortafolioEnlace;
	}

}
