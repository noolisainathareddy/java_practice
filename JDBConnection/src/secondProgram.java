import java.sql.*; 

public class secondProgram {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:sql://localhost:3306/sai";
		String uname="root";
		String pass="1934Sai@";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="Select name from sai where roolno>=1";
		
		
		Connection con=DriverManager.getConnection(url,uname,pass); 
		
	
		Statement st=con.createStatement(); 
		
		ResultSet rs=st.executeQuery(query); 
		rs.next();
		
		String name = rs.getString("name");
		
		System.out.println(name);
		
		st.close();
		con.close(); 
	}
}
