<!-- Página que vai ser a pagina principal, quando vc abre o sistema ele mostra essa tela
	que deve conter os menus de usuário e as fotos com as cidades. -->

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>Passaporte</title>
	<!-- BOOTSTRAP STYLES-->
	<link href="assets/css/bootstrap.css" rel="stylesheet" />
	<!-- FONTAWESOME STYLES-->
	<link href="assets/css/font-awesome.css" rel="stylesheet" />
	<!-- MORRIS CHART STYLES-->
	<link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
	<!-- CUSTOM STYLES-->
	<link href="assets/css/custom.css" rel="stylesheet" />
	<link href="assets/css/styles.css" rel="stylesheet">
	<!-- GOOGLE FONTS-->
	<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
	
<body>
	<div id="wrapper">
	
		<!-- Cabeçalho, com a sessão do usuario logado e botão de sair. -->
		<nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
					<span class="sr-only">Toggle navigation</span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">Viajante</a>
			</div>
			
			<!-- Colocar validação pra pegar a sessão do nome do usuário e colocar na frase de bem-vindo. -->
			<div style="color: white; padding: 15px 50px 5px 50px; float: right; font-size: 11px;"> Bem vindo Viajante!!! &nbsp; 
			<a href="login.jsp" class="btn btn-danger square-btn-adjust">Sair</a>
				<%session.invalidate();%>
			</div>
		</nav>
		<!-- /. NAV TOP  -->

		<!-- Menu lateral, com as opções de acesso -->
		<nav class="navbar-default navbar-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav" id="main-menu">
					<li class="text-center"><img src="assets/img/find_user.png" class="user-image img-responsive" /></li>
					<li><a href="perfil.html"><i class="fa fa-rocket fa-3x"></i> Perfil</a></li>
					<li><a href="index.html"><i class="fa fa-bar-chart-o fa-3x"></i> Cidades</a></li>
					<li><a href="viagens.html"><i class="fa fa-table fa-3x"></i> Viagens</a></li>
					<li><a href="cadastro2.html"><i class="fa fa-edit fa-3x"></i> Cadastrar novo Viajante</a></li>
					<li><a href="cadastroCidade.jsp"><i class="fa fa-edit fa-3x"></i> Cadastrar nova cidade</a></li>
				</ul>
			</div>
		</nav>
		<!-- /. NAV SIDE  -->

		<!-- Conteúdo do corpo da página, aquele miolo lá -->
		<div id="page-wrapper">
			<div id="page-inner">
			
				<div class="row">
					<div class="col-md-4 ">
						<a href="cidades/campogrande.html"> <img src="http://atitudeenegocios.com/wp-content/uploads/2014/11/casinha-praia-wallpaper.jpg" alt="Smiley face" class="tamanhoFoto"></a>
						<p>Campo Grande</p>
					</div>
					<div class="col-md-4 ">
						<a href="#"> <img src="http://t2.gstatic.com/images?q=tbn:ANd9GcSBBRFDQGyY91IhiqIvXjEmd_bQa1qzooURyNQRYeOMQ2A7oBnmxQ" alt="Smiley face" class="tamanhoFoto"></a>
						<p>Anápolis</p>
					</div>
					<div class="col-md-4 ">
						<a href="cidades/rio.html"> <img src="http://t2.gstatic.com/images?q=tbn:ANd9GcTEKlJYMBqAO4_HqX8gOfRAfaIk6ZH3-iz-xQmIQ96uMpOmMJHbyw" alt="Smiley face" class="tamanhoFoto"></a>
						<p>Rio de Janeiro</p>
					</div>
				</div>
				<!-- /. ROW  -->
				<hr /> <!-- Linha horizontal -->

				<div class="row">
					<div class="col-md-4">
						<a href="cidades/rio.html"> <img src="http://www.turismosergipe.net/userfiles/2009-12-02/4b16d74d734da.jpg" alt="Smiley face" class="tamanhoFoto"></a>
						<p>Curitiba</p>
					</div>
					<div class="col-md-4 ">
						<a href="#"> 
							<img src="http://www.turismosergipe.net/userfiles/2011-01-05/4d247fec79074.jpg" alt="Smiley face" class="tamanhoFoto">
						</a>
						<p>Santos</p>
					</div>
					<div class="col-md-4 ">
						<a href="#"> <img
							src="http://blogmalasprontas.com.br/uploads/usuario/image/Canion%20de%20Xing%C3%B3.jpg"
							alt="Smiley face" class="tamanhoFoto">
						</a>
						<p>Juazeiro</p>
					</div>
				</div>
				<!-- /. ROW  -->
				<hr /><!-- Linha horizontal -->

				<div class="row">
					<div class="col-md-4">
						<a href="#"> <img
							src="http://turismo.culturamix.com/blog/wp-content/gallery/pontos-turisticos-em-sergipe/pontos-turisticos-em-sergipe-9.jpg"
							alt="Smiley face" class="tamanhoFoto">
						</a>
						<p>Pernambuco</p>
					</div>
					<div class="col-md-4 ">
						<a href="cidades/pirenopolis.html"> <img
							src="http://praiadoforte.org.br/wp-content/themes/PF/images/praias/5.jpg"
							alt="Smiley face" class="tamanhoFoto">
						</a>
						<p>Pirenopolis</p>
					</div>
					<div class="col-md-4">
						<a href="cidades/rio.html"> <img
							src="http://aguasturismo.com.br/public/player/434-flutuacao-bonito-mato-grosso-do-sul-a.jpg"
							alt="Smiley face" class="tamanhoFoto">
						</a>
						<p>Piranhas do Rio</p>
					</div>
				</div>
				<!-- /. ROW  -->
				<hr />

			</div>
			<!-- /. PAGE INNER  -->
		</div>
		<!-- /. PAGE WRAPPER  -->

	</div>
	<!-- /. WRAPPER  -->
	
	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
	<!-- JQUERY SCRIPTS -->
	<script src="assets/js/jquery-1.10.2.js"></script>
	<!-- BOOTSTRAP SCRIPTS -->
	<script src="assets/js/bootstrap.min.js"></script>
	<!-- METISMENU SCRIPTS -->
	<script src="assets/js/jquery.metisMenu.js"></script>
	<!-- MORRIS CHART SCRIPTS -->
	<script src="assets/js/morris/raphael-2.1.0.min.js"></script>
	<script src="assets/js/morris/morris.js"></script>
	<!-- CUSTOM SCRIPTS -->
	<script src="assets/js/custom.js"></script>
</body>
</html>
