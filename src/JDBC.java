import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/library_management_system?"+"user=root");
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}