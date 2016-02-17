package controle;

import dao.UsuarioDao;
import bean.Usuario;


public class UsuarioBC {
	public void insert(Usuario u){
		UsuarioDao ud = new UsuarioDao();
		ud.insert(u);
	}
	
	public void update(Usuario u){
		UsuarioDao ud = new UsuarioDao();
		ud.update(u);
	}
	
	public void delete(Usuario u){
		UsuarioDao ud = new UsuarioDao();
		ud.delete(u);
	}
	
	public void select(Usuario u){
		UsuarioDao ud = new UsuarioDao();
		ud.select(u);
	}
}