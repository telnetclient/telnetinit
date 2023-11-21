<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Addition Program</title>
</head>
<body>
    <form method="post" action="">
        Enter Number 1: <input type="text" name="num1"><br>
        Enter Number 2: <input type="text" name="num2"><br>
        <input type="submit" value="Add">
    </form>

    <%
        // Get values from the form
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");

        // Check if values are not empty
        if (num1Str != null && num2Str != null && !num1Str.isEmpty() && !num2Str.isEmpty()) {
            // Parse the input values to integers
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            // Perform addition
            int sum = num1 + num2;

            // Display the result
    %>
            <p>Result of addition: <%= sum %></p>
    <%
        }
    %>
</body>
</html>
