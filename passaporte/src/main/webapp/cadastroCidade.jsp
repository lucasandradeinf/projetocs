<!DOCTYPE html>

<!-- Tela de cadastro da cidade. -->

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

		<!-- Criar a cidade -->
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
			<!-- Colocar validacao pra pegar a sessao do nome do usuario e colocar na frase de bem-vindo. -->
			<div style="color: white; padding: 15px 50px 5px 50px; float: right; font-size: 11px;">
				Bem vindo Viajante!!! &nbsp; 
				<a href="login.html" class="btn btn-danger square-btn-adjust">Sair</a>
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
					<li><a href="cadastro2.html"><i class="fa fa-edit fa-3x"></i> Cadastrar Viajante</a></li>
					<li><a href="cadastroCidade.jsp"><i class="fa fa-edit fa-3x"></i> Cadastrar nova cidade</a></li>
				</ul>
			</div>
		</nav>
		<!-- /. NAV SIDE  -->

		<!-- Conteúdo do corpo da página-->
		<div id="page-wrapper">
			<div id="page-inner">

				<div class="row">
					<div class="col-md-12 col-sm-5">
						<div class="panel panel-default">
							<div class="panel-heading">
								<p>Cadastrar nova cidade</p>
							</div>

							<div id="content" class="container marginTop20">
								<div class="row">
									<div class="col-md-5">
										<form action="UsuarioS" method="post">
											<div class="form-group">
												<input type="text" class="form-control input-lg" autofocus
												placeholder="Cidade" name="nome" required="required">
											</div>
											<div class="form-group">
												<input type="text" class="form-control input-lg" autofocus
												placeholder="Estado" name="estado" required="required">
											</div>						
											<div class="form-group">
											<textarea rows="8" cols="60" placeholder="Descrição" name="descrição" required="required"></textarea>
											</div>
												<p>Escolha uma imagem para o cadastro desta cidade.</p>
												<!-- <div class="form-group">
													  <input type="file" name="uploadImagem" accept="image/*" required="required">
													  <br>
													  <input type="submit">
												</div> -->
											<div class="form-group">
												  <input type="text" name="linkImagem" required="required">
											</div>
													
											<div class="form-group">
												<button class="btn btn-danger btn-lg btn-block marginBottom10" >Cadastrar Cidade</button>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- /. ROW -->
			</div>
			<!-- /. PAGE INNER -->
		</div>
		<!-- /. PAGE WRAPPER -->

		<!-- script references -->
		<script
			src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src="assets/js/bootstrap.min.js"></script>
		<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
		<!-- JQUERY SCRIPTS -->
		<script src="assets/js/jquery-1.10.2.js"></script>
		<!-- BOOTSTRAP SCRIPTS -->
		<script src="assets/js/bootstrap.min.js"></script>
		<!-- METISMENU SCRIPTS -->
		<script src="assets/js/jquery.metisMenu.js"></script>
		<!-- CUSTOM SCRIPTS -->
		<script src="assets/js/custom.js"></script>

</body>
</html>
