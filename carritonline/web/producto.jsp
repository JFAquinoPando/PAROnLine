<%-- 
    Document   : producto
    Created on : 27/10/2017, 09:04:59 AM
    Author     : fabricio
--%>

<%@page import="py.una.pol.par.model.ProductosManager"%>
<%@page import="py.una.pol.par.model.CategoriaManager"%>
<%@page import="java.util.ArrayList"%>
<%@page import="py.una.pol.par.entities.Productos"%>
<%@page import="py.una.pol.par.entities.Categoria"%>

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
        <div id='main'>
            <div id='cuerpocontainer'>
                <h1>Bienvenid@ a CarritOnline!</h1>
                <hr>
                <nav>
                    <jsp:include page="menu.jsp" />
               </nav>
                 <hr>
                <br>
              
                
            <!--
            
            Cuerpo ini
            -->    
                
            <%
            ArrayList<Productos> lista = ProductosManager.getAll();
           
            Productos p = ProductosManager.getProductoById(request.getParameter("id"));
            %>
            
            
            
            <!--
            
            Cuerpo fin
            -->    
            </div>
        </div>
                
    </body>
</html>
