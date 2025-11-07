package modelo.entidade.aluno;

import modelo.entidade.pessoaFisica.PessoaFisica;

import java.sql.Date;

public class Aluno extends PessoaFisica {

    //atributos classe PessoaFisica extend Usuario
    //
    //private String cpf;
    //private Date dataNascimento;

    //atributos classe Usuario
    //
    // private Long id;
    // private String nome;
    // private String email;
    // private String telefone;
    // private String endereco;
    // private String senha;

    private int numeroMatricula;
    private String situacaoEconomica;
    private String escolaridade;

    public Aluno(Long id, String nome, String email, String telefone, String endereco, String senha, String cpf, Date dataNascimento, int numeroMatricula, String situacaoEconomica, String escolaridade) {
        super(id, nome, email, telefone, endereco, senha, cpf, dataNascimento);
        this.numeroMatricula = numeroMatricula;
        this.situacaoEconomica = situacaoEconomica;
        this.escolaridade = escolaridade;
    }

    public Aluno(String nome, String email, String telefone, String endereco, String senha, String cpf, Date dataNascimento, int numeroMatricula, String situacaoEconomica, String escolaridade) {
        super(nome, email, telefone, endereco, senha, cpf, dataNascimento);
        this.numeroMatricula = numeroMatricula;
        this.situacaoEconomica = situacaoEconomica;
        this.escolaridade = escolaridade;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getSituacaoEconomica() {
        return situacaoEconomica;
    }

    public void setSituacaoEconomica(String situacaoEconomica) {
        this.situacaoEconomica = situacaoEconomica;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
}
