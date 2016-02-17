package services;


import bean.Usuario;

import util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LoginService {
public boolean authenticate(String user, String senha) {
	 Usuario u = getUsuarioByUsuarioNome(user);		
	 if(u!=null && u.getUsuario().equals(user) && u.getSenha().equals(senha)){
		 return true;
	 }else{
		 return false;
	 }
}
public Usuario getUsuarioByUsuarioNome(String u) {
	 Session session = HibernateUtil.openSession();
	 Transaction tx = null;
	 Usuario user = null;
	 try {
		 tx = session.getTransaction();
		 tx.begin();
		 Query query = session.createQuery("from Usuario where usuario='"+u+"'");
		 user = (Usuario)query.uniqueResult();
		 tx.commit();
	 } catch (Exception e) {
		 if (tx != null) {
			 tx.rollback();
		 }
		 e.printStackTrace();
	 } finally {
		 session.close();
	 }
	 return user;
}
}