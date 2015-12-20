package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    <script type=\"text/javascript\" src=\"validate.js\"></script>\n");
      out.write("     <style>\n");
      out.write("#header {\n");
      out.write("    background-color:black;\n");
      out.write("    color:white;\n");
      out.write("    text-align:center;\n");
      out.write("   \n");
      out.write("height:180px;\n");
      out.write("width: 100%;\n");
      out.write("}\n");
      out.write("body{\t\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("    font-size: 20px;\n");
      out.write("    line-height: 25px;\n");
      out.write("    color: black;\n");
      out.write("    background: #0a6a5b url(images/bg.jpg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(" #wrap{\n");
      out.write("\tborder: 22px solid #ffffff;\n");
      out.write("\twidth: 1032px;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tbackground: #fffff;\n");
      out.write("        height: 700px;\n");
      out.write("}\n");
      out.write("#footer {\n");
      out.write("    background-color:black;\n");
      out.write("    color:white;\n");
      out.write("    clear:both;\n");
      out.write("    text-align:center;\n");
      out.write("   \t \t \n");
      out.write("}\n");
      out.write("#footer {\n");
      out.write("    background-color:black;\n");
      out.write("    color:white;\n");
      out.write("    clear:both;\n");
      out.write("    text-align:center;\n");
      out.write("   \t \t \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/image/logo1.png\" width=\"499px\" height=\"111px\"/><br><br><br>\n");
      out.write("                    <h1><center>Register Your Identity</center></h1><br></div><br><br><br><br>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("                    <form action=\"RegisterC\"><br><br>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        <table cellpadding=\"10\" width=\"80%\" align=\"center\" cellspacing=\"10\">\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td>Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("                <td><input type=\"text\" style=\"font-size: 20px;\" name=\"name1\" size=\"30\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td>Password</td>\n");
      out.write("\t\t<td><input type=\"password\" name=\"password1\" style=\"font-size: 20px;\" size=\"30\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td>Sex&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("\t\t<td><input type=\"radio\" name=\"sex1\" style=\"font-size: 20px;\" value=\"male\" size=\"10\">Male\n");
      out.write("\t\t<input type=\"radio\" name=\"sex1\" style=\"font-size: 20px;\" value=\"Female\" size=\"10\">Female</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td>Address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("\t\t<td><input type=\"text\" name=\"address1\" style=\"font-size: 20px;\" size=\"50\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<!--<tr>\n");
      out.write("\t\t<td>State</td>\n");
      out.write("\t\t<td><select Name=\"state1\">\n");
      out.write("\t\t<option value=\"-1\" selected>select..</option>\n");
      out.write("\t\t<option value=\"New Delhi\">NEW DELHI</option>\n");
      out.write("\t\t<option value=\"Mumbai\">MUMBAI</option>\n");
      out.write("\t\t<option value=\"Tamilnadu\">TAMILNADU</option>\n");
      out.write("\t\t<option value=\"Bihar\">BIHAR</option>\n");
      out.write("\t\t<option value=\"MahaRASTRA\">MAHARASTRA</option>\n");
      out.write("\t\t</select></td>\n");
      out.write("\t\t</tr>-->\n");
      out.write("                <tr>\n");
      out.write("                    <td>State:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("                    <td><input type=\"text\" name=\"state1\" style=\"font-size: 20px;\" size=\"50\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td>EmailId</td>\n");
      out.write("\t\t<td><input type=\"text\" name=\"emailid1\" style=\"font-size: 20px;\" size=\"30\"></td>\n");
      out.write("\t\t</tr>\t\t\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td>MobileNo</td>\n");
      out.write("                <td><input type=\"text\" name=\"number1\" style=\"font-size: 20px;\" size=\"30\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t<!--<tr>\n");
      out.write("\t\t<td>Course&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("\t\t<td><select name=\"course1\">\n");
      out.write("\t\t<option value=\"-1\" selected>select..</option>\n");
      out.write("\t\t<option value=\"B.Tech\">B.TECH</option>\n");
      out.write("                <option value=\"B.Tech\">B.ARCH</option>\n");
      out.write("\t\t<option value=\"MCA\">MCA</option>\n");
      out.write("\t\t<option value=\"MBA\">MBA</option>\n");
      out.write("\t\t<option value=\"BCA\">BCA</option>\n");
      out.write("\t\t</select></td>\n");
      out.write("\t\t</tr>-->\n");
      out.write("                <tr>\n");
      out.write("                    <td>Course:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("                    <td><input type=\"text\" name=\"course1\" style=\"font-size: 20px;\" size=\"50\"></td>\n");
      out.write("                </tr>\n");
      out.write("\t\t\n");
      out.write("\t\t<!--<tr>\n");
      out.write("\t\t<td>Year</td>\n");
      out.write("\t\t<td><select Name=\"year1\">\n");
      out.write("\t\t<option value=\"select\" selected>select..</option>\n");
      out.write("\t\t<option value=\"I\">I year</option>\n");
      out.write("\t\t<option value=\"II\">II year</option>\n");
      out.write("\t\t<option value=\"III\">III year</option>\n");
      out.write("\t\t<option value=\"IV\">IV year</option>\n");
      out.write("\t\t<option value=\"V\">V year</option>\n");
      out.write("\t\t</select></td>\n");
      out.write("\t\t</tr>-->\n");
      out.write("                <tr>\n");
      out.write("                    <td>Year:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("                    <td><input type=\"text\" name=\"year1\" style=\"font-size: 20px;\" size=\"50\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("\t\t</table>\n");
      out.write("                        <center>\n");
      out.write("                <input type=\"reset\" style=\"font-size: 20px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type=\"submit\" style=\"font-size: 20px;\" value=\"Register\" /></center>\n");
      out.write("\t\t\n");
      out.write("                \n");
      out.write("\t\t\n");
      out.write("                \n");
      out.write("                    </form>\t</div><br>\n");
      out.write("                    <div id=\"footer\">\n");
      out.write("Copyright ©tbakwomenshostel.com\n");
      out.write("</div>\n");
      out.write("\t</body>\n");
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
