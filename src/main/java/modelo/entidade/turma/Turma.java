package modelo.entidade.turma;

import modelo.entidade.aluno.Aluno;
import modelo.entidade.disciplina.Disciplina;
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
    private Disciplina disciplina;

    public Turma(Long id, int quantidadeDeVagas, Sala sala, String nome, double horario, String localidade, String aula, boolean situacaoTurma, Professor professor, ArrayList<Aluno> alunos, Disciplina disciplina) {
        setId(id);
        setQuantidadeDeVagas(quantidadeDeVagas);
        setSala(sala);
        setNome(nome);
        setHorario(horario);
        setLocalidade(localidade);
        setAula(aula);
        setSituacaoTurma(situacaoTurma);
        setProfessor(professor);
        setAlunos(alunos);
        setDisciplina(disciplina);
    }

    public Turma(long id) {
        this.id = id;
    }

    public Turma(Long id, String nome, Sala sala, double horario, String localidade, int quantidadeDeVagas, Professor professor, boolean situacaoTurma, String aula, Disciplina disciplina) {
    setId(id);
    setNome(nome);
    setSala(sala);
    setHorario(horario);
    setLocalidade(localidade);
    setQuantidadeDeVagas(quantidadeDeVagas);
    setProfessor(professor);
    setSituacaoTurma(situacaoTurma);
    setAula(aula);
    setDisciplina(disciplina);
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
