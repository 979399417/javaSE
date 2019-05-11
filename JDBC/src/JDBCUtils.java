import java.sql.*;
import java.util.ArrayList;

public class JDBCUtils {
    public static final String username="root";
    public static final String password="root";
    public static final String url="jdbc:mysql://localhost:3306/web01?useUniconde=true&characterEncoding=UTF8&useSSL=false";
   private static ArrayList<Connection> conlist=new ArrayList<Connection>();
    static {
        for (int i=0;i<5;i++){
            Connection con=creategetconnection();
            conlist.add(con);
        }
    }

    public static Connection creategetconnection(){
     try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
     return null;
    }
    public static Connection getCinnection(){
        if(conlist.isEmpty()==false){
            Connection con=conlist.get(0);
            conlist.remove(con);
            return con;
        }
        else {
            return creategetconnection();
        }
    }

    public static void close(Connection con,Statement stmt, ResultSet rs){
        closeConnection(con);
        closeResultSet(rs);
        closeStatement(stmt);
        conlist.add(con);

    }
    public static void close(Connection con,Statement stmt1,Statement stmt2, ResultSet rs){
        closeConnection(con);
        closeResultSet(rs);
        closeStatement(stmt1);
        closeStatement(stmt2);
        conlist.add(con);

    }
    public static void closeConnection(Connection con){
        try {
            if(con!=null)con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void closeStatement(Statement stmt){
        try {
            if(stmt!=null)stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void closeResultSet(ResultSet rs){

        try {
            if(rs!=null)rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
