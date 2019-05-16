<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Sistema de Cadastro de Eventos</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
        <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
              rel="stylesheet" type="text/css">
        <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
              rel="stylesheet" type="text/css">

        <link rel="stylesheet/less" href="../less/bootstrap.less" type="text/css" />
        <link rel="stylesheet/less" href="../less/responsive.less" type="text/css" />
        <script src="../js/less-1.3.3.min.js"></script>


        <link href="../css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/bootstrap-theme.min.css" rel="stylesheet">
        <link href="../css/bootstrap-theme.css" rel="stylesheet">

        <link href="../css/style.css" rel="stylesheet">
        <link href="../css/estilo.css" rel="stylesheet">
        <link href="../css/pingado.css" rel="stylesheet">

        <link href="../css/untitled.css"
              rel="stylesheet" type="text/css">
        <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
              rel="stylesheet" type="text/css">


        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../img/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../img/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../img/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="../img/apple-touch-icon-57-precomposed.png">
        <link rel="shortcut icon" href="../img/skull-icon.png">

        <script type="text/javascript" src="../js/jquery.min.js"></script>
        <script type="text/javascript" src="../js/bootstrap.min.js"></script>
        <script type="text/javascript" src="../js/scripts.js"></script>
    </head>

    <body>
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <ul class="nav nav-tabs">
                        <li class="active">

                            <a href="http://localhost:8080/Ipora/index.jsp">Inicio</a>
                        </li>
                        <li class="active">
                            <a href="/Ipora/evento/listarEventos.jsp">Eventos</a>
                        </li>
                        <li class="active">
                            <a href="https://www.ifgoiano.edu.br/ipora/">IFGoiano Ipor�</a>
                        </li>
                        <li class="active">
                            <a href="/Ipora/sobre.jsp">Sobre</a>
                        </li> 
                        </li>

                        </li>
                    </ul> 
                    <img alt="140x140" src="../img/logo-ifgoiano-ipora.png">

                    <div class="container">
                        <div class="row clearfix">
                            <div class="col-md-6 column">
                                <form class="form-horizontal" role="form">

                                    <h3>
                                        Login

                                    </h3>
                                    
                                    <BR>

                                    <label for="cpf" class="col-sm-2 control-label">CPF</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" placeholder="CPF (somente n&uacute;meros)" name="cpf" id="CPF"/>
                                    </div>


                                    <br>

                                    <br>
                                    <br>

                                    <label for="senha" class="col-sm-2 control-label">Senha</label>
                                    <div class="col-sm-10">
                                        <input type="password" class="form-control" name="senha"/>

                                        <p> ${message} </p>
                                        <c:remove var="message" scope="session"  /> 
                                        <button formmethod="POST" formaction="../LoginAnuncianteServlet" type="submit" class="btn btn-default"  >Entrar</button>



                                        <button formaction="adicionarAnunciante.jsp" type="submit" class="btn btn-default">Cadastrar-se</button>

                                    </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <hr>

            <div class="row">
                <div class="col-md-12 hidden-xs text-right">
                    <a href="https://www.flickr.com/photos/ifgoiano"><i class="fa fa-3x fa-fw fa-flickr text-success"></i></a>
                    <a href="https://twitter.com/ifgoiano"><i class="fa fa-3x fa-fw fa-twitter text-success"></i></a>
                    <a href="https://www.facebook.com/pages/IF-Goiano-C%C3%A2mpus-Ipor%C3%A1/197264287117075"><i class="fa fa-3x fa-facebook fa-fw text-success"></i></a>
                    <a href="https://www.youtube.com/user/ifgoiano?gl=BR&hl=pt"><i class="fa fa-3x fa-youtube fa-fw text-success"></i></a>
                </div>
            </div>
            <div>

                <strong>Instituto Federal de Educa��o, Ci�ncia e Tecnologia Goiano - C�mpus Ipor�</strong><br /> Avenida Oeste, 350 - Loteamento Parque Uni�o <br /> CEP: 76200-000 - Ipor� - GO<br /> <abbr title="Phone">Telefone: </abbr> (64) 3674-0400
                <p id="copyr-contact"> Sistema Privado � 2015 by Alunos TADS, Inc. </p>
            </div>    

            <div align="Center">
                <div class="row clearfix">
                    <div class="col-md-12 column">
                        <ul class="breadcrumb">
                            <li>
                                <a href="http://localhost:8080/Ipora/index.jsp">Home</a> <span class="divider">/</span>
                            </li>
                            <li>
                                <a href="http://www.ifgoiano.edu.br/home/">IFGoiano (Matriz)</a> <span class="divider">/</span>
                            </li>
                            <li>
                                <a href="turmatads2013@gmail.com">Delatar Erros</a> <span class="divider">/</span>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>