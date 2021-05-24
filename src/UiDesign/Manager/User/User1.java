package UiDesign.Manager.User;


//用户类
public class User1 {
    private String account;
    private String password;

    public User1()
    {

    }
    public User1(String account, String password)
    {

//        this.account = account;
//        this.password = password;
        setAccount(account);
        setPassword(password);
    }
    public void setAccount(String account)
    {
        this.account = account;
    }
    public String getAccount()
    {
        return account;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    }

    public static void main(String[] args) {

    }
}
