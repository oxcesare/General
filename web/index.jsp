<%-- 
    Document   : index
    Created on : 23/09/2014, 10:14:27 AM
    Author     : DTYS
--%>


<%@ page contentType="text/html; charset=ISO-8859-1" language="java" session="true" 
         import="java.sql.*"
         import="java.io.*"
         import="java.util.*"	
         import="java.util.Date"
         import="java.text.SimpleDateFormat"
         import="java.util.LinkedList"
         import ="beans.beanSesion"
         errorPage="" %>


<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="Ajax.js"></script>
        <title>:::: SISNOUX ::::</title>
        <link href="FormatosValidaciones/formato.css" rel="stylesheet" type="text/css" media="screen" style="float:right; margin-left:15px;"/>
        <link href="FormatosValidaciones/styles.css" rel="stylesheet" type="text/css" media="screen" style="float:right; margin-left:15px;"/>

        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">       

    </head>
    <body>

        <jsp:useBean id="sesion" class="beans.beanSesion" scope="session" />

        <%

            String usuario = sesion.getUsuario();

            if (usuario == null || usuario.equals("")) {
                String url = "sesion.jsp";
                response.sendRedirect(url);
            } else {

                session.setAttribute("usuario", usuario);

        %>



        <%            Date fechaActual = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("EEEEEEEEEEEE, d MMMMMMMMMMMM yyyy");
            String fecha = formato.format(fechaActual);
        %>

        <div id="encabezado">
            <table class="logos">
                <tr>
                    <td width="198"><img class="logoUX" src="imagenes/logoUX22.jpg" alt="Logo UX"></td>
                        <td width="519">
                            <p class="slogan1">Universidad de Xalapa</p>
                        </td>
                </tr>
            </table>
            <br/>
            <table class="titulos">
                <tr>
                    <td class="subtiulos1">Sistema Nóminas Universidad de Xalapa</td>
                    <td class="subtitulos2"><%=fecha%></td>
                </tr>
            </table>
        </div>
        <div id='cssmenu'>
            <ul>
                <li class='active'><a href='index.jsp'><span>Inicio</span></a></li>
                <li class='has-sub'><a href='index.jsp'><span>Docentes</span></a>
                    <ul>
                        <li class='has-sub'><a href='vistas/Docentes/AltaDocentes.jsp'><span>Alta de Docentes</span></a>            
                            </li>
                            <li class='has-sub'><a href='vistas/Docentes/BajaDocentes.jsp'><span>Baja Docentes</span></a>            
                            </li>                            
                            <li class='has-sub'><a href='vistas/Docentes/CargaAcademica.jsp'><span>Carga Académica</span></a>            
                            </li>                            
                    </ul>
                </li>
                <li class='has-sub'><a href='index.jsp'><span>Administración Docentes</span></a>
                    <ul>
                        <li class='has-sub'><a href='vistas/AdministracionDocentes/Percepciones.jsp'><span>Percepciones</span></a>            
                        </li>
                        <li class='has-sub'><a href='vistas/AdministracionDocentes/Deducciones.jsp'><span>Deducciones</span></a>            
                        </li>
                        <li class='has-sub'><a href='vistas/AdministracionDocentesFaltas.jsp'><span>Faltas</span></a>            
                        </li>
                        <li class='has-sub'><a href='vistas/AdministracionDocentes/Justificaciones.jsp'><span>Justificaciones</span></a>            
                        </li>
                        <li class='has-sub'><a href='vistas/AdministracionDocentes/Retardos.jsp'><span>Retardos</span></a>            
                        </li>
                        
                        
                    </ul>
                <li class='has-sub'><a href='../../index.jsp'><span>Reportes de Nómina</span></a>
                    <ul>
                         <li class='has-sub'><a href='Reportes/ReporteNomina.jsp'><span>Reporte de Nómina</span></a>            
                        </li>  
                        <li class='has-sub'><a href='Reportes/ReporteIndividual.jsp'><span>Reporte Individual</span></a>            
                        </li>                      
                                           
                    </ul>
                <li><a href='../../sesion.jsp'><span>Cerrar Sesion</span></a></li>
            </ul>
        </div>




        <div id="pie">
            <p class="copy">Universidad de Xalapa &copy; 2014 </p>
        </div>
        <%}%>




    </body>
</html>
