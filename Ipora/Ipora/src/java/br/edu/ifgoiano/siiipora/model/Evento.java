package br.edu.ifgoiano.siiipora.model;


/**
 *
 * @author Carlos da Costa Oliveira
 */
public class Evento {
    private int id;
    private String nome;
    private String local;
    private java.sql.Date data;
    private String descricao;
    private String campus;
    private Anunciante anunciante;

    public Evento() {
    }
    
    
    public Evento(int id, String nome, String local, java.sql.Date data, String descricao, String campus, Anunciante anunciante) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.descricao = descricao;
        this.campus = campus;
        this.anunciante = anunciante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public java.sql.Date getData() {
        return data;
    }

    public void setData(java.sql.Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Anunciante getAnunciante() {
        return anunciante;
    }

    public void setAnunciante(Anunciante anunciante) {
        this.anunciante = anunciante;
    }

   

    @Override
    public String toString() {
        return "Evento: " + "\nId = " + id + "\nNome = " + nome + "\nLocal = " + local + "\nData = " + data + "\nDescricao = " + descricao + "\nCampus = " + campus + "\nAnunciante_cpf = " + anunciante.getNome();
    }
   
}
