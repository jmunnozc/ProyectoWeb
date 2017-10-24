package pe.com.cotic.test.modelo;

// Generated 23/10/2017 02:29:43 PM by Hibernate Tools 3.4.0.CR1

/**
 * Reporteusuarioscursos generated by hbm2java
 */
public class Reporteusuarioscursos implements java.io.Serializable {

	private int codigoRespuestaCabecera;
	private Integer codigoUsuario;
	private Integer codigoPortafolio;
	private String fechaRespuesta;
	private Integer cantidadPreguntas;
	private Integer cantidadCorrectas;
	private Integer cantidadIncorrectas;
	private Double porcentajeCorrectas;
	private Double porcentajeIncorrectas;
	private String nombreUsuarioFull;
	private String tituloPortafolio;
	private Integer codigoInstitucion;
	private Integer cantidadNocontestadas;
	private Double porcentajeNocontestadas;

	public Reporteusuarioscursos() {
	}

	public Reporteusuarioscursos(int codigoRespuestaCabecera) {
		this.codigoRespuestaCabecera = codigoRespuestaCabecera;
	}

	public Reporteusuarioscursos(int codigoRespuestaCabecera,
			Integer codigoUsuario, Integer codigoPortafolio,
			String fechaRespuesta, Integer cantidadPreguntas,
			Integer cantidadCorrectas, Integer cantidadIncorrectas,
			Double porcentajeCorrectas, Double porcentajeIncorrectas,
			String nombreUsuarioFull, String tituloPortafolio,
			Integer codigoInstitucion, Integer cantidadNocontestadas,
			Double porcentajeNocontestadas) {
		this.codigoRespuestaCabecera = codigoRespuestaCabecera;
		this.codigoUsuario = codigoUsuario;
		this.codigoPortafolio = codigoPortafolio;
		this.fechaRespuesta = fechaRespuesta;
		this.cantidadPreguntas = cantidadPreguntas;
		this.cantidadCorrectas = cantidadCorrectas;
		this.cantidadIncorrectas = cantidadIncorrectas;
		this.porcentajeCorrectas = porcentajeCorrectas;
		this.porcentajeIncorrectas = porcentajeIncorrectas;
		this.nombreUsuarioFull = nombreUsuarioFull;
		this.tituloPortafolio = tituloPortafolio;
		this.codigoInstitucion = codigoInstitucion;
		this.cantidadNocontestadas = cantidadNocontestadas;
		this.porcentajeNocontestadas = porcentajeNocontestadas;
	}

	public int getCodigoRespuestaCabecera() {
		return this.codigoRespuestaCabecera;
	}

	public void setCodigoRespuestaCabecera(int codigoRespuestaCabecera) {
		this.codigoRespuestaCabecera = codigoRespuestaCabecera;
	}

	public Integer getCodigoUsuario() {
		return this.codigoUsuario;
	}

	public void setCodigoUsuario(Integer codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public Integer getCodigoPortafolio() {
		return this.codigoPortafolio;
	}

	public void setCodigoPortafolio(Integer codigoPortafolio) {
		this.codigoPortafolio = codigoPortafolio;
	}

	public String getFechaRespuesta() {
		return this.fechaRespuesta;
	}

	public void setFechaRespuesta(String fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}

	public Integer getCantidadPreguntas() {
		return this.cantidadPreguntas;
	}

	public void setCantidadPreguntas(Integer cantidadPreguntas) {
		this.cantidadPreguntas = cantidadPreguntas;
	}

	public Integer getCantidadCorrectas() {
		return this.cantidadCorrectas;
	}

	public void setCantidadCorrectas(Integer cantidadCorrectas) {
		this.cantidadCorrectas = cantidadCorrectas;
	}

	public Integer getCantidadIncorrectas() {
		return this.cantidadIncorrectas;
	}

	public void setCantidadIncorrectas(Integer cantidadIncorrectas) {
		this.cantidadIncorrectas = cantidadIncorrectas;
	}

	public Double getPorcentajeCorrectas() {
		return this.porcentajeCorrectas;
	}

	public void setPorcentajeCorrectas(Double porcentajeCorrectas) {
		this.porcentajeCorrectas = porcentajeCorrectas;
	}

	public Double getPorcentajeIncorrectas() {
		return this.porcentajeIncorrectas;
	}

	public void setPorcentajeIncorrectas(Double porcentajeIncorrectas) {
		this.porcentajeIncorrectas = porcentajeIncorrectas;
	}

	public String getNombreUsuarioFull() {
		return this.nombreUsuarioFull;
	}

	public void setNombreUsuarioFull(String nombreUsuarioFull) {
		this.nombreUsuarioFull = nombreUsuarioFull;
	}

	public String getTituloPortafolio() {
		return this.tituloPortafolio;
	}

	public void setTituloPortafolio(String tituloPortafolio) {
		this.tituloPortafolio = tituloPortafolio;
	}

	public Integer getCodigoInstitucion() {
		return this.codigoInstitucion;
	}

	public void setCodigoInstitucion(Integer codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}

	public Integer getCantidadNocontestadas() {
		return this.cantidadNocontestadas;
	}

	public void setCantidadNocontestadas(Integer cantidadNocontestadas) {
		this.cantidadNocontestadas = cantidadNocontestadas;
	}

	public Double getPorcentajeNocontestadas() {
		return this.porcentajeNocontestadas;
	}

	public void setPorcentajeNocontestadas(Double porcentajeNocontestadas) {
		this.porcentajeNocontestadas = porcentajeNocontestadas;
	}

}
