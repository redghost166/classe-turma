package modelo.dao.turma;


import modelo.entidade.aluno.Aluno;
import modelo.entidade.professor.Professor;
import modelo.entidade.sala.Sala;
import modelo.entidade.turma.Turma;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TurmaDaoImpl implements TurmaDAO {

    public void inserirTurma(Turma turma) {

        Connection conexao = null;
        PreparedStatement insert = null;

        try {

            conexao = conectarBanco();
            insert = conexao.prepareStatement("INSERT INTO turma (nome_turma, aula_turma, localidade_turma, sala_turma, quantidadeDeVagas_turma, professor_turma, situacaoTurma_turma, horario_turma) VALUES (?,?,?,?,?,?,?,?,?)");

            insert.setString(1, turma.getNome());
            insert.setString(2, turma.getAula());
            insert.setString(3, turma.getLocalidade());
            insert.setLong(4, turma.getSala().getId());
            insert.setInt(5, turma.getQuantidadeDeVagas());
            insert.setLong(7, turma.getProfessor().getId());
            insert.setBoolean(8, turma.getSituacaoTurma());
            insert.setDouble(9, turma.getHorario());


            insert.execute();

        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {

            try {

                if (insert != null)
                    insert.close();

                if (conexao != null)
                    conexao.close();

            } catch (SQLException erro) {

                erro.printStackTrace();
            }
        }
    }

    public void deletarTurma(Turma turma) {

        Connection conexao = null;
        PreparedStatement delete = null;

        try {

            conexao = conectarBanco();
            delete = conexao.prepareStatement("DELETE FROM turma WHERE id_turma = ?");

            delete.setLong(1, turma.getId());

            delete.execute();

        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {

            try {

                if (delete != null)
                    delete.close();

                if (conexao != null)
                    conexao.close();

            } catch (SQLException erro) {

                erro.printStackTrace();
            }
        }
    }

    public void atualizarNomeTurma(Turma turma, String novoNome) {

        Connection conexao = null;
        PreparedStatement update = null;

        try {

            conexao = conectarBanco();
            update = conexao.prepareStatement("UPDATE turma SET nome_turma = ? WHERE id_turma = ?");

            update.setString(1, novoNome);
            update.setLong(2, turma.getId());

            update.execute();

        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {

            try {

                if (update != null)
                    update.close();

                if (conexao != null)
                    conexao.close();

            } catch (SQLException erro) {

                erro.printStackTrace();
            }
        }
    }

    public void atualizarSalaTurma(Turma turma, Sala novaSala) {

        Connection conexao = null;
        PreparedStatement update = null;

        try {

            conexao = conectarBanco();
            update = conexao.prepareStatement("UPDATE turma SET sala_turma = ? WHERE id_turma = ?");

            update.setLong(1, novaSala.getId());
            update.setLong(2, turma.getId());

            update.execute();

        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {

            try {

                if (update != null)
                    update.close();

                if (conexao != null)
                    conexao.close();

            } catch (SQLException erro) {

                erro.printStackTrace();
            }
        }
    }

    public void atualizarHorarioTurma(Turma turma, double novoHorario) {

        Connection conexao = null;
        PreparedStatement update = null;

        try {

            conexao = conectarBanco();
            update = conexao.prepareStatement("UPDATE turma SET horario_turma = ? WHERE id_turma = ?");

            update.setDouble(1, novoHorario);
            update.setLong(2, turma.getId());

            update.execute();

        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {

            try {

                if (update != null)
                    update.close();

                if (conexao != null)
                    conexao.close();

            } catch (SQLException erro) {

                erro.printStackTrace();
            }
        }
    }

    public void atualizarLocalidadeTurma(Turma turma, String novaLocalidade) {

        Connection conexao = null;
        PreparedStatement update = null;

        try {

            conexao = conectarBanco();
            update = conexao.prepareStatement("UPDATE turma SET localidade_turma = ? WHERE id_turma = ?");

            update.setString(1, novaLocalidade);
            update.setLong(2, turma.getId());

            update.execute();

        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {

            try {

                if (update != null)
                    update.close();

                if (conexao != null)
                    conexao.close();

            } catch (SQLException erro) {

                erro.printStackTrace();
            }
        }
    }

    public void atualizarQuantidadeDeVagasTurma(Turma turma, int novaQuantidadeDeVagas) {

        Connection conexao = null;
        PreparedStatement update = null;

        try {

            conexao = conectarBanco();
            update = conexao.prepareStatement("UPDATE turma SET quantidadeDeVagas_turma = ? WHERE id_turma = ?");

            update.setInt(1, novaQuantidadeDeVagas);
            update.setLong(2, turma.getId());

            update.execute();

        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {

            try {

                if (update != null)
                    update.close();

                if (conexao != null)
                    conexao.close();

            } catch (SQLException erro) {

                erro.printStackTrace();
            }
        }
    }




    public void atualizarProfessorTurma(Turma turma, Professor novoProfessor) {

        Connection conexao = null;
        PreparedStatement update = null;

        try {

            conexao = conectarBanco();
            update = conexao.prepareStatement("UPDATE turma SET professor_turma = ? WHERE id_turma = ?");

            update.setLong(1, novoProfessor.getId());
            update.setLong(2, turma.getId());

            update.execute();

        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {

            try {

                if (update != null)
                    update.close();

                if (conexao != null)
                    conexao.close();

            } catch (SQLException erro) {

                erro.printStackTrace();
            }
        }
    }

    public void atualizarSituacaoTurma(Turma turma, boolean novaSituacaoTurma) {

        Connection conexao = null;
        PreparedStatement update = null;

        try {

            conexao = conectarBanco();
            update = conexao.prepareStatement("UPDATE turma SET situacaoTurma_turma = ? WHERE id_turma = ?");

            update.setBoolean(1, novaSituacaoTurma);
            update.setLong(2, turma.getId());

            update.execute();

        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {

            try {

                if (update != null)
                    update.close();

                if (conexao != null)
                    conexao.close();

            } catch (SQLException erro) {

                erro.printStackTrace();
            }
        }
    }

    public void atualizarAulaTurma(Turma turma, String novaAula) {

        Connection conexao = null;
        PreparedStatement update = null;

        try {

            conexao = conectarBanco();
            update = conexao.prepareStatement("UPDATE turma SET aula_turma = ? WHERE id_turma = ?");

            update.setString(1, novaAula);
            update.setLong(2, turma.getId());

            update.execute();

        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {

            try {

                if (update != null)
                    update.close();

                if (conexao != null)
                    conexao.close();

            } catch (SQLException erro) {

                erro.printStackTrace();
            }
        }
    }

    @Override
    public Turma recuperarTurma(Turma turma) {
        return null;
    }


    public List<Turma> recuperarTurmas() {

        Connection conexao = null;
        Statement consulta = null;
        ResultSet resultado = null;

        List<Turma> turmas = new ArrayList<Turma>();

        try {

            conexao = conectarBanco();
            consulta = conexao.createStatement();
            resultado = consulta.executeQuery("SELECT * FROM turma");

            while (resultado.next()) {


                Long id = resultado.getLong("id_turma");
                String nome = resultado.getString("nome_turma");
                Sala sala = new Sala(resultado.getLong("sala_turma"));
                double horario = resultado.getDouble("horario_turma");
                String localidade = resultado.getString("localidade_turma");
                int quantidadeDeVagas = resultado.getInt("quantidadeDeVagas_turma");
                Professor professor = new Professor(resultado.getLong("professor_turma"));
                boolean situacaoTurma = resultado.getBoolean("situacaoTurma_turma");
                String aula = resultado.getString("aula_turma");


                turmas.add(new Turma(id,nome,sala,horario,professor,localidade,quantidadeDeVagas,situacaoTurma,aula));
            }

        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {

            try {

                if (resultado != null)
                    resultado.close();

                if (consulta != null)
                    consulta.close();

                if (conexao != null)
                    conexao.close();

            } catch (SQLException erro) {

                erro.printStackTrace();
            }
        }

        return turmas;
    }

    @Override
    public Turma atualizarAulaTurma(Turma turma) {
        return null;
    }

    @Override
    public Object recuperarTurmas(Turma turma) {
        return null;
    }


    private Connection conectarBanco() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/conectateste?user=admin&password=password");
    }
}