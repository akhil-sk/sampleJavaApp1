/**
 * 
 */
package mypackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author DELL
 *
 */
public class LoginApp {

	/**
	 * Main method for DB operations
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			//get db connection
			DBconnection dbCon = new DBconnection();
			Connection con;
			con = dbCon.getDBconnection();
			Statement stmt=con.createStatement();  
			
			//get details from table - login, columns - id,username,password
			stmt.executeUpdate("insert into public.login (username,password) values('ak','ak')"); 
			stmt.executeUpdate("insert into public.login (username,password) values('me','me')");
			ResultSet rs2=stmt.executeQuery("select * from login");
			while(rs2.next())  
			System.out.println(rs2.getInt(1)+"  "+rs2.getString(2)+"  "+rs2.getString(3));  
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}

}
