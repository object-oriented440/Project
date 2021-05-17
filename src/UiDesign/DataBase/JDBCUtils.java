package UiDesign.DataBase;

import java.sql.*;

//连接JDBC类
public class JDBCUtils {

    /*
    * 加载驱动
    * 建立数据库连接
    *
    * @return 返回数据库连接
    * @throws 抛出相应异常
    * */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        //type method() throws ClassNotFoundException
        Class.forName("com.mysql.jdbc.Driver");//设置数据库驱动

        //?
        String url = "jdbc:mysql://localhost:3306/db_bookSystem";//数据库连接URL以及数据库的名称

        String Username = "root";//账户名
        String Password = "root";//密码

        /***创建连接***/
        //type method() throws SQLException
        Connection connection = DriverManager.getConnection(url,Username,Password);
        return connection;
    }
    /*
    * 断开数据库连接，释放资源
    *
    * @param(参数)
    * @param statement
    * @param connection
    * */
    public static void release(Statement statement,Connection connection) {//throws SQLException {
        if(statement != null)
        {
            //statement.close();
            /*
            * 1.Add exception to method signature(签名)
            * 2.surround with try/catch
            * */
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            statement = null;
        }
        if(connection != null)
        {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            connection = null;
        }
    }
    /*
    * 断开数据库连接，释放资源
    * void release()重载函数
    *
    * @param
    * @param
    * @param
    *
    * */
    public static void release(Statement statement, Connection connection, ResultSet resultSet)
    {
        if(resultSet != null)
        {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            resultSet = null;
        }
        release(statement,connection);
    }

//    public static void main(String[] args) {
//
//    }
}
