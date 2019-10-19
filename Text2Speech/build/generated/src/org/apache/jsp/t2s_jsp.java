package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class t2s_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <title>Text to Speech</title>\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ControlSevlet\">\n");
      out.write("            <div style=\"background-color: whitesmoke; text-align: center; height:100px ; padding: 8px\">\n");
      out.write("                <h1>Welcome to text to speech application</h1>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"background-color: whitesmoke; text-align:  center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div style=\"background-color: whitesmoke; text-align: center \">\n");
      out.write("                    <table border=\"0\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th></th>\n");
      out.write("                                <th></th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Nhập văn bản <p><textarea name=\"text\" rows=\"8\" cols=\"30\">\n");
      out.write("                                        </textarea></td>\n");
      out.write("                                <td><p>Chọn giọng  <select name=\"voice\" >\n");
      out.write("                                            <option>----------------</option>\n");
      out.write("                                            <option value=\"banmai\">Ban Mai</option>\n");
      out.write("                                            <option value=\"leminh\">Lê Minh</option>\n");
      out.write("                                            <option value=\"lannhi\">Lan Nhi</option>\n");
      out.write("                                            <option value=\"thudung\">Thu Dung</option>\n");
      out.write("                                            <option value=\"caochung\">Cao Chung</option>\n");
      out.write("                                            <option value=\"hatieumai\">Hà Tiểu Mai</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    <p>Tốc độ  <select name=\"speed\">\n");
      out.write("                                            <option>-----------------</option>\n");
      out.write("                                            <option value=\"-3\">Cực chậm</option>\n");
      out.write("                                            <option value=\"-2\">Rất chậm</option>\n");
      out.write("                                            <option value=\"-1\">Chậm</option>\n");
      out.write("                                            <option value=\"0\">Bình thường</option>\n");
      out.write("                                            <option value=\"1\">Nhanh</option>\n");
      out.write("                                            <option value=\"2\">Rất nhanh</option>\n");
      out.write("                                            <option value=\"3\">Cực nhanh</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    <p>Ngữ điệu <input type=\"checkbox\" name=\"prosody\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <p><input type=\"submit\" name=\"submit\" value=\"Tạo file âm thanh\" />\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <table border =\"1\" align =\"center\">\n");
      out.write("                    <th></th>\n");
      out.write("                    <td>\n");
      out.write("                        <div style=\"visibility: visible\" >\n");
      out.write("                            <audio controls autoplay=\"true\">\n");
      out.write("                                <source src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${link}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" width=\"240\" height=\"120\">\n");
      out.write("                            </audio>\n");
      out.write("                        </div>\n");
      out.write("                    <td>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>  \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
