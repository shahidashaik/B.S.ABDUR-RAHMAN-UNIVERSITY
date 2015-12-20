/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ~PRIYA~
 */
public class Failure2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>TBAK</title>\n" +
"   <script type=\"text/javascript\" src=\"validate.js\"></script>\n" +
"     <style>\n" +
"#header {\n" +
"    background-color:black;\n" +
"    color:white;\n" +
"  \n" +
"   \n" +
"height:180px;\n" +
"width: 100%;\n" +
"}\n" +
"body{	\n" +
"    font-family: Arial, Helvetica, sans-serif;\n" +
"    font-size: 20px;\n" +
"    line-height: 25px;\n" +
"    color: white;\n" +
"    background: #0a6a5b url(images/bg.jpg);\n" +
"}\n" +
"\n" +
" #wrap{\n" +
"	border: 22px solid #ffffff;\n" +
"	width: 1032px;\n" +
"	margin: 0 auto;\n" +
"	background: #fffff;\n" +
"        height: 600px;\n" +
"}\n" +
"#footer {\n" +
"    background-color:black;\n" +
"    color:white;\n" +
"    clear:both;\n" +
"    text-align:center;\n" +
"   	 	 \n" +
"}\n" +
"#footer {\n" +
"    background-color:black;\n" +
"    color:white;\n" +
"    clear:both;\n" +
"    text-align:center;\n" +
"   	 	 \n" +
"}\n" +
"</style>\n" +
"	</head>\n" +
"	<body>\n" +
"		<div id=\"header\">\n" +
"						<img src=\"image/logo1.png\" alt=\"\" />\n" +
"                  </div> <center> <h3>Enter a valid Room Type</h3><h2>Booking</center></h2><br>\n" +
"        <div id=\"wrap\">\n" +
"                    <form action=\"BookC\"><br><br>\n" +
"                       \n" +
"\n" +
"                        <table cellpadding=\"20\" width=\"80%\" align=\"center\" cellspacing=\"20\">\n" +
"\n" +
"		<tr>\n" +
"		<td>Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\n" +
"                <td><input type=\"text\" style=\"font-size: 20px;\" name=\"name1\" size=\"30\"></td>\n" +
"		</tr>\n" +
"		\n" +
"		<tr>\n" +
"		<td>MobileNo</td>\n" +
"                <td><input type=\"text\" name=\"number1\" style=\"font-size: 20px;\" size=\"30\"></td>\n" +
"		</tr>\n" +
"\n" +
"		<tr>\n" +
"		<td>Room type:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\n" +
"		<td><select style=\"font-size: 20px\" name=\"room1\">\n" +
"		<option value=\"select\">select..</option>\n" +
"		<option value=\"one\">Single person</option>\n" +
"                <option value=\"two\">Two in a room</option>\n" +
"		<option value=\"four\">four in a rooom</option>\n" +
"		<option value=\"oneac\">Single person with AC</option>\n" +
"		<option value=\"twoac\">Two people with AC</option>\n" +
"		</select></td>\n" +
"		</tr>\n" +
"		\n" +
"                \n" +
"                        </table><br><br>\n" +
"                        <center>\n" +
"                <input type=\"reset\" style=\"font-size: 20px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
"                <input type=\"submit\" style=\"font-size: 20px;\" value=\"Register\" /></center>\n" +
"		\n" +
"                \n" +
"		\n" +
"                \n" +
"                    </form>	</div><br>\n" +
"                    <div id=\"footer\">\n" +
"Copyright ©tbakwomenshostel.com\n" +
"</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
