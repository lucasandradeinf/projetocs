package controle;

import dao.PessoaDao;
import bean.Pessoa;


public class PessoaBC {
	public void insert(Pessoa p){
		PessoaDao pd = new PessoaDao();
		pd.insert(p);
	}
	
	public void update(Pessoa p){
		PessoaDao pd = new PessoaDao();
		pd.update(p);
	}
	
	public void delete(Pessoa p){
		PessoaDao pd = new PessoaDao();
		pd.delete(p);
	}
	
	public void select(Pessoa p){
		PessoaDao pd = new PessoaDao();
		pd.select(p);
	}
}