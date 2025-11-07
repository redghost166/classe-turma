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


    public Turma(Long id, int quantidadeDeVagas, Sala sala, String nome, double horario, String localidade, String aula, boolean situacaoTurma, Professor professor, ArrayList<Aluno> alunos) {
        this.id = id;
        this.quantidadeDeVagas = quantidadeDeVagas;
        this.sala = sala;
        this.nome = nome;
        this.horario = horario;
        this.localidade = localidade;
        this.aula = aula;
        this.situacaoTurma = situacaoTurma;
        this.professor = professor;
        this.alunos = alunos;
    }

    public Turma(Long id, String nome, Sala sala, double horario, String localidade, int quantidadeDeVagas, Professor professor, boolean situacaoTurma, String aula) {
        this.id = id;
        this.nome = nome;
        this.sala = sala;
        this.horario = horario;
        this.localidade = localidade;
        this.quantidadeDeVagas = quantidadeDeVagas;
        this.professor = professor;
        this.situacaoTurma = situacaoTurma;
        this.aula = aula;
    }

    public Turma(Long id, String nome, Double horario, String localidade, int quantidadeDeVagas, boolean situacaoTurma, String aula) {
        this.id = id;
        this.nome = nome;
        this.horario = horario;
        this.localidade = localidade;
        this.quantidadeDeVagas = quantidadeDeVagas;
        this.situacaoTurma = situacaoTurma;
        this.aula = aula;
    }

    public Turma(long id) {
        this.id = id;
    }

    public Turma(String id, String nome, String sala, String horario, Professor professor, String localidade, String quantidadeDeVagas, Boolean situacaoTurma, String aula) {
        this.id = Long.parseLong(id);
        this.nome = nome;
        this.sala = new Sala(sala);
        this.horario = Double.parseDouble(horario);
        this.localidade = localidade;
        this.quantidadeDeVagas = Integer.parseInt(quantidadeDeVagas);
        this.situacaoTurma = situacaoTurma;
        this.aula = aula;
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
