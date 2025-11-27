<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastro de Turma</title>
    <style>
        <%@include file="/resources/css/estilo.css" %>
    </style>
</head>
<body>
<%@ include file="menu.jsp" %>
<div>
    <div>
        <h1>
            <c:if test="${turma != null}">Editar turma</c:if>
            <c:if test="${turma == null}">Inserir turma</c:if>
        </h1>
        <div>
            <c:if test="${turma != null}">
            <form action="atualizar" method="post">
                </c:if>
                <c:if test="${turma == null}">
                <form action="inserir" method="post">
                    </c:if>
                    <c:if test="${turma != null}">
                        <input type="hidden" name="id" value="<c:out value='${turma.id}' />"/>
                    </c:if>

                        <label>ID:</label>
                        <c:if test="${turma == null}">
                            <input type="text" name="id" placeholder="Informe o ID da turma...">
                        </c:if>

                        <label>Nome:</label>
                        <input type="text" name="nome" value="<c:out value='${turma.nome}'/>" placeholder="Informe o nome da turma...">

                        <label>Sala:</label>
                        <input type="text" name="salaId" value="<c:out value='${turma.sala.id}'/>" placeholder="Informe o ID da sala...">

                        <label>Horário:</label>
                        <input type="text" name="horario" value="<c:out value='${turma.horario}'/>" placeholder="Informe o horário (ex: 13.30)">

                        <label>ID do Professor:</label>
                        <input type="text" name="idProfessor" value="<c:out value='${turma.professor.id}'/>" placeholder="Informe o ID do professor...">

                        <label>Localidade:</label>
                        <input type="text" name="localidade" value="<c:out value='${turma.localidade}'/>" placeholder="Informe a localidade...">

                        <label>Quantidade de Vagas:</label>
                        <input type="number" name="quantidadeDeVagas" value="<c:out value='${turma.quantidadeDeVagas}'/>" placeholder="Informe a quantidade de vagas...">

                        <label>Situação da Turma:</label>
                        <select name="situacaoTurma">
                            <option value="true" <c:if test="${turma.situacaoTurma}">selected</c:if>>Ativa</option>
                            <option value="false" <c:if test="${!turma.situacaoTurma}">selected</c:if>>Inativa</option>
                        </select>
                        <p></p>
                        <label>ID da Disciplina:</label>
                        <input type="text" name="idDisciplina" value="<c:out value='${turma.Disciplina.id}'/>" placeholder="Informe o ID da Disciplina...">


                        <label>Aula:</label>
                        <input type="text" name="aula" value="<c:out value='${turma.aula}'/>" placeholder="Informe o nome da aula...">


                    <button type="submit">Salvar</button>
                    <button type="reset">Limpar Formulário</button>
                </form>
                    <a href="./telas/turmas.jsp">aaaaaaa</a>
        </div>
    </div>
</div>
</body>
</html>