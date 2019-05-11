import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
        String ur1="jdbc:mysql://localhost:3306/web01";
        String user="root";
        String password="root";
        Connection con= DriverManager.getConnection(ur1,user,password);
        System.out.println(con);
    }
}
