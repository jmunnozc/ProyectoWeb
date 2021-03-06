package pe.com.cotic.test.daoImpl;

import java.util.List;

import javax.faces.context.FacesContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;




import pe.com.cotic.test.dao.ReporteUsuariosCursosDao;
import pe.com.cotic.test.modelo.Reporteusuarioscursos;
import pe.com.cotic.test.modelo.Reporteusuarioscursospuestos;
import pe.com.cotic.test.modelo.Usuario;
import pe.com.cotic.test.util.HibernateUtil;

public class ReporteUsuariosCursosDaoImpl implements ReporteUsuariosCursosDao {

	private Session session;
	
	@Override
	public List<Reporteusuarioscursos> listarReporteUsuariosCursos() {

		List<Reporteusuarioscursos> listarReporteUsuariosCursos = null;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Usuario usuario = null;
		String hql = "";
		
		String administrador = System.getProperty("usuario_administrador") != null ? System.getProperty("usuario_administrador") : "";
		usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
		
		/*hql = "SELECT distinct rc.usuario.codigoUsuario, rc.portafolio.codigoPortafolio, p.codigoNivel "
					+ "FROM Respuestacabecera AS rc INNER JOIN rc.portafolio p "
					+ "WHERE p.codigoNivel = 3 ";
		Query query = session.createQuery(hql);*/
		
		
		/*List<ArrayList> lista = new ArrayList<ArrayList>();
		lista = session.createQuery(hql).list();
		
		Query callStoredProcedure_MYSQL = session.createSQLQuery("CALL reporteUsuariosCursos (:param1, :param2, :param3)").addEntity(Reporte.class);
		callStoredProcedure_MYSQL.setInteger("param1", 1);
		callStoredProcedure_MYSQL.setInteger("param2", 2);
		callStoredProcedure_MYSQL.setInteger("param3", 1);
		transaction.commit();	*/
		
		/*Query callStoredProcedure_MYSQL = session.createSQLQuery("CALL cursorCanga").addEntity(Reporteusuarioscursos.class);
		transaction.commit();*/
		
		
		String hql1 = "";
		if (administrador.toUpperCase().equals(usuario.getCorreo().toUpperCase().trim()) ) {
			hql1 = "FROM Reporteusuarioscursos AS r WHERE r.codigoInstitucion =" + usuario.getInstitucion().getCodigoInstitucion() + " ORDER BY r.tituloPortafolio, r.nombreUsuarioFull, r.fechaRespuesta ";
		} else {
			hql1 = "FROM Reporteusuarioscursos AS r WHERE r.codigoUsuario =" + usuario.getCodigoUsuario() + " and r.codigoInstitucion =" + usuario.getInstitucion().getCodigoInstitucion() + " ORDER BY r.tituloPortafolio, r.nombreUsuarioFull, r.fechaRespuesta ";
		}
				
		try {
			listarReporteUsuariosCursos = session.createQuery(hql1).list();
			transaction.commit();
			session.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		
		return listarReporteUsuariosCursos;
		
	}

}
