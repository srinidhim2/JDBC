package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PreparedStmt {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
			//create prepared statement
			PreparedStatement stmt= con.prepareStatement("select * from employee where id=? and fname=?");
			
			//set parameters
			stmt.setInt(1, 1);
			stmt.setString(2, "raki");
			
			//execute query
			ResultSet res = stmt.executeQuery();
			
			while(res.next()) {
				System.out.println(res.getInt("id")+" "+res.getString(2)+" "+" "+res.getString(3)+" "+res.getString(4));
			}
			System.out.println(res.next());

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
