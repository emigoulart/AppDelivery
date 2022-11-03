<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Restaurantes</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Restaurante: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>cnpj</th>
	         <th>Descri&ccedil;&atilde;o</th>
	        <th>Endere&ccedil;o</th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="rest" items="${listagem}">
		      <tr>
				<td>${rest.id}</td>
		        <td>${rest.nome}</td>
		        <td>${rest.cnpj}</td>
		        <td>${rest.descricao}</td>
		        <td>${rest.endereco}</td>
		        <td><a href="/restaurante/${rest.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>