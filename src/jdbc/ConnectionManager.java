package jdbc;

/*Class.forName("oracle.jdbc.driver.OracleDriver");
Registering the driver class
Connection connection = null;
connection = DriverManager.getConnection("url","username","password");
connection.close();*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class ConnectionManager {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
final String driver = "com.mysql.cj.jdbc.Driver";
final String url="jdbc:mysql://127.0.0.1:3306/test";
final String username="root";
final String password="";
Class.forName(driver);//Dynamically loads the driver
Connection connection = null;
connection = DriverManager.getConnection(url, username, password);// establishing the connection
if (connection != null) {
	System.out.println("Connection Established to database");
	        } else {
System.out.println("Failed to make connection!");
	        }

/*String sql="insert into student.roles(id,name)values(8,'Mfg')";
Statement stmt=connection.createStatement();
ResultSet rs=stmt.executeQuery("select id,name from registeration");
while(rs.next())
{
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
}

*/
connection.close();
}
}
/*public Connection getConnection() throws ClassNotFoundException, SQLException {
	final String driver = "com.mysql.jdbc.Driver";
	final String url="jdbc:mysql://127.0.0.1:3306/inventory";
	final String username="root";
	final String password="";
	Class.forName(driver);//Dynamically loads the driver
	Connection connection = null;
	connection = DriverManager.getConnection(url, username, password);// establishing the connection
	if (connection != null) {
		System.out.println("Connection Established to database");
		     return connection;   
	} 
	else{
	System.out.println("Failed to make connection!");
	return null;
	}
}*/

