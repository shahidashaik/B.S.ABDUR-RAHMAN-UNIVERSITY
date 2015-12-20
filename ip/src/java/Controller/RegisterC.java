/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Dao.dao;
import Dao.dao1;
import Modal.RegisterModal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ~PRIYA~
 */
public class RegisterC extends HttpServlet {

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
            out.println("<head>");
            out.println("<title>Servlet RegisterC</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterC at " + request.getContextPath() + "</h1>");
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
        String name1=request.getParameter("name1");
        String pass1=request.getParameter(("password1"));
        String sex1=request.getParameter("sex1");
        //String father=request.getParameter("fathername");
        String address1=request.getParameter("address1");
        //String district=request.getParameter("district");
        String state1=request.getParameter("state1");
        String emailid=request.getParameter("emailid1");
        String number1=request.getParameter("number1");
        String course1=request.getParameter("course1");
        String year1=request.getParameter("year1");
        
        
        
           RegisterModal m=new RegisterModal();
           m.setName1(name1);
           m.setPassword1(pass1);
           m.setSex1(sex1);
           m.setAddress1(address1);
           m.setState1(state1);
           m.setEmailid1(emailid);
           m.setNumber1(number1);
           m.setCourse1(course1);
           m.setYear1(year1);
                    
           
          dao1 d=new dao1();
            try {
                d.insert(m);
                RequestDispatcher rd=request.getRequestDispatcher("Success");
            rd.include(request, response);
            } catch (Exception ex) {
               System.out.println("Exception occured!!!!!!!!!!!!!!!!!"+ex);
               RequestDispatcher rd=request.getRequestDispatcher("Failure");
            rd.include(request, response);
            }
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
