/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Dao.dao2;
import Modal.BookModal;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ~PRIYA~
 */
public class BookC extends HttpServlet {

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
            out.println("<title>Servlet BookC</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BookC at " + request.getContextPath() + "</h1>");
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
        String number1=request.getParameter("number1");
        String room1=request.getParameter("room1");
        HttpSession hs=request.getSession();
        String name2=(String)hs.getAttribute("name");
        System.out.println("NAME======================"+name2);
        if(name2!=null)
        {
            if(!room1.equals("select"))
            {
            BookModal bm=new BookModal();
            bm.setName1(name1);
            bm.setNumber1(number1);
            bm.setRoom1(room1);
            dao2 d=new dao2();
            try {
                d.insert(bm);
                if(d.count==1)
                {
                    RequestDispatcher rd=request.getRequestDispatcher("Success1");
                    rd.include(request, response);
                }
                else
            {
                RequestDispatcher rd=request.getRequestDispatcher("Failure1");
                    rd.include(request, response);
            }
            }  catch (Exception ex) {
                System.out.println("Exception in BookC"+ex);
            }
            }
            else
            {
                RequestDispatcher rd=request.getRequestDispatcher("Failure2");
                    rd.include(request, response);
            }
        }
        else
        {
            RequestDispatcher rd=request.getRequestDispatcher("FailureBooking");
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
