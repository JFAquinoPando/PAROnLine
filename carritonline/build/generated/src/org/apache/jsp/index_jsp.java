package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import py.una.pol.par.model.ProductosManager;
import java.util.ArrayList;
import py.una.pol.par.entities.Productos;
import py.una.pol.par.controllers.s;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link href=\"");
      out.print( request.getContextPath());
      out.write("/scripts/css.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("                <script language=\"javascript\">\n");
      out.write("\t\t\n");
      out.write("\t\t//creo una variable\n");
      out.write("\t\t//var name =prompt(\"Bienvenido, cual es tu nombre? \");\n");
      out.write("    </script> \n");
      out.write("        <div id='main'>\n");
      out.write("            <div id='cuerpocontainer'>\n");
      out.write("                <h1>Bienvenid@ <script language=\"javascript\">  \n");
      out.write("               // document.write(name);\n");
      out.write("\t</script> a CarritOnline!</h1>\n");
      out.write("                <hr>\n");
      out.write("                <nav>\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("               </nav>\n");
      out.write("                 <hr>\n");
      out.write("                <br>\n");
      out.write("                ");

              ArrayList<Productos> lista = ProductosManager.getAll();
              int salto = 0;
              for (Productos p : lista) {
            
      out.write("\n");
      out.write("                     \n");
      out.write("<div id=\"topsUserBox\">\n");
      out.write("                        <div class=\"box_title\">\n");
      out.write("                            <div class=\"box_txt\">");
      out.print(p.getDescripcion());
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"box_cuerpo\">\n");
      out.write("                            <br/><br/><br/>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"center\" class=\"avatar\" style=\"background-image: url('");
      out.print( request.getContextPath());
      out.write("/images/");
      out.print( p.getNombre_img());
      out.write(".png')\"></div>\n");
      out.write("              \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                <p align=\"center\"> <a href=\"#\">Modificar</a> ||\n");
      out.write("                <a href=\"producto.jsp?id=");
      out.print(p.getId_producto() );
      out.write("\">Añadir al carrito</a></p>  \n");
      out.write("               \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                    </div>\n");
      out.write("  \n");
      out.write("                ");
  }     
      out.write("       \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
