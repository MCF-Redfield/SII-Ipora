<%@page import="br.edu.ifgoiano.siiipora.model.Anunciante"%>
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

        <%
            HttpSession session2 = request.getSession();
            Anunciante anunciante = (Anunciante) session2.getAttribute("anunciante");

        %>
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <ul class="nav nav-tabs">
                        <li class="active">

                            <a href="http://localhost:8080/Ipora/index.jsp">Inicio</a>
                        </li>
                        <li class="active">
                            <a href="../evento/visualizar.jsp">Eventos</a>
                        </li>
                        <li class="active">
                            <a href="../sobre.jsp">Sobre</a>
                        </li>
                       
                    </ul><img alt="140x140" src="../img/logo-ifgoiano-ipora.png">


                    <div class="container">
                        <div class="row clearfix">
                            <div class="col-md-6 column">

                                <div class="form-group">
                                    <BR>
                                    <h1>Remover Anuciante</h1>

                                    <form action="../RemoverAnuncianteServlet" method="post">
                                        Digite o CPF Para Remover<BR>
                                        <BR>
                                        <label for="cpf">CPF do Anunciante</label><input type="" class="form-control" name="cpf" placeholder="<%=anunciante.getCpf()%>">

                                        <button type="submit" class="btn btn-default" name="remover" value="remover">Remover</button>
                                    </form>
                                </div>
                                <br>
                            </div>
                        </div>
                    </div>
                    <div class="container">
                        <div class="row clearfix">
                            <div class="col-md-12 column">
                                <div class="section">
                                    <div class="container">
                                        <div class="row">
                                            <div class="col-md-15">
                                                <hr>
                                            </div>
                                        </div>
                                    </div>
                                </div
                                <div class="container">
                                    <div class="row clearfix">
                                        <div class="col-md-12 column">
                                            <address> 

                                                <div class="container">


                                                    <ul class="social">

            <hr>

                                                        <div class="widget-left">			<div class="textwidget"><table width="205" border="0" align="center">
                                                                    <tbody><tr>
                                                                            <td><div align="center"><a href="https://www.facebook.com/ifgoianooficial" onclick="_gaq.push(['_trackEvent', 'outbound-widget', 'https://www.facebook.com/ifgoianooficial', '']);" target="_blank"><img src="http://www.ifgoiano.edu.br/home/wp-content/uploads/2011/12/Facebook.png"></a></div></td>
                                                                            <td><div align="center"><a href="http://www.flickr.com/ifgoiano" onclick="_gaq.push(['_trackEvent', 'outbound-widget', 'http://www.flickr.com/ifgoiano', '']);" target="_blank"><img src="http://www.ifgoiano.edu.br/home/wp-content/uploads/2011/12/Flickr.png"></a></div></td>
                                                                            <td><div align="center"><a href="http://www.twitter.com/ifgoiano" onclick="_gaq.push(['_trackEvent', 'outbound-widget', 'http://www.twitter.com/ifgoiano', '']);" target="_blank"><img src="http://www.ifgoiano.edu.br/home/wp-content/uploads/2011/12/Twitter.png"></a></div></td>
                                                                            <td><div align="center"><a href="http://www.youtube.com/ifgoiano?gl=BR&amp;hl=pt" onclick="_gaq.push(['_trackEvent', 'outbound-widget', 'http://www.youtube.com/ifgoiano?gl=BR&amp;hl=pt', '']);" target="_blank"><img src="http://www.ifgoiano.edu.br/home/wp-content/uploads/2011/12/Youtube.png"></a></div></td>
                                                                        </tr>
                                                                    </tbody></table>

            <div class="row">
                <div class="col-md-12 hidden-xs text-right">
                    <a href="https://www.flickr.com/photos/ifgoiano"><i class="fa fa-3x fa-fw fa-flickr text-success"></i></a>
                    <a href="https://twitter.com/ifgoiano"><i class="fa fa-3x fa-fw fa-twitter text-success"></i></a>
                    <a href="https://www.facebook.com/pages/IF-Goiano-C%C3%A2mpus-Ipor%C3%A1/197264287117075"><i class="fa fa-3x fa-facebook fa-fw text-success"></i></a>
                    <a href="https://www.youtube.com/user/ifgoiano?gl=BR&hl=pt"><i class="fa fa-3x fa-youtube fa-fw text-success"></i></a>
                </div>
            </div>
            <div>

                                                            </div>

                                                        </div>
e
                <strong>Instituto Federal de Educação, Ciência e Tecnologia Goiano - Câmpus Iporá</strong><br /> Avenida Oeste, 350 - Loteamento Parque União <br /> CEP: 76200-000 - Iporá - GO<br /> <abbr title="Phone">Telefone: </abbr> (64) 3674-0400
                <p id="copyr-contact"> Sistema Privado © 2015 by Alunos TADS, Inc. </p>
            </div>    

                                                    </ul>
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

                                                <strong>Instituto Federal de Educação, Ciência e Tecnologia Goiano - Câmpus Iporá</strong><br /> Avenida Oeste, 350 - Loteamento Parque União <br /> CEP: 76200-000 - Iporá - GO<br /> <abbr title="Phone">Telefone: </abbr> (64) 3674-0400
                                            </address>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>

                </div>
            </div>
        </div>
    </body>

    </div>
</body>

</html>