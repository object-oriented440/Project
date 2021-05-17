package UiDesign.Manager.VerifyAccount;

import UiDesign.DataBase.DataBase;
import UiDesign.Manager.User.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Verify {
    public User getUserByAccount(String account)
    {
        //???
        Connection connection = DataBase.getConnection();//获得数据库连接对象
        //???

        String sql = "select account,pass from t_user where account=?";
        try
        {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, account);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {//存在用户，封装用户返回
                User user = new User(rs.getString("accout"), rs.getString("pass"));
                DataBase.close(connection, ps);//关闭连接
                return user;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertUser(User user)
    {
        Connection connection = DataBase.getConnection();//获得数据库连接对象

        String sql = "insert into t_user(account,password)values(?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getAccount());
            ps.setString(2, user.getPassword());
            if (!ps.execute())
            {//成功
                DataBase.close(connection, ps);//关闭连接
                return true;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;//失败
    }

//    public static void main(String[] args) {
//
//    }
}
