import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		String driver,url,username,password;
		driver="com.mysql.cj.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/edb12634";
		username="root";
		password="root";
		
		String insertQuery="insert into employee values(?,?,?,?,?)";
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter id:");
		int id=sc.nextInt();
		System.out.println("please enter name:");
		String name=sc.next();
		System.out.println("please enter email:");
		String email=sc.next();
		System.out.println("please enter mobile:");
		long mobile=sc.nextLong();
		System.out.println("please enter salary:");
		double salary=sc.nextDouble();
	

		Connection con=DriverManager.getConnection(url,username,password);

		
		PreparedStatement st=con.prepareStatement(insertQuery);
		st.setInt(1, id);
		st.setString(2,name);
		st.setString(3,email);
		st.setLong(4,mobile);
		st.setDouble(5, salary);
		
		//process insert query
		int status=st.executeUpdate();
		if(status>=1) {
			System.out.println("Success");
		}else {
			System.out.println("Failed");
		}

	
		st.close();
		con.close();
}
}
