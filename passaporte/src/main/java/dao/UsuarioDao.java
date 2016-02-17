package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import bean.Usuario;
import util.HibernateUtil;

public class UsuarioDao {
	private SessionFactory factory = 
			HibernateUtil.getSessionFactory();
	
	public void insert(Usuario u){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(u);
		tx.commit();
		s.close();
	}
	
	public void update(Usuario u){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.update(u);
		tx.commit();
		s.close();
	}
	
	public void delete(Usuario u){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(u);
		tx.commit();
		s.close();
	}
	
	public Usuario select(Usuario u){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.equals(u);
		tx.commit();
		s.close();
		
		return u;
	}
	
}