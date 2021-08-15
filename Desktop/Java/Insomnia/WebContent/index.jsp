<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF8">
<title>Sobre</title>
</head>
<body>
	<%
		String nome = request.getParameter("nome");
	String idadeString = request.getParameter("idade");
	String sexo = request.getParameter("sexo");

	if (sexo != null) {
		if (sexo.toUpperCase().equals("M")) {
			sexo = "Homem";
		} else if (sexo.toUpperCase().equals("F")) {
			sexo = "Mulher";
		} else {
			sexo = "Trans";
		}
	}

	String classifica = null;
	int idade = 0;
	if (idadeString != null) {
		 idade = Integer.parseInt(idadeString);
		if (idade > 50) {
			classifica = "idoso";
		} else if (idade > 25) {
			classifica = "adulto";
		} else if (idade > 18) {
			classifica = "jovem";
		} else if (idade > 10) {
			classifica = "adolescente";
		} else {
			classifica = "criança";
		}
	}

	out.print("Oi " + nome + " , você tem " + idade + " anos, é " + sexo + " e é " + classifica + ".");
	%>
</body>
</html>