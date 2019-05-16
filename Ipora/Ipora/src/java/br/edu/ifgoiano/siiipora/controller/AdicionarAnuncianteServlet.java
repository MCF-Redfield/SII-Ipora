package br.edu.ifgoiano.siiipora.controller;

import br.edu.ifgoiano.siiipora.persistence.dao.InterfaceAnuncianteDAO;
import br.edu.ifgoiano.siiipora.persistence.dao.fabricaDAO;
import br.edu.ifgoiano.siiipora.model.Anunciante;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos da Costa Oliveira
 */
@WebServlet(name = "AdicionarAnuncianteServlet", urlPatterns = {"/AdicionarAnuncianteServlet"})
public class AdicionarAnuncianteServlet extends HttpServlet {

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

            Anunciante anunciante = new Anunciante();

            anunciante.setNome(request.getParameter("nome"));
            anunciante.setCpf(request.getParameter("cpf"));
            anunciante.setSenha(request.getParameter("senha"));

            fabricaDAO fabricaMySqlDAO = fabricaDAO.getFabricaDAO();

            InterfaceAnuncianteDAO daoAnunciante = fabricaMySqlDAO.getAnuncianteDAO();

            daoAnunciante.adicionar(anunciante);
            
            response.sendRedirect("./anunciante/loginAnunciante.jsp");
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