import java.sql.*; 


/*
 * 1. Import java package ---> java.sql.*; 
 * 2.load and register the driver --> com.mysql.jdbc.Driver
 * 3.Create connection
 * 4.create statement 
 * 5.execute a statement
 * 6.process the result
 * 7.Close
 */
public class firstConnect {

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/sai";
		String uname = "root";
		String pass = "1934Sai@";
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="select name from students where rollno=2";
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		rs.next();
		String name=rs.getString("name");
		
		System.out.println(name);
		st.close();
		con.close();
	}
}
