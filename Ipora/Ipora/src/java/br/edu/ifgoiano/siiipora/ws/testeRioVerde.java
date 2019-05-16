/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifgoiano.siiipora.ws;

import br.edu.ifgoiano.siirioverde.ws.Aluno;
import br.edu.ifgoiano.siirioverde.ws.Professor;
import br.edu.ifgoiano.siirioverde.ws.Projeto;
import br.edu.ifgoiano.siirioverde.ws.SiiRioVerdeWs;
import br.edu.ifgoiano.siirioverde.ws.SiiRioVerdeWs_Service;
import java.util.List;

/**
 *
 * @author Matheus Correia
 */
public class testeRioVerde
{
    public static void main(String[] args)
    {
        SiiRioVerdeWs_Service srvws = new SiiRioVerdeWs_Service();
        SiiRioVerdeWs portsrv = srvws.getSiiRioVerdeWsPort();
        
        List<Aluno> listaAluno = portsrv.getAluno();
        int i = 0;        
        while(i<listaAluno.size())
        {                        
            System.out.println(listaAluno.get(i).getNome());        
            i++;
        }
        
        System.out.println("\n");
        
        List<Projeto> listaProjeto = portsrv.getProjeto();
        i = 0;        
        while(i<listaProjeto.size())
        {                        
            System.out.println(listaProjeto.get(i).getOrientador().getNome());
            i++;
        }
        
        System.out.println("\n");
        
        List<Professor> listaProf = portsrv.getProfessor();//servlet
        i = 0;
        while(i<listaProf.size())//jsp
        {                        
            System.out.println(listaProf.get(i).getNome());
            i++;
        }
        
                
    }
}
