import java.sql.*;

public class MySqlConn {

  public static void main(String[] args) {

    try {
      // Load the JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");


      // Establish a connection
      String url = "jdbc:mysql://localhost:3306/mydb";
      String user = "root";
      String password = "password";
      Connection con = DriverManager.getConnection(url, user, password);

      // Create a statement
      Statement stmt = con.createStatement();

      // Execute a query
      ResultSet rs = stmt.executeQuery("SELECT * FROM student");

      // Display the result set
      if (rs != null) {
        System.out.println("Display Data:");
        while (rs.next()) {
          System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
      }

      // Close the connection
      con.close();

    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
