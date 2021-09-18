<%-- 
    Document   : index
    Created on : Sep 17, 2021, 8:21:18 PM
    Author     : mateo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">
        <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@300&display=swap" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <%String resultado = "";
            if (request.getAttribute("result") != null) {
                resultado = request.getAttribute("result") + "";
            }
        %>
        <p>Laboratorio EJB Mateo Lis Peña</p>
        <form name="calculator" action="CalcServlet" >
            <input type="text"  name ="result" value="<%=resultado%>" size="61">
            <br>
            <input type="submit" value="1" name="num">
            <input type="submit" value="2" name="num">
            <input type="submit" value="3" name="num">
            <input type="submit" value="+" name="opr">
            <br>
            <input type="submit" value="4" name="num">
            <input type="submit" value="5" name="num">
            <input type="submit" value="6" name="num">
            <input type="submit" value="-" name="opr">
            <br>
            <input type="submit" value="7" name="num">
            <input type="submit" value="8" name="num">
            <input type="submit" value="9" name="num">
            <input type="submit" value="*" name="opr">
            <br>
            <input type="submit" value="C" name="cle">
            <input type="submit" value="0" name="num">
            <input type="submit" value="/" name="opr">
            <input type="submit" value="^" name="opr">
            <input type="submit" value="MOD" name="opr">
            <input type="submit" value="=" name="opr">
        </form>
    </body>
</html>
