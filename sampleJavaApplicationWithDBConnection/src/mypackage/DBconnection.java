package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

	private final String driver = "org.postgresql.Driver";
	private final String dbName = "postgres";
	private final String userName = "postgres";
	private final String password = "meethu";
	private final String connectionUrl = "jdbc:postgresql://localhost:5432/";
	
	public Connection getDBconnection() {
		
		Connection con = null;
		
		try {
			Class.forName(driver);  
			 con=DriverManager.getConnection(connectionUrl+dbName,userName,password);
		}
		catch (SQLException sqe) {
			System.out.println("Connection to DB failedSS");
		}
		catch (ClassNotFoundException cnfe) {
			System.out.println("Driver class not found");
		}

		return con; 
	}
	
	
}
