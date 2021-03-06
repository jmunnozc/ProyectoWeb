package pe.com.cotic.test.dao;

import java.util.List;

import pe.com.cotic.test.modelo.Portafolio;
import pe.com.cotic.test.modelo.Pregunta;

public interface PreguntaDao {

	public List<Pregunta> ListarPreguntas();
	public boolean grabarPregunta(Pregunta pregunta);
	public boolean modificarPregunta(Pregunta pregunta);
	public boolean eliminarPregunta(Pregunta pregunta);

	public List<Portafolio> ListarPortafolios(Pregunta pregunta);
	public List<Pregunta> buscarPreguntaXCodigo(Pregunta pregunta);
	public List<Pregunta> buscarPreguntasPortafolio(Portafolio portafolio);
	
	public int ultimaPregunta();
}
