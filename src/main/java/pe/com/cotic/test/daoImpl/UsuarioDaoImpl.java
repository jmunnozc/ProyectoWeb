package pe.com.cotic.test.daoImpl;

import java.util.List;

import javax.faces.context.FacesContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pe.com.cotic.test.dao.UsuarioDao;
import pe.com.cotic.test.modelo.Institucion;
import pe.com.cotic.test.modelo.Usuario;
import pe.com.cotic.test.util.HibernateUtil;
import pe.com.cotic.test.util.Seguridad;

public class UsuarioDaoImpl implements UsuarioDao {

	private Session session;

	@Override
	public Usuario verificarDatos(Usuario usuario) {

		Usuario us = null;

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			if (usuario.getUsuario() == null) usuario.setUsuario("");
			if (usuario.getClave() == null) usuario.setClave("");			
			
			// hibernate query language
			/*String hql = "FROM Usuario WHERE usuario = '"
					+ usuario.getUsuario().toUpperCase() + "' and clave = '"
					+ usuario.getClave().toUpperCase() + "'";*/
			
			String hql = "FROM Usuario WHERE correo=:user AND clave=:pass";			
			Query query = session.createQuery(hql);
			query.setString("user", usuario.getUsuario().toUpperCase());
			query.setString("pass", Seguridad.fn_sEncrypting("PASSCANGA", usuario.getClave().toUpperCase()));
			
			if (!query.list().isEmpty()) {
				us = (Usuario) query.list().get(0);
			}
			
			/*Query query1 = session.createSQLQuery(
					"CALL autenticarUsuario(:param1,:param2)")
					.addEntity(Usuario.class)
					.setParameter("param1", usuario.getUsuario().toUpperCase())
					.setParameter("param2", Seguridad.fn_sEncrypting("PASSCANGA", usuario.getClave().toUpperCase()));
			
			
			if (!query1.list().isEmpty()) {
				us = (Usuario) query1.list().get(0);
			}*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return us;
	}

	@Override
	public Usuario verificarDatosSP(Usuario usuario) {
		
		Usuario us = null;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			Query callStoredProcedure_MYSQL = session.createSQLQuery("CALL autenticarUsuario (:param1, :param2)").addEntity(Usuario.class);
			callStoredProcedure_MYSQL.setString("param1", usuario.getUsuario().toUpperCase());
			callStoredProcedure_MYSQL.setString("param2", usuario.getClave().toUpperCase());
			transaction.commit();
			
			if (!callStoredProcedure_MYSQL.list().isEmpty()) {
				us = (Usuario) callStoredProcedure_MYSQL.list().get(0);
			}		
			session.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		return us;
	}
	
	@Override
	public List<Usuario> ListarUsuarios() {

		List<Usuario> listarUsuarios = null;
		Usuario usuario = null;
		usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		// hibernate query language [FROM Usuario as u INNER JOIN FETCH
		// u.usuariocursos LEFT JOIN FETCH u.usuariodispositivos]
		String hql = "FROM Usuario  AS usu "
				+	" WHERE usu.estado = 1 AND usu.institucion.codigoInstitucion = " + usuario.getInstitucion().getCodigoInstitucion();

		try {
			listarUsuarios = session.createQuery(hql).list();
			transaction.commit();
			session.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}

		return listarUsuarios;
	}

	@Override
	public boolean grabarUsuario(Usuario usuario) {
		boolean flag = false;		
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			usuario.setClave(Seguridad.fn_sEncrypting("PASSCANGA", usuario.getClave().toUpperCase()));
			
			session.save(usuario);
			transaction.commit();
			session.close();
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			flag = false;
			transaction.rollback();
		}
		return flag;
	}

	@Override
	public boolean modificarUsuario(Usuario usuario) {
		boolean flag = false;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(usuario);
			transaction.commit();
			session.close();
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			flag = false;
			transaction.rollback();
		}
		return flag;
	}

	@Override
	public boolean eliminarUsuario(Usuario usuario) {
		boolean flag = false;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.delete(usuario);
			transaction.commit();
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			flag = false;
			transaction.rollback();
		}
		return flag;
	}

	@Override
	public List<Institucion> ListarInstituciones(Usuario usuario) {

		List<Institucion> listarInstituciones = null;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "FROM Institucion ";

		try {
			listarInstituciones = session.createQuery(hql).list();
			transaction.commit();
			session.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		
		return listarInstituciones;
	}

}
