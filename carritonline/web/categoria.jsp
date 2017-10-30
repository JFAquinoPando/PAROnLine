<%-- 
    Document   : categoria
    Created on : 27/10/2017, 09:08:27 PM
    Author     : fabricio
--%>

<%@page import="py.una.pol.par.model.ProductosManager"%>
<%@page import="java.util.ArrayList"%>
<%@page import="py.una.pol.par.entities.Productos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@page import="py.una.pol.par.controllers.s" %>
        <link href="<%= request.getContextPath()%>/scripts/css.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        
                <script language="javascript">
		
		//creo una variable
		//var name =prompt("Bienvenido, cual es tu nombre? ");
    </script> 
        <div id='main'>
            <div id='cuerpocontainer'>
                <h1>Bienvenid@ <script language="javascript">  
               // document.write(name);
	</script> a CarritOnline!</h1>
                <hr>
                <nav>
                    <jsp:include page="menu.jsp" />
               </nav>
                 <hr>
                <br>
                
            </div>
        </div>
                
    </body>
</html>
