import java.sql.*;



public class secondProject {

	public static void main(String[] args)  throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/sai"; 
		
		String uname = "root";
		
		String pass = "1934Sai@"; 
		
		String query  = "Select * from students"; 
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st =con.createStatement(); 
		
		ResultSet rs = st.executeQuery(query); 
		
		System.out.println("Roll No \t name");
		while(rs.next())
		{
			String dbName = rs.getString("name"); 
			
			int rollNo  = rs.getInt("rollno"); 
			
			
			System.out.println(rollNo + "\t" + dbName); 
		}
		
		st.close();
		rs.close(); 
		
	}
}
