package controle;

import dao.CidadeDao;
import dao.UsuarioDao;
import bean.Cidade;
import bean.Usuario;


public class CidadeBC {
	public void insert(Cidade c){
		CidadeDao cd = new CidadeDao();
		cd.insert(c);
	}
	public void update(Cidade c){
		CidadeDao cd = new CidadeDao();
		cd.update(c);
	}
	
	public void delete(Cidade c){
		CidadeDao cd = new CidadeDao();
		cd.delete(c);
	}
	
	public void select(Cidade c){
		CidadeDao cd = new CidadeDao();
		cd.select(c);
	}
}

