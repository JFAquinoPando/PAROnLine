<%-- 
    Document   : index
    Created on : 25/10/2017, 07:53:03 AM
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
                <%
              ArrayList<Productos> lista = ProductosManager.getAll();
              int salto = 0;
              for (Productos p : lista) {
            %>
                     
<div id="topsUserBox">
                        <div class="box_title">
                            <div class="box_txt"><%=p.getDescripcion()%></div>
                        </div>
                        <div class="box_cuerpo">
                            <br/><br/><br/>
								


                <div id="center" class="avatar" style="background-image: url('<%= request.getContextPath()%>/images/<%= p.getNombre_img()%>.png')"></div>
              
						
                <p align="center"> <a href="#">Modificar</a> ||
                <a href="producto.jsp?id=<%=p.getId_producto() %>">Añadir al carrito</a></p>  
               

                        </div>
                        <br>
                    </div>
  
                <%  }     %>       
                
            </div>
        </div>
    </body>
</html>
