package br.edu.ifgoiano.siiipora.controller;

import br.edu.ifgoiano.siiipora.persistence.dao.InterfaceAnuncianteDAO;
import br.edu.ifgoiano.siiipora.persistence.dao.fabricaDAO;
import br.edu.ifgoiano.siiipora.model.Anunciante;
import br.edu.ifgoiano.siiipora.persistence.dao.AnuncianteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos da Costa Oliveira
 */
@WebServlet(name = "ListarAnuncianteServlet", urlPatterns = {"/ListarAnuncianteServlet"})
public class ListarAnuncianteServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter())
        {
            
            /*Anunciante anunciante = new Anunciante();
            
            anunciante.setNome(request.getParameter("nome"));
            anunciante.setCpf(request.getParameter("cpf"));
            
            
            fabricaDAO fabricaMySqlDAO = fabricaDAO.getFabricaDAO();
            InterfaceAnuncianteDAO daoAnunciante = fabricaMySqlDAO.getAnuncianteDAO();
            
            List<Anunciante> lista = daoAnunciante.getLista();
                
                out.println("Anunciantes"+"<br>"+"<br>");
            int i;
            for(i=0;i<lista.size();i++){
                out.println(lista.get(i).getNome());
                out.println("<BR>");
            }*/
            
            AnuncianteDAO anuncianteDAO = new AnuncianteDAO();
            request.setAttribute("anunciantes", anuncianteDAO.getLista());
            //System.out.println(anuncianteDAO.getLista().get(0).getNome());
            request.getRequestDispatcher("listarAnunciante.jsp").forward(request, response);
            
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
