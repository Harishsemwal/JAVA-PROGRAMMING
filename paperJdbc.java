import java.io.IOException;
import java.sql.*;
public class paperJdbc {
    Connection con = null;
    Statement stmt = null;

    paperJdbc() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from pers");
        System.out.println("Below the List of Student: ");
        System.out.println("name\tRoll Number\tid\t");

        while(rs.next()){
            System.out.println(rs.getInt("rollnumber")+ "\t");
        }
        rs.close();
    }
    public static void main(String[] args) {
        try{
            new paperJdbc();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
