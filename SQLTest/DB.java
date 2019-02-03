package SQLTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB
{
    public static void main(String[] args)
    {
        Connection con;
        String driver = "com.mysql.jdbc.Driver";
        //这里我的数据库是qcl
        String url = "jdbc:mysql://localhost:3306/qcl";
        String user = "root";
        String password = "qcl123";
        try
        {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed())
            {
                System.out.println("数据库连接成功");
            }
            Statement statement = con.createStatement();
            String sql = "select * from home;";//我的表格叫home
            ResultSet resultSet = statement.executeQuery(sql);
            String name;
            while (resultSet.next())
            {
                name = resultSet.getString("name");
                System.out.println("姓名：" + name);
            }
            resultSet.close();
            con.close();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("数据库驱动没有安装");

        }
        catch (SQLException e)
        {
            System.out.println("数据库连接失败");
        }
    }
}