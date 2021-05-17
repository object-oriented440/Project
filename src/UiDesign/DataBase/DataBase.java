package UiDesign.DataBase;

import java.sql.*;

public class DataBase {
    private static final String name = "root";//数据库用户名
    private static final String password = "root";//数据库密码

    private static final String url = "jdbc:mysql://localhost:3306/db_book";//本地数据库shop？
    private static final String driver = "com.mysql.jdbc.Driver";//驱动

    /***注册驱动***/
    static //static块
    {
        try
        {
            Class.forName(driver);
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    //得到数据库连接对象Connection的方法
    public static Connection getConnection()
    {
        try
        {
            return DriverManager.getConnection(url, name, password);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    //关闭连接和执行的打开资源
    public static void close(Connection connection, Statement statement) {
        if (statement != null)
        {
            try
            {
                statement.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        if (connection != null)
        {
            try
            {
                connection.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

    //关闭所有的打开资源
    public static void close(Connection connection, Statement statement, ResultSet rs) {
        if (statement != null)
        {
            try
            {
                statement.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        if (connection != null)
        {
            try
            {
                connection.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        if (rs != null)
        {
            try
            {
                rs.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

//    public static void main(String[] args) {
//        //方法和变量定义为static则不需要new一个对象
//        //则main方法不必存在
//    }
}
