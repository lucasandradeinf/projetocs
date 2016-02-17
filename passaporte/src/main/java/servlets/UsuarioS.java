package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.LoginService;
import controle.PessoaBC;
import controle.UsuarioBC;
import bean.Pessoa;
import bean.Usuario;

@WebServlet("/UsuarioS")
public class UsuarioS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");

		if (op != null && op.equalsIgnoreCase("select")) {
			select(request, response);

			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else if (op != null && op.equalsIgnoreCase("insert")) {
			insert(request, response);

			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else if (op != null && op.equalsIgnoreCase("delete")) {
			delete(request, response);

			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else if (op != null && op.equalsIgnoreCase("update")) {
			update(request, response);

			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else if (op != null && op.equalsIgnoreCase("login")) {
			login(request, response);
		} else {
			operacaoDesconhecida(request, response);
		}
	}

	private void operacaoDesconhecida(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/index.html").forward(request, response);
	}

	private void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");

/*		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setSenha(senha);*/
		
		 LoginService loginService = new LoginService();
		 boolean result = loginService.authenticate(usuario, senha);
		 
		 if(result == true){
			 Usuario u = loginService.getUsuarioByUsuarioNome(usuario);
			 request.getSession().setAttribute("usuario", u);
			 
			 //Usuario teste = (Usuario)request.getSession().getAttribute("usuario");
			 response.sendRedirect("index.jsp");
		 }
		 else{
			 response.sendRedirect("login.jsp");
		 }

	}
	
	private void select(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		// pessoa
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		/* String idade = request.getParameter("idade"); */
		String sexo = request.getParameter("sexo");
		String nacionalidade = request.getParameter("nacionalidade");

		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setSenha(senha);
		// pessoa
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setEmail(email);
		/* p.setIdade(idade); */
		p.setSexo(sexo);
		p.setNacionalidade(nacionalidade);

		UsuarioBC ubc = new UsuarioBC();
		ubc.select(u);

		PessoaBC pbc = new PessoaBC();
		pbc.select(p);

		// request.getRequestDispatcher("index.html").forward(request,response);

		// response.sendRedirect("cadastro2.html");
	}

	private void insert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		// pessoa
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String sexo = request.getParameter("sexo");
		String nacionalidade = request.getParameter("nacionalidade");

		Pessoa p = new Pessoa();
		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setSenha(senha);
		// pessoa
		p.setNome(nome);
		p.setEmail(email);
		p.setSexo(sexo);
		p.setNacionalidade(nacionalidade);

		
		PessoaBC pbc = new PessoaBC();
		pbc.insert(p);
		
		UsuarioBC ubc = new UsuarioBC();
		ubc.insert(u);
		
		

		request.setAttribute("usuario", u);
		// request.getRequestDispatcher("index.html").forward(request,response);
	}

	private void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		// pessoa
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		/* String idade = request.getParameter("idade"); */
		String sexo = request.getParameter("sexo");
		String nacionalidade = request.getParameter("nacionalidade");

		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setSenha(senha);
		// pessoa
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setEmail(email);
		/* p.setIdade(idade); */
		p.setSexo(sexo);
		p.setNacionalidade(nacionalidade);

		UsuarioBC ubc = new UsuarioBC();
		ubc.delete(u);

		request.setAttribute("usuario", u);
		// request.getRequestDispatcher("index.html").forward(request,response);
	}

	private void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		// pessoa
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		/* String idade = request.getParameter("idade"); */
		String sexo = request.getParameter("sexo");
		String nacionalidade = request.getParameter("nacionalidade");

		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setSenha(senha);
		// pessoa
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setEmail(email);
		/* p.setIdade(idade); */
		p.setSexo(sexo);
		p.setNacionalidade(nacionalidade);

		UsuarioBC ubc = new UsuarioBC();
		ubc.update(u);

		request.setAttribute("usuario", u);
		// request.getRequestDispatcher("index.html").forward(request,response);
	}

}
