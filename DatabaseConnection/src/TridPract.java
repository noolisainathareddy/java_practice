import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TridPract {
	public static void main(String[] args) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/sai";
		String uname="root";
		String pass= "1934Sai@";
		
		String query = "select * from students";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,uname,pass);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		
		while(rs.next())
		{
			String name = rs.getString("name");
			System.out.println(name);
			
		}
		
		
	}
}