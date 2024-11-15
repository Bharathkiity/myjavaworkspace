import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		String driver,url,username,password;
		driver="com.mysql.cj.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/edb12634";
		username="root";
		password="root";
		
		String UpdateQuery="delete from employee where id=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc.nextInt();
		Connection con=DriverManager.getConnection(url,username,password);

		
		PreparedStatement st=con.prepareStatement(UpdateQuery);
		st.setInt(1,id);
		int status=st.executeUpdate();
		if(status>0) {
			System.out.println("Row Deleted ");
		}else {
			System.out.println("not deleted");
		}

	
		st.close();
		con.close();
}
}
