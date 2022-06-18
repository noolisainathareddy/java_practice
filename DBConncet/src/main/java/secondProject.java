import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class secondProject {

	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/sai";
		
		String username="root";
		String pass= "1934Sai@";
		
		String query = "select name from students"; 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		
		Connection con = DriverManager.getConnection(url,username,pass); 
		
		Statement st = con.createStatement();
		
		
		ResultSet rs= st.executeQuery(query); 
		
		 
		
		while(rs.next())
		{
			String dbName= rs.getString("name"); 
			
			System.out.println(dbName); 
		}
		
	}
}
