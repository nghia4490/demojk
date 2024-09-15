package nhasach;

import java.sql.Connection;
import java.sql.DriverManager;

public class kn {
	
	public static Connection getconnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhasach", "root", "");
			System.out.println("ket noi ok");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		return con;
	}
	

	

}
