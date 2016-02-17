package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Pessoa;
import util.HibernateUtil;

public class PessoaDao {
	private SessionFactory factory = 
			HibernateUtil.getSessionFactory();
	
	public void insert(Pessoa p){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(p);
		tx.commit();
		s.close();
	}
	
	public void update(Pessoa p){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.update(p);
		tx.commit();
		s.close();
	}
	
	public void delete(Pessoa p){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(p);
		tx.commit();
		s.close();
	}
	
	public Pessoa select(Pessoa p){
		Session s  = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.equals(p);
		tx.commit();
		s.close();
		
		return p;
	}
}