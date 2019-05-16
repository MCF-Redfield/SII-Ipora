/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifgoiano.siiipora.controller;

import br.edu.ifgoiano.siiipora.model.Anunciante;
import br.edu.ifgoiano.siiipora.persistence.dao.AnuncianteDAO;
import br.edu.ifgoiano.siiipora.persistence.dao.InterfaceEventoDAO;
import br.edu.ifgoiano.siiipora.persistence.dao.fabricaDAO;
import br.edu.ifgoiano.siiipora.model.Evento;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AdicionarEventoServlet", urlPatterns = {"/AdicionarEventoServlet"})
public class AdicionarEventoServlet extends HttpServlet {

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
            
            Evento evento = new Evento();
            
            fabricaDAO fabricaMySqlDAO = fabricaDAO.getFabricaDAO();
            
            InterfaceEventoDAO daoEvento = fabricaMySqlDAO.getEventoDAO();
            
            AnuncianteDAO anuncDAO = new AnuncianteDAO();
            
            
            HttpSession session = request.getSession();
               Anunciante anunciante = (Anunciante) session.getAttribute("anunciante");
                
            evento.setNome(request.getParameter("nome"));
            evento.setLocal(request.getParameter("local"));           
            evento.setData(daoEvento.configuraData(request.getParameter("data")));
            evento.setDescricao(request.getParameter("descricao"));
            evento.setCampus(request.getParameter("campus"));
            evento.setAnunciante(anunciante);
            daoEvento.adicionar(evento);
            
            response.sendRedirect("menuAnunciante.jsp");
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
