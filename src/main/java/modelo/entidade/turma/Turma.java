package modelo.entidade.turma;

import modelo.entidade.aluno.Aluno;
import modelo.entidade.professor.Professor;
import modelo.entidade.sala.Sala;

import java.util.ArrayList;

public class Turma {

    private Long id;
    private int quantidadeDeVagas;
    private Sala sala;
    private String nome;
    private double horario;
    private String localidade;
    private String aula;
    private boolean situacaoTurma;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(Long id, String nome, Sala sala, Double horario, Professor professor, String localidade, int quantidadeDeVagas, Boolean situacaoTurma, String aula) {
    }

    public Turma(long id) {
    }


    public int getQuantidadeDeVagas() {
        return quantidadeDeVagas;
    }

    public void setQuantidadeDeVagas(int quantidadeDeVagas) {
        this.quantidadeDeVagas = quantidadeDeVagas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public boolean isSituacaoTurma() {
        return situacaoTurma;
    }

    public void setSituacaoTurma(boolean situacaoTurma) {
        this.situacaoTurma = situacaoTurma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Long getIdProfessor() {
        return professor.getId();
    }

    public long getIdSala() {
        return sala.getId();
    }

    public boolean getSituacaoTurma() {
        return situacaoTurma;
    }
}
