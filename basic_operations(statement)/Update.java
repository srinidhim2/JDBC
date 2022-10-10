package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement stmt = con.createStatement();
			String fname="radha";
			String email="r2@mail.com";
			stmt.executeUpdate("update employee set email='"+email+"' where fname='"+fname+"'");
			System.out.println("Updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
