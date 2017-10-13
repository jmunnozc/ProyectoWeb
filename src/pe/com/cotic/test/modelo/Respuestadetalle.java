package pe.com.cotic.test.modelo;

// Generated 13/10/2017 03:11:51 PM by Hibernate Tools 3.4.0.CR1

/**
 * Respuestadetalle generated by hbm2java
 */
public class Respuestadetalle implements java.io.Serializable {

	private Integer codigoRespuestaDetalle;
	private Pregunta pregunta;
	private Respuestacabecera respuestacabecera;
	private Alternativa alternativa;
	private int flagAlternativaCorrecta;

	public Respuestadetalle() {
	}

	public Respuestadetalle(Pregunta pregunta,
			Respuestacabecera respuestacabecera, Alternativa alternativa,
			int flagAlternativaCorrecta) {
		this.pregunta = pregunta;
		this.respuestacabecera = respuestacabecera;
		this.alternativa = alternativa;
		this.flagAlternativaCorrecta = flagAlternativaCorrecta;
	}

	public Integer getCodigoRespuestaDetalle() {
		return this.codigoRespuestaDetalle;
	}

	public void setCodigoRespuestaDetalle(Integer codigoRespuestaDetalle) {
		this.codigoRespuestaDetalle = codigoRespuestaDetalle;
	}

	public Pregunta getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public Respuestacabecera getRespuestacabecera() {
		return this.respuestacabecera;
	}

	public void setRespuestacabecera(Respuestacabecera respuestacabecera) {
		this.respuestacabecera = respuestacabecera;
	}

	public Alternativa getAlternativa() {
		return this.alternativa;
	}

	public void setAlternativa(Alternativa alternativa) {
		this.alternativa = alternativa;
	}

	public int getFlagAlternativaCorrecta() {
		return this.flagAlternativaCorrecta;
	}

	public void setFlagAlternativaCorrecta(int flagAlternativaCorrecta) {
		this.flagAlternativaCorrecta = flagAlternativaCorrecta;
	}

}
