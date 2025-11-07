<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Cadastro de Turma</title>
		<style><%@include file="/resources/css/estilo.css"%></style>
		<script><%@include file="/resources/js/mascaras.js"%></script>
	</head>
	<body>
		<%@ include file="menu.jsp"%>
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
						<input type="hidden" name="id" value="<c:out value='${turma.id}' />" />
					</c:if>
					<label>Telefone:</label>
					<input type="tel" value="<c:out value='${turma.telefone}' />" id="telefone" name="telefone" oninput="mascaraTelefone()" placeholder="Informe o seu telefone...">
					<label>E-mail:</label>
					<input type="email" value="<c:out value='${turma.email}'/>" id="email" name="email" placeholder="Informe o seu e-mail...">
					<button type="submit">Salvar</button>
					<button type="reset">Limpar Formulário</button>
				</form>
				</div>
			</div>
		</div>
	</body>
</html>