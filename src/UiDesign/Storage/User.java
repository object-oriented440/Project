package UiDesign.Storage;

import java.awt.*;

public class User {
    private String account;
    private String password;
    private String sex;
    private int imageInt;

    public User()
    {

    }
    public User(String account,String password,String sex,int imageInt)
    {
        this.account = account;
        this.password = password;
        this.sex = sex;
        this.imageInt = imageInt;
    }

}
