import java.sql.*;
public class jdbc {
    Connection con = null;
    Statement stmt = null;

    jdbc() throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
       con = DriverManager.getConnection("jdbc:mysql://loacalhost:3306/studentdb", "root" ,"");

       stmt = con.createStatement();
       ResultSet rs = stmt.executeQuery("Select * from pers");
       System.out.println("below the list of Student");
       System.out.println("Roll no. \tStudent name: \t Course:");
       while(rs.next()){
        System.out.println(rs.getInt("rollno")+ "\t");;
        System.out.println(rs.getString("sname")+"\t");
        System.out.println(rs.getString("Course")+"\t");
        System.out.println(rs.getString("branch")+"\t");
       }
       con.close();
    }
    public static void main(String[] args) {
        try{
            new jdbc();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

// import java.io.IOException;
// import java.net.SocketPermission;
// import java.sql.*;

// public class jdbc {
//     Connection con = null;
//     Statement stmt = null;

//     jdbc() throws ClassNotFoundException, IOException {
//         Class.forName("com.mysql.jdbc.Driver");
//         con = DriverManager.getConnection("jdbc:mysql://loacalhost:3306/studentdb", "root" ,"");
//         stmt = con.createStatement();
//         ResultSet rs = stmt.executeQuery("Select * from pers");
//         while (rs.next()) {
//             System.out.println(rs.getInt("rollno"));
//         }
//         con.close();
//     }

//     public static void main(String[] args) {
//         try {
//             new jdbc();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
