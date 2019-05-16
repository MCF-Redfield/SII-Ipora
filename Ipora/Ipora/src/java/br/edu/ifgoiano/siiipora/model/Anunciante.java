
package br.edu.ifgoiano.siiipora.model;

/**
 *
 * @author Carlos da Costa Oliveira
 */
public class Anunciante {
    private String cpf;
    private String nome;
    private String senha;

   

    public Anunciante() {
    }
    
    
    public Anunciante(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public String toString() {
        return cpf+nome;
    }
}
