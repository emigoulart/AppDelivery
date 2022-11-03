<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Entradas</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Entradas: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Pre&ccedil;o</th>
	        <th>Cortesia</th>
	        <th>Tamanho</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="entrada" items="${listagem}">
		      <tr>
				<td>${entrada.id}</td>
		        <td>${entrada.nome}</td>
		        <td>${entrada.preco}</td>
		        <td>${entrada.cortesia}</td>
		        <td>${entrada.tamanho}</td>
		        <td><a href="/entrada/${entrada.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>