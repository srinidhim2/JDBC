package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement stmt = con.createStatement();
			String fname="radha";
			String lname="S";
			String email="r@mail.com";
			stmt.executeUpdate("insert into employee(fname,lname,email) values ('"+fname+"','"+lname+"','"+email+"')");
			System.out.println("Inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
