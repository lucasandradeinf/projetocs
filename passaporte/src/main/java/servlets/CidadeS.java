package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controle.CidadeBC;
import controle.UsuarioBC;
import bean.Cidade;
import bean.Usuario;

@WebServlet("/CidadeS")
public class CidadeS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		
		if (op != null && op.equalsIgnoreCase("select")) {
			select(request, response);
		} else {
			operacaoDesconhecida(request, response);
		}
		
		if (op != null && op.equalsIgnoreCase("insert")) {
			insert(request, response);
		} else {
			operacaoDesconhecida(request, response);
		}
		
		if (op != null && op.equalsIgnoreCase("delete")) {
			delete(request, response);
		} else {
			operacaoDesconhecida(request, response);
		}
		
		if (op != null && op.equalsIgnoreCase("update")) {
			update(request, response);
		} else {
			operacaoDesconhecida(request, response);
		}
	}

	private void operacaoDesconhecida(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/pagina-qualquer.jsp").forward(request, response);
	}

	private void select(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String estado = request.getParameter("estado");
		String descricao = request.getParameter("descricao");
		String linkImagem = request.getParameter("linkImagem");
		
		Cidade c = new Cidade();
		c.setNome(nome);
		c.setUf(estado);
		c.setDescricao(descricao);
		c.setLinkImagem(linkImagem);
		
		CidadeBC cbc = new CidadeBC();
		cbc.select(c);
		
		request.setAttribute("cidade", c);
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		
		//response.sendRedirect("cadastro2.html");
	}
	
	private void insert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setSenha(senha);
		
		UsuarioBC ubc = new UsuarioBC();
		ubc.insert(u);
		
		request.setAttribute("usuario", u);
		request.getRequestDispatcher("/cadastro2.jsp").forward(request, response);
	}
	
	private void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setSenha(senha);
		
		UsuarioBC ubc = new UsuarioBC();
		ubc.delete(u);
		
		request.setAttribute("usuario", u);
		request.getRequestDispatcher("/cadastro2.jsp").forward(request, response);
	}
	
	private void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setSenha(senha);
		
		UsuarioBC ubc = new UsuarioBC();
		ubc.update(u);
		
		request.setAttribute("usuario", u);
		request.getRequestDispatcher("/cadastro2.jsp").forward(request, response);
	}

}
