package Term_work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeRecords {
	Connection cn = null;
	Statement st = null;
	ResultSet rs;
	EmployeeRecords() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
		st = cn.createStatement();
		rs = st.executeQuery("select * from marksheet");
		System.out.println("Below is the list of Student");
		System.out.println("Name\tMaths\tPhysics\tChemistry");
		while(rs.next()) {
//			System.out.print("\t");
			System.out.print(rs.getString("Name")+"\t");
			System.out.print(rs.getInt("Maths")+"\t");
			System.out.print(rs.getInt("Physics")+"\t");
			System.out.print(rs.getInt("Chemistry")+"\t");
			System.out.println();
		}
	    System.out.println("\n-----------------------End of Program-------------------------\n");
		System.out.println("***************************************************************");
		System.out.println("Implemented By: Abhinav\t Class Roll No. 03\t CSE(G)");
		System.out.println("***************************************************************");
	}
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		new EmployeeRecords();
	}
}
