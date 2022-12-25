import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.coders.StringUtf8Coder;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.io.jdbc.JdbcIO;
import org.apache.beam.sdk.values.PCollection; 

public class Demo {

	public static void main(String[] args)
	{
		Pipeline p=Pipeline.create();
		
		PCollection<String> poutput= p.apply(JdbcIO.<String>read().
				 withDataSourceConfiguration(JdbcIO.DataSourceConfiguration
						 .create("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/sai?useSSL=false") 						 
						 .withUsername("root")
						 .withPassword("1934Sai@"))
						 .withQuery("Select rollno, name from students from where rollno = ? ")
						 .withCoder(StringUtf8Coder.of())
						 .withStatementPreparator(new JdbcIO.StatementPreparator() {
							
							@Override
							public void setParameters(PreparedStatement preparedStatement) throws Exception {
								// TODO Auto-generated method stub
								
								preparedStatement.setInt(1, 15);
								
							}
						})
						 
				 .withRowMapper(new JdbcIO.RowMapper<String>() {
					 
					 public String mapRow(ResultSet resultSet) throws Exception
					 {
						 return resultSet.getInt(1)+resultSet.getString(2);
					 }
				})
				 
				); 
	poutput.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/DBConnect/output/result.csv").withNumShards(1).withSuffix(".csv"));
		
		p.run(); 
		
	}
}
