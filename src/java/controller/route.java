/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.TodoDAO;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Todo;

/**
 *
 * @author grhar
 */

//urlpattern="/" because when typ e "/new" in url bar first runs "/" then "new"
@WebServlet(name = "route", urlPatterns = {"/"})
public class route extends HttpServlet {
    private TodoDAO todoDAO;

    
     @Override
     public void init(){
         todoDAO = new TodoDAO();
     }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //processRequest(request, response);
            String action = request.getServletPath();
            
            switch(action){
                case "/new"-> showNewForm(request,response);
                case "/insert"-> insertTodo(request,response);
                case "/delete"-> deleteTodo(request,response);
                case "/edit"-> showEditForm(request,response);
                case "/update"-> updateTodo(request,response);
                default -> listTodo(request,response); 
                
            }
            
            
            
            
            //by using this url pattern can change
            //RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/views/Hello.jsp");
            //rs.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(route.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
       doGet(request,response);
    }

   
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/views/todo-form.jsp");
       rs.forward(request, response);
    }

    private void insertTodo(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        boolean state = Boolean.parseBoolean(request.getParameter("state"));
        Todo newTodo = new Todo(name,description,state);
        todoDAO.insertTodo(newTodo);  
        response.sendRedirect(request.getContextPath()+"/");
    }

    private void deleteTodo(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void updateTodo(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void listTodo(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
