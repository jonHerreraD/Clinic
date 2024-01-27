/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.Controller;
import logic.User;

/**
 *
 * @author diazj
 */
@WebServlet(name = "SvEditUsers", urlPatterns = {"/SvEditUsers"})
public class SvEditUsers extends HttpServlet {

    
    Controller control = new Controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
      
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       int id = Integer.parseInt(request.getParameter("id"));
       
       User usu = control.bringUser(id);
        
       HttpSession mySession = request.getSession();
       mySession.setAttribute("editUser", usu);
       
       response.sendRedirect("editUsers.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String usuName = request.getParameter("exampleUserName");
        String passw = request.getParameter("examplePassword");
        String role = request.getParameter("exampleRole");
        
        User usu = (User) request.getSession().getAttribute("editUser");
        
        usu.setUserName(usuName);
        usu.setPassword(passw);
        usu.setRole(role);
        
        control.editUser(usu);
        
        response.sendRedirect("SvUsers");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
