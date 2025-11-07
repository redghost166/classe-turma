package modelo.dao.turma;


import modelo.entidade.aluno.Aluno;
import modelo.entidade.professor.Professor;
import modelo.entidade.sala.Sala;
import modelo.entidade.turma.Turma;

import java.util.ArrayList;
import java.util.List;

public interface TurmaDAO {


    void inserirTurma(Turma turma);

    void deletarTurma(Turma turma);

    void atualizarNomeTurma(Turma turma, String novoNome);

    void atualizarSalaTurma(Turma turma, Sala novaSala);

    void atualizarHorarioTurma(Turma turma, double novoHorario);

    void atualizarLocalidadeTurma(Turma turma, String novaLocalidade);

    void atualizarQuantidadeDeVagasTurma(Turma turma, int novaQuantidadeDeVagas);

    void atualizarProfessorTurma(Turma turma, Professor novoProfessor);

    void atualizarSituacaoTurma(Turma turma, boolean novaSituacaoTurma);

    void atualizarAulaTurma(Turma turma, String novaAula);

    Turma recuperarTurma(Turma turma);

    List<Turma> recuperarTurmas();

    Turma atualizarAulaTurma(Turma turma);

    Object recuperarTurmas(Turma turma);
}