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

        <link rel="stylesheet/less" href="less/bootstrap.less" type="text/css" />
        <link rel="stylesheet/less" href="less/responsive.less" type="text/css" />
        <script src="js/less-1.3.3.min.js"></script>


        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="css/estilo.css" rel="stylesheet">
        <link href="css/pingado.css" rel="stylesheet">


        <link href="css/untitled.css"
              rel="stylesheet" type="text/css">
        <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
              rel="stylesheet" type="text/css">


        <!-- Fav and touch icons -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="img/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="img/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="img/apple-touch-icon-57-precomposed.png">
        <link rel="shortcut icon" href="img/skull-icon.png">

        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/scripts.js"></script>
    </head>

    <body>
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <ul class="nav nav-tabs">
                        <li class="active">
                            <a href="http://localhost:8080/Ipora/index.jsp">Inicio</a>
                        </li>
                        <li>
                        <li class="active">
                            <a href="evento/listarEventos.jsp">Eventos</a>
                        </li>
                        <li class="active">
                            <a href="anunciante/loginAnunciante.jsp">Anunciante</a>
                        </li>
                        <li class="active">
                            <a href="https://www.ifgoiano.edu.br/ipora/">IFGoiano Iporá</a>
                        </li>
                        <!--li class="dropdown pull-right">
                             <a href="#" data-toggle="dropdown" class="dropdown-toggle">Login<strong class="caret"></strong></a>
                             <ul class="dropdown-menu">
                                 <li>
                                     <a href="anunciante/loginAnuciante.jsp">Anunciante</a>
                                 </li>
                                 <li>
                                     <a href="evento/cadastroEven.jsp">Evento</a>
                                 </li>
                                 <li class="divider">
                                 </li>
                                 <li>
                                     <a href="https://www.ifgoiano.edu.br/ipora/">IFGoiano Iporá</a>
 
                                 </li>
                             </ul>
 
                         </li-->
                    </ul><img alt="140x140" src="img/logo-ifgoiano-ipora.png">

                    <div class="alert alert-success alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">x</button>
                        <h4>
                            Aviso!
                        </h4> <strong></strong> ... </div>

                    <div class="container">
                        <div class="row clearfix">
                            <div class="col-md-6 column">

                                <h3>
                                    Sobre o Projeto
                                </h3>
                                <p>
                                <div id="main_left2">
                                    <ul class="list1">
                                        <li>
                                            O Sistema Unificado de Cadastro em Eventos consiste em um cadastro únioco que dará ao participante o direito de se 
                                            inscrever nos eventos realizados pelo IFGoiano Iporá bem como acompanhar o andamento de sua inscrições. 
                                            <a href="#">Saiba mais</a></li>
                                    </ul>
                                </div>
                                <div id="main_coll_unique">

                                    <p class="arial_space_14">O <strong>SISTEMA DE CADASTRO EM EVENTOS </strong>consiste de um CADASTRO ÚNICO que dão ao participante o direito de se inscrever nos eventos realizados pela IF Goiano - Câmpus Iporá bem como acompanhar o andamento de sua inscrições. Ele destina-se a todos os que se interessem em participar de eventos realizados pela Instituto Federal Goiano - Cámpus Iporá ou suas afiliadas.
                                        Nele você terá acesso a todos os eventos atualmente disponieis com inscrições abertas.</p>

                                    <p class="arial_space_14">&nbsp;</p>

                                    <p class="arial_space_14"><strong>Como Funciona?</strong></p>

                                    <p class="arial_space_14">1) O participante, caso ainda não possua uma conta no sistema, deverá se cadastrar através da <strong>área de Inscrições Abertas</strong> seguindo os seguintes passos:</p>
                                    <ul>
                                        <li class="arial_space_14"> <strong>Escolher a opção <a href="../">ver detalhes </a></strong><a href="../"> disponível Informações de Eventos</a> e <strong>informar o numero de seu CPF</strong>;</li>
                                        <li class="arial_space_14">Em seguida <strong>preencher o Formulário de Novo Cadastro</strong>. PRONTO! </li>
                                    </ul>
                                    <p class="arial_space_14">A partir desde sempre que desejar se logar no sistema basta ir através da Areá de login.</p>
                                    <p class="arial_space_14">2) Caso o participante já tenha uma conta no sistema basta acessar sua página a partir da <a href="./">Areá de login</a>.</p>

                                </div>
                            </div>
                            <div class="col-md-6 column">
                                <h3>
                                    Sobre o IFGoiano Campus Iporá
                                </h3>

                                <div class="section">
                                    <div class="container">
                                        <div class="row">
                                            <div class="col-md-5">
                                                <div class="embed-responsive embed-responsive-16by9">
                                                    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
                                                    <iframe width="560" height="315" src="https://www.youtube.com/embed/PG_HX8Q3Q98" frameborder="0" allowfullscreen></iframe>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="section">
                                    <h3>
                                        Localização
                                    </h3>
                                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1686.7993653198891!2d-51.13023857100567!3d-16.431875395536217!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9366bda5a253fb47%3A0x5d992323084c66dd!2sInstituto+Federal+Goiano+-+Campus+Ipor%C3%A1!5e1!3m2!1spt-BR!2sbr!4v1430271513368" width="600" height="450" frameborder="0" style="border:0"></iframe>
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
                            
                        <strong>Instituto Federal de Educação, Ciência e Tecnologia Goiano - Câmpus Iporá</strong><br /> Avenida Oeste, 350 - Loteamento Parque União <br /> CEP: 76200-000 - Iporá - GO<br /> <abbr title="Phone">Telefone: </abbr> (64) 3674-0400
                        <p id="copyr-contact"> Sistema Privado © 2015 by Alunos TADS, Inc. </p>
                        
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
                    <div class="section">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-12">
                                        <h1 class="text-center">Equipe</h1>
                                        <p class="text-center">Qualificação Indivídual .</p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-2">
                                        <img src="img/Mathues.png"
                                             class="img-circle img-responsive">
                                    </div>
                                    <div class="col-md-4">
                                        <h3 class="text-left">Matheus Correia</h3>
                                        <p class="text-left">Aluno do 5º de TADS do IFGoiano Campus Urutaí.</p>
                                    </div>
                                    <div class="col-md-2">
                                        <img src="img/Maxwel.png"
                                             class="img-circle img-responsive">
                                    </div>
                                    <div class="col-md-4">
                                        <h3 class="text-left">Maxwel Allan</h3>
                                        <p class="text-left">Aluno do 5º de TADS do IFGoiano Campus Urutaí.</p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-2">
                                        <img src="img/Carlos.jpg"
                                             class="img-circle img-responsive">
                                    </div>
                                    <div class="col-md-4">
                                        <h3 class="text-left">Carlos da Costa</h3>
                                        <p class="text-left">Aluno do 5º de TADS do IFGoiano Campus Urutaí.</p>
                                    </div>
                                    <div class="col-md-2">
                                        <img src=""
                                             class="img-circle img-responsive">
                                    </div>
                                    <div class="col-md-4 text-center">
                                        <h3 class="text-left">José Alberto</h3>
                                        <p class="text-left">Aluno do 5º de TADS do IFGoiano Campus Urutaí.</p>
                                    </div>
                                </div>
                            </div>
                        </div
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>