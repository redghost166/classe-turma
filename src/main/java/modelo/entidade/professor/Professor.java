package modelo.entidade.professor;

import modelo.entidade.disciplina.Disciplina;
import modelo.entidade.pessoaFisica.PessoaFisica;

import java.sql.Date;

public class Professor extends PessoaFisica {

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

	private double horasComplementar;
    private Disciplina disciplina;

    public Professor(Long id, String nome, String email, String telefone, String endereco, String senha, String cpf, Date dataNascimento, Disciplina disciplina, double horasComplementar) {
        super(id, nome, email, telefone, endereco, senha, cpf, dataNascimento);
        this.disciplina = disciplina;
        this.horasComplementar = horasComplementar;
    }

    public Professor(String nome, String email, String telefone, String endereco, String senha, String cpf, Date dataNascimento, Disciplina disciplina, double horasComplementar) {
        super(nome, email, telefone, endereco, senha, cpf, dataNascimento);
        this.disciplina = disciplina;
        this.horasComplementar = horasComplementar;
    }

    public Professor(long professorTurma) {
        super(professorTurma);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getHorasComplementar() {
        return horasComplementar;
    }

    public void setHorasComplementar(double horasComplementar) {
        this.horasComplementar = horasComplementar;
    }
}
