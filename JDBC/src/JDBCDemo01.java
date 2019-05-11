import javax.sql.rowset.JdbcRowSet;
import javax.xml.transform.Result;
import java.sql.*;

public class JDBCDemo01 {
    public static void main(String[] args) {
//        selectALL();
       // System.out.println(selectByusernamepassword("Micheal","asfasf' or '1'='1"));
//        System.out.println(selectByup("Micheal","asfasf' or '1'='1"));
//        System.out.println(selectByup("Micheal","123"));
      //  selectuserBypage(2,4);
//        selectALL();
//        insert("日出东方","1234");
//        delete(38);
//        update(37,"akjsfasjfasfi");
        transferAcounts("东方不败","令狐冲",1000);
}
    public static void selectALL(){
        Connection con= null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            con=JDBCUtils.getCinnection();
            stmt=con.createStatement();
            rs= stmt.executeQuery("select * from user");
            while (rs.next()){
                System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
//               System.out.println(s.getInt(1)+','+s.getString("username")+','+s.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
        JDBCUtils.close(con,stmt,rs);

        }
    }
    public static boolean selectByusernamepassword(String username,String password){
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String ur1="jdbc:mysql://localhost:3306/web01?useUniconde=true&characterEncoding=UTF8&useSSL=false";
//            String user="root";
//            String password="root";
            con=DriverManager.getConnection(ur1,"root","root");
            stmt=con.createStatement();
            String sql="select * from user where username='"+username+"'and password='"+password+"'";
            System.out.println(sql);
            rs=stmt.executeQuery(sql);
            if(rs.next()){
                return true;
            }
            else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean selectByup(String username,String password){
        Connection con=null;
        PreparedStatement  pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/web01?useUniconde=true&characterEncoding=UTF8&useSSL=false";

            con=DriverManager.getConnection(url,"root","root");

            String sql="select * from user where username=?and password=?";
            pstmt=con.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs=pstmt.executeQuery();
            if(rs.next()){
                return true;
            }
            else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(con!=null)con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(pstmt!=null)pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(rs!=null)rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static void selectuserBypage(int pagenumber,int pagecount){
        Connection con=null;
        PreparedStatement  pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/web01?useUniconde=true&characterEncoding=UTF8&useSSL=false";

            con=DriverManager.getConnection(url,"root","root");

            String sql="select * from user limit ?,?";
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1,pagecount*(pagenumber-1));
            pstmt.setInt(2,pagecount);

            rs=pstmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
//               System.out.println(s.getInt(1)+','+s.getString("username")+','+s.getString("password"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(con!=null)con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(pstmt!=null)pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(rs!=null)rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void insert(String username,String password){
        Connection con=null;
        PreparedStatement  pstmt=null;
        ResultSet rs=null;
        try {
            con=JDBCUtils.getCinnection();
            String sql="insert into user (username,password) values(?,?)";
            pstmt=con.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            int result=pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(con,pstmt,rs);
        }
    }
    public static void delete(int id){
        Connection con=null;
        PreparedStatement  pstmt=null;
        ResultSet rs=null;
        try {
            con=JDBCUtils.getCinnection();
            String sql="delete from user where id=?";
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1,id);
            int result=pstmt.executeUpdate();
            if(result>0)System.out.println("删除成功");

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(con,pstmt,rs);
        }
    }
    public static void update(int id,String newpassword){
        Connection con=null;
        PreparedStatement  pstmt=null;
        ResultSet rs=null;
        try {
            con=JDBCUtils.getCinnection();
            String sql="update user set password=? where id=?";
            pstmt=con.prepareStatement(sql);
            pstmt.setString(1,newpassword);
            pstmt.setInt(2,id);
            int result=pstmt.executeUpdate();
            if(result>0)System.out.println("修改成功");

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(con,pstmt,rs);
        }
    }
    public static void transferAcounts(String username1,String username2,int menoy){
        Connection con=null;
        PreparedStatement  pstmt1=null;
        PreparedStatement  pstmt2=null;
        ResultSet rs=null;
        try {
            con=JDBCUtils.getCinnection();
//            con=DBCPDataSource.getConnection();
//            con.setAutoCommit(false);
            con=C3P0DataSource.getConnection();
            String sql="update user set balance=balance - ? where username = ?";
            pstmt1=con.prepareStatement(sql);
            pstmt1.setInt(1,menoy);
            pstmt1.setString(2,username1);
            pstmt1.executeUpdate();

            sql="update user set balance = balance + ? where username = ?";
            pstmt2=con.prepareStatement(sql);
            pstmt2.setInt(1,menoy);
            pstmt2.setString(2,username2);
            pstmt2.executeUpdate();
//            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
           DBCPDataSource.close(con,pstmt2,pstmt1,rs);
        }
    }
}

