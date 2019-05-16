
package br.edu.ifgoiano.siiipora.controller;

import br.edu.ifgoiano.siiipora.model.Evento;
import br.edu.ifgoiano.siiipora.persistence.dao.InterfaceEventoDAO;
import br.edu.ifgoiano.siiipora.persistence.dao.fabricaDAO;
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
 * @author aluno
 */
@WebServlet(name = "ListarEventosServlet", urlPatterns = {"/ListarEventosServlet"})
public class ListarEventosServlet extends HttpServlet {

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
            Evento evento = new Evento();
            
            evento.setNome(request.getParameter("nome"));
            evento.setLocal(request.getParameter("local"));
            evento.setDescricao(request.getParameter("descricao"));
            evento.setCampus(request.getParameter("campus"));
           
            fabricaDAO fabricaMySqlDAO = fabricaDAO.getFabricaDAO();
            InterfaceEventoDAO daoEvento = fabricaMySqlDAO.getEventoDAO();
            
            
            List<Evento> lista = daoEvento.getEvento();
                
                out.println("Nome"+"Local"+"Descrição"+"Câmpus");
                
                int i;
                for(i=0; i<lista.size();i++){
                    out.println(lista.get(i).toString());
                    out.println("<BR>");
                    
                }
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
