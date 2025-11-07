package Servlet;

import modelo.dao.turma.TurmaDAO;
import modelo.dao.turma.TurmaDaoImpl;
import modelo.entidade.professor.Professor;
import modelo.entidade.sala.Sala;
import modelo.entidade.turma.Turma;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


@WebServlet("/")
public class TurmaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private TurmaDAO dao;

    public void init() {
        dao = new TurmaDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getServletPath();

        try {

            switch (action) {

                case "/novo":
                    mostrarFormularioNovoTurma(request, response);
                    break;

                case "/inserir":
                    inserirTurma(request, response);
                    break;

                case "/deletar":
                    deletarTurma(request, response);
                    break;

                case "/editar":
                    mostrarFormularioNovoTurma(request, response);
                    break;

                case "/atualizar":
                    atualizarTurma(request, response);
                    break;

                default:
                    listarTurmas(request, response);
                    break;
            }

        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listarTurmas(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        List<Turma> turmas = dao.recuperarTurmas();
        request.setAttribute("turmas", turmas);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listar-turma.jsp");
        dispatcher.forward(request, response);
    }

    private void mostrarFormularioNovoTurma(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("form-turma.jsp");
        dispatcher.forward(request, response);
    }

    private void mostrarFormularioEditarTurma(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {


        String idParam = request.getParameter("id");

        if (idParam != null && !idParam.isEmpty()) {
            try {
                long id = Long.parseLong(idParam);
                Turma turma = dao.recuperarTurma(new Turma(id));
                request.setAttribute("turma", turma);
                RequestDispatcher dispatcher = request.getRequestDispatcher("form-turma.jsp");
                dispatcher.forward(request, response);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "ID inválido: " + idParam);
            }
        } else {
            response.sendRedirect("listar"); // volta pra lista se o id estiver faltando
        }
    }

    private void inserirTurma(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        String nome = request.getParameter("nome");
        Long sala = Long.parseLong(request.getParameter("sala"));
        double horario = Double.parseDouble(request.getParameter("horario"));
        String localidade = request.getParameter("localidade");
        int quantidadeDeVagas = Integer.parseInt(request.getParameter("quantidadeDeVagas"));
        long professorId = Long.parseLong(request.getParameter("professorId"));
        boolean situacaoTurma =  Boolean.parseBoolean(request.getParameter("situacaoTurma"));
        String aula = request.getParameter("aula");


        dao.inserirTurma(new Turma(id, nome,new Sala(sala), horario, localidade, quantidadeDeVagas,new Professor(professorId), situacaoTurma, aula));
        response.sendRedirect("listar");
    }

    private void atualizarTurma(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

        String id = request.getParameter("id");
        String nome = request.getParameter("nome");
        String sala = request.getParameter("sala");
        String horario = request.getParameter("horario");
        Professor professor = new Professor(Long.parseLong(request.getParameter("idProfessor")));
        String localidade = request.getParameter("localidade");
        String quantidadeDeVagas = request.getParameter("quantidadeDeVagas");
        Boolean situacaoTurma =  Boolean.parseBoolean(request.getParameter("situacaoTurma"));
        String aula = request.getParameter("aula");
        Turma turma = dao.atualizarAulaTurma(new Turma(id,nome,sala,horario,professor,localidade,quantidadeDeVagas,situacaoTurma,aula));
    }

    private void deletarTurma(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

        long id = Long.valueOf(request.getParameter("id"));
        Turma turma = (Turma) dao.recuperarTurmas(new Turma(id));
        response.sendRedirect("listar");

    }
}