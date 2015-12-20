package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>TBAK</title>\n");
      out.write("        <style>\n");
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
      out.write("    font-size: 18px;\n");
      out.write("    line-height: 25px;\n");
      out.write("    color: #ffffff;\n");
      out.write("    background: #0a6a5b url(images/bg.jpg);\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer {\n");
      out.write("    background-color:black;\n");
      out.write("    color:white;\n");
      out.write("    clear:both;\n");
      out.write("    text-align:center;\n");
      out.write("   \t \t \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div id=\"header\"><br>\n");
      out.write("    <h1>Welcome to Women's Hostel</h1>\n");
      out.write("\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    <a style=\"color: #0a6a5b; font-size: x-large;\" href=\"login.jsp\">Login</a><br><br>\n");
      out.write(" \n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("     <a style=\"color: #0a6a5b; font-size: x-large\" href=\"register.jsp\">Register</a><br>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div style=\"height: 500px;\">\n");
      out.write("<p>\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Our Ladies Hostels are the pioneer in providing accommodation for working women and students in prime locations of chennai for the past 10 years. Our Ladies Hostel is noted as one of the highly well reputed Ladies Hostel offering various kinds of hostel accommodations facilities on daily and monthly basis with affordable charges.\n");
      out.write("</p>\n");
      out.write("<p>\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Our Ladies Hostel Branches are located in T.nagar, Mambalam, Tambaram-Perungaluthur(near to Sri Ram Gateway), Guduvanchery (near to SRM college) We assure cleanliness and take special care in the preparation of food and served neatly to the inmates and provide safe and secure place to live away from home in our ladies hostel. A full time female warden will reside in our Ladies Hostel to take care of the inmates and a security personnel will also be in our Ladies Hostel throughout the day. Our aim is to serve women with best of our ability in quality and facilities for their peaceful and comfortable stay in our Ladies Hostel.\n");
      out.write("Our ladies hostel has various accommodation plans that will suit your needs like 2 sharing, 3 sharing to maximum 5 sharing at a very lowest price when compared to other Ladies Hostel in that area with unbelievable facilities.\n");
      out.write("</p>\n");
      out.write("<p>\n");
      out.write("Reasons to stay in Butterflies Ladies Hostel : \n");
      out.write("<p>\n");
      out.write("•  Clean and furnished room, Colour TV in each and every room </p>\n");
      out.write("<p>•  No timings for Hot Water, Washing machine</p>\n");
      out.write("<p>•  Wifi Access, No Advance,</p> \n");
      out.write("<p>•  No Electricity Charges,</p>\n");
      out.write("<p>•  Induction Stove for simple cooking and No Hodden charges.</p>\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("    \n");
      out.write("    Copyright ©tbakwomenshostel.com\n");
      out.write("</div>\n");
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
