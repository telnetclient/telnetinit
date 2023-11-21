<%-- Jdbc.jsp --%>
<%@ page import="java.sql.*" %>
<html>
<body>
<form>
	Enter Roll: <input type="text" name="n1"/><br/>
	Enter Name: <input type="text" name="n2"/><br/>
	<br/>
	<input type ="submit" value="Insert"/>
</form>
<%
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://localhost/javadb?";
    String user = "root";
    String pass = "root";
    PreparedStatement ps=null;
%>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(url, user, pass);
        if(con!=null) {
            out.println("Successfully connected to MySQL server using TCP/IP..." + "<br>");
            String inp1=request.getParameter("n1");
            String inp2=request.getParameter("n2");
            int px;
            if(inp1!=null){
                px=Integer.parseInt(inp1);
            }
            px=Integer.parseInt(inp1);
            String query = "insert into student values("+px+",'"+inp2+"')";
            ps=con.prepareStatement(query); 
            ps.execute();
            out.println("Row is Inserted" + "<br>");

            // Fetch and display data
            stmt = con.createStatement();
            String selectQuery = "select * from student";
            rs = stmt.executeQuery(selectQuery);

            %>
            <table border="1">
                <th>Roll</th><th>Name</th>
                <%
                    while (rs.next()) {
                        out.println("<tr>");
                        out.println("<td>" + rs.getInt("roll") + "</td>");
                        out.println("<td>" + rs.getString("name") + "</td>");
                        out.println("</tr>");
                    }
                %>
            </table>
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
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        } 
        catch (SQLException e) { }
    }
%>
</body>
</html>
