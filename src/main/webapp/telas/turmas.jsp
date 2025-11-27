<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt" %>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tela Turmas</title>
    <script src="<c:url value='/resources/telas/componentes.js'/>"></script>
</head>

<body>


<header-component></header-component>

<div id="main">
    <p>inicio tela</p>
    <h2>Minhas Turmas</h2>
    <h3>texto placeholder para as turmas do professor</h3>

    <div>
        <ul>
            <c:forEach var="turma" items="${turmas}">
            <li>
                <div id="turmaInfo">
                    <p>${turma.nome}</p>
                    <p>${turma.localidade}</p>
                </div>
            </li>
            </c:forEach>
        </ul>
    </div>

    <p>fim tela</p>
</div>

<div id="bottombarr">
    <p>inicio barra inferior</p>
    <p>fim barra inferior</p>
</div>

</body>

</html>