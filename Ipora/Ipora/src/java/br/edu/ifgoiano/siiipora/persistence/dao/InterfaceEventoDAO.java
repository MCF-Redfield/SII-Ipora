
package br.edu.ifgoiano.siiipora.persistence.dao;

import br.edu.ifgoiano.siiipora.model.Evento;
import java.util.List;

/**
 *
 * @author Carlos da Costa Oliveira
 */
public interface InterfaceEventoDAO {
    public void adicionar(Evento evento);
    public void remover(Evento evento);
    public void alterar(Evento evento);
    public java.sql.Date configuraData(String data);
    public List<Evento> getEvento();
    public Evento buscarEvento(int idEvento);
}
