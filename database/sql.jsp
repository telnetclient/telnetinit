<%-- Jdbc.jsp --%>
<%@ page import="java.sql.*" %>
<html>
<body>
<table border="1">
  <th>Roll</th><th>Name</th>
  <%!
     Connection con = null;
     Statement stmt = null;
     ResultSet rs = null;
     String url = "jdbc:mysql://localhost/javadb?";
     String user = "root";
     String pass = "root";
  %>
  <%
     try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(url, user, pass);
        if(con!=null) {
           out.println("Successfully connected to " + "MySQL server using TCP/IP..." + "<br>");
           stmt = con.createStatement();
           rs = stmt.executeQuery("select * from student");          
        }
        while (rs.next()) {
  %>
          <tr>
             <td><%=rs.getString(1)%></td>
             <td><%=rs.getString(3)%></td>
          </tr>
  <%
        }
     } 
     catch (Exception e) {
          out.println("Exception: " + e.getMessage());
     } 
     finally {
         try {
            if (con != null) {
                con.close();
            }
         } 
         catch (SQLException e) { }
     }
  %>
</table>
</body>
</html>