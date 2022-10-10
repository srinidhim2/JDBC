package jdbcdemo;
import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from employee");
			
			while(res.next()) {
				System.out.println(res.getInt("id")+" "+res.getString(2)+" "+" "+res.getString(3)+" "+res.getString(4));
			}
			System.out.println(res.next());
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
//			Statement stmt = con.createStatement();
//			stmt.executeUpdate("insert into employee(fname,lname,email) values ('sri','nidhi','mail')");
//			System.out.println("Inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
