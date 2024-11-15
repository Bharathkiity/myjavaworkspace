import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 

public class CallableStatementDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, username, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/db12634";
		username = "root";
		password = "root";

		String procedure="{call getAllEmployees()}";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		CallableStatement st = con.prepareCall(procedure);
		
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getDouble("salary"));
			System.out.println(rs.getString("gender"));
			System.out.println(rs.getString("city"));
			System.out.println("====================");
		}
		st.close();
		con.close();

	}
}
