/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.jc.model.Conexion;
import com.jc.model.DAOUsuario;
import com.jc.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author campitos
 */
@WebServlet(name = "ServletAutenticar", urlPatterns = {"/ingresar"})
public class ServletAutenticar extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();
    String email= request.getParameter("email");
    String password= request.getParameter("password");
    String respuesta="incorrecto";
    
    Usuario u=new Usuario();
    u.setEmail(email);
    u.setPassword(password);
    DAOUsuario dao=new DAOUsuario();

out.println(dao.autenticar(u)); 

     
        
    }
}