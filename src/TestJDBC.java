import java.sql.*;
import java.util.*;
public class TestJDBC {
    private static final String URL = "jdbc:mysql://127.0.0.1/test";
    private static final String USER = "root";
    private static  String PASSWORD;
    public static void main(String[] args)throws Exception {
        Scanner b= new Scanner(System.in);
       int id,grade;
        String name;
        id=b.nextInt();
        grade=b.nextInt();
        name=b.nextLine();
        System.out.println("请输入密码：");
        PASSWORD = b.next();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from frist");

        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")+","+resultSet.getString("name"));
        }
        String sql = "insert into frist values("+id+","+name+","+grade+")";
        statement.executeUpdate(sql,2);
    }
}