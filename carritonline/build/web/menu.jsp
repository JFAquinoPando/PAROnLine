<%-- 
    Document   : menu
    Created on : 27/10/2017, 09:31:16 PM
    Author     : fabricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul id="appleNav">
                <li><a href="<%= request.getContextPath()%>" title="Ir a la Página Principal">Inicio</a></li>
                <li><a href="<%= request.getContextPath()%>/producto.jsp" title="Productos">Productos</a></li>
                <li><a href="<%= request.getContextPath()%>/categoria.jsp" title="Categorias de Productos">Categorias</a></li>
                <li><a href="<%= request.getContextPath()%>/usuarios.jsp" title="Usuarios">Usuarios</a></li>
                <li><a href="<%= request.getContextPath()%>/logIn.jsp" title="Iniciar Sesión">Iniciar Sesión</a></li>
                <li><a href="#" title="Carrito">Carrito <img src="<%= request.getContextPath()%>/images/carrito1.png" width="24px" height="24px"></a></li>
                <li>
                    <form>
                        <input type="text" />
                    </form>
                </li>
            </ul>
