<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<title>Passaporte</title>
	<meta name="generator" content="Bootply" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link href="assets/css/bootstrap.min.css" rel="stylesheet">
	<!--[if lt IE 9]>
		<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
	<link href="assets/css/styles.css" rel="stylesheet">
</head>

<body>
	<!--login modal-->
	<div id="loginModal" class="modal show fundo" tabindex="-1" role="dialog" aria-hidden="true">
		<div class="modal-dialog">
			<div class="logotipo">
				<h4 id="letterpress">PASSAPORTE</h4>
				<h4>a sua rede social de viagens.</h4>
			</div>
			<div class="modal-content">
				<div class="modal-header">
					<!-- <button type="button" class="close" data-dismiss="modal" aria-hidden="true">�</button> -->
					<h1 class="text-center">Acessar</h1>
				</div>
				<div class="modal-body">
					<form action="UsuarioS" method="post"
						class="form col-md-12 center-block">
						<input type="hidden" name="op" value="select">
						
						<div class="form-group">
							<input id="login" type="text" class="form-control input-lg" placeholder="Login">
						</div>
						
						<div class="form-group">
							<input id="senha" type="password" class="form-control input-lg" placeholder="Senha">
						</div>
						<div class="form-group">
							<button class="btn btn-danger btn-lg btn-block marginBottom10">Entrar</button>

							<span><a href="cadastro.html">Ainda n�o � registrado?</a></span>
							<span class="pull-right"><a href="gerundio.html">Esqueceu seu acesso?</a></span> 
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<!-- <div class="col-md-12">
			          <button class="btn btn-danger" data-dismiss="modal" aria-hidden="true"><a href = "index.html" class="nome">Voltar</a></button>
				  	</div> -->
				</div>
			</div>
		</div>
	</div>
	<!-- script references -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
</body>
</html>
