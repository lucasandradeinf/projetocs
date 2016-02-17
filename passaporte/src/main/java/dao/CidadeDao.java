package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Cidade;
import util.HibernateUtil;

public class CidadeDao {
	private SessionFactory factory = 
			HibernateUtil.getSessionFactory();
	
	public void insert(Cidade c){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(c);
		tx.commit();
		s.close();
	}
	
	public void update(Cidade c){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.update(c);
		tx.commit();
		s.close();
	}
	
	public void delete(Cidade c){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(c);
		tx.commit();
		s.close();
	}
	
	public Cidade select(Cidade c){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.equals(c);
		tx.commit();
		s.close();
		
		return c;
	}
	
}