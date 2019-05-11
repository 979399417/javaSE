import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCPDataSource {
    public static final String username="root";
    public static final String password="root";
    public static final String url="jdbc:mysql://localhost:3306/web01?useUniconde=true&characterEncoding=UTF8&useSSL=false";
    private static   BasicDataSource ds;
    static {
        ds=new BasicDataSource();
        ds.setDriverClassName("com.mysql,jdbc.Driver");
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);

        ds.setInitialSize(5);
        ds.setMaxTotal(20);
        ds.setMinIdle(3);
    }
    public static Connection getConnection(){
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void close(Connection con,Statement stmt, ResultSet rs){
        closeConnection(con);
        closeResultSet(rs);
        closeStatement(stmt);

    }
    public static void close(Connection con,Statement stmt1,Statement stmt2, ResultSet rs){
        closeConnection(con);
        closeResultSet(rs);
        closeStatement(stmt1);
        closeStatement(stmt2);

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
