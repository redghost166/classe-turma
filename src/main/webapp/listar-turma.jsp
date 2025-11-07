<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Listar turma</title>
		<style><%@include file="/resources/css/estilo.css"%></style>
		<script><%@include file="/resources/js/filtros.js"%></script>
	</style>
	</head>
<body>
	<%@ include file="menu.jsp"%>
	<div>
		<div>
			<h1>turma</h1>
			<input type="search" id="consulta-email" onkeyup="filtrarTabelaEmail()" placeholder="Procure por e-mails...">
			<table id="tabela-turma">
				<thead>
					<tr>
						<th>E-mail</th>
						<th>Telefone</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="turma" items="${turma}">
						<tr>
							<td><c:out value="${turma.email}" /></td>
							<td><c:out value="${turma.telefone}" /></td>
								<td>
								<a href="editar?id=<c:out value='${turma.id}'/>">Editar</a>
								<a href="deletar?id=<c:out value='${turma.id}'/>">Deletar</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	</body>
</html>