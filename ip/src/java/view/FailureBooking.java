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
public class FailureBooking extends HttpServlet {

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
"        <title>JSP Page</title>\n" +
"        <style>#header {\n" +
"    background-color:black;\n" +
"    color:white;\n" +
"  \n" +
"   \n" +
"height:180px;\n" +
"width: 100%;\n" +
"}\n" +
"            body{	\n" +
"    font-family: Arial, Helvetica, sans-serif;\n" +
"    font-size: 18px;\n" +
"    line-height: 25px;\n" +
"    color: #ffffff;\n" +
"    background: #0a6a5b url(images/bg.jpg);\n" +
"}\n" +
"        </style>\n" +
"    </head>\n" +
"    <body><div id=\"header\">\n" +
"						<img src=\"image/logo1.png\" alt=\"\" />\n" +
"    <center><div style=\"color: white\">\n" +
"            <br><br><br><br><h1>Login to continue</h1>\n" +
"        </div></center><br><br>\n" +
"    <center> <div bgcolor=\"black\" style=\"color: white\">\n" +
"            <a style=\"font-size: x-large; color: #0066ff\" href=\"login.jsp\">Login</a>\n" +
"        </div></center>");
            
           
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
