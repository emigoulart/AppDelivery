<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Card&aacute;pios</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Card&aacute;pio: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Pre&ccedil;o</th>
	       <th>Descri&ccedil;&atilde;o</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="item" items="${listagem}">
		      <tr>
				<td>${item.id}</td>
		        <td>${item.nome}</td>
		        <td>${item.preco}</td>
		        <td>${item.descricao}</td>
		        <td><a href="/cardapio/${item.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>