package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement stmt = con.createStatement();
			String fname="sri";
			
			int rows = stmt.executeUpdate("delete from employee where fname='"+fname+"'");
			System.out.println("Deleted elements="+rows);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
