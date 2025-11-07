package modelo.entidade.pessoaFisica;

import modelo.entidade.usuario.Usuario;

import java.sql.Date;

public class PessoaFisica extends Usuario {

    // atributos classe Usuario
    //
    // private Long id;
    // private String nome;
    // private String email;
    // private String telefone;
    // private String endereco;
    // private String senha;

    private Date dataNascimento;
    private String cpf;

    public PessoaFisica(Long id, String nome, String email, String telefone, String endereco, String senha, String cpf, Date dataNascimento) {
        super(id, nome, email, telefone, endereco, senha);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public PessoaFisica(String nome, String email, String telefone, String endereco, String senha, String cpf, Date dataNascimento) {
        super(nome, email, telefone, endereco, senha);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public PessoaFisica(long id) {
        super(id);
    }

    public PessoaFisica(Long id, String nome, String email, String telefone, String endereco, String senha, String cpf, java.util.Date dataNascimento) {
        super(id,nome,email,telefone,endereco,senha);
        this.cpf = cpf;
        this.dataNascimento = (Date) dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
