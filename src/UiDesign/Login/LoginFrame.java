package UiDesign.Login;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.LibrarianFrame.LibrarianFrame;
import UiDesign.Enter.SystemFrame.SystemFrame;
import UiDesign.Enter.UserFrame.UserFrame;
import UiDesign.Manager.VerifyAccount.*;

public class LoginFrame extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panel;//
    private JPanel panelChoose;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private JTextField textAccount;
    private JPasswordField textPassword;
    private SetIcons setIcons;
    private UserFrame userFrame;
    private LibrarianFrame librarianFrame;
    private SystemFrame systemFrame;

    Verify verify;//定义用户操作对象

    public void setVariate_frame(JFrame jf)
    {
        this.frame = jf;
    }

    void LoginChoose(JFrame frame)
    {
        panelChoose= new JPanel();

        Color color1 = new Color(240,255,255);
//        panelChoose.setBackground(color1);
//
//        rb1.setBackground(color1);
//        rb2.setBackground(color1);
//        rb3.setBackground(color1);


//        JRadioButton rb1 = new JRadioButton("用户登录");
//        JRadioButton rb2 = new JRadioButton("图书管理员登录");
//        JRadioButton rb3 = new JRadioButton("系统管理员登录");

        rb1.addActionListener(this);
        rb1.setActionCommand("User");

        rb2.addActionListener(this);
        rb2.setActionCommand("Librarian");

        rb3.addActionListener(this);
        rb3.setActionCommand("SystemAdministrator");


        panelChoose.add(rb1);
        panelChoose.add(rb2);
        panelChoose.add(rb3);

        rb2.setSelected(true);

        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        frame.add(panelChoose, BorderLayout.NORTH);
    }
    void LoginAccount(JFrame frame,JPanel panel)
    {
        Color color2 = new Color(255 ,228, 225);

        panel.setLayout(new GridLayout(5,1));
        //panel.setBackground(color2);
        //panel.setLayout(new FlowLayout(FlowLayout.LEFT,30,30));

//        JPanel p = new JPanel();
//        p.setLayout(new GridLayout(3,1));
//        p.setBackground(new Color(255,250,240));

        JLabel labelSystem = new JLabel("图书管理系统");
        labelSystem.setFont(new Font("微软雅黑",Font.BOLD,40));
        //labelSystem.set

        JPanel panelSystem = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        p3.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

        JLabel labelAccount = new JLabel("账号:");
        JLabel labelPassword = new JLabel("密码:");
//        textAccount = new JTextField(12);
//        textPassword = new JTextField(12);

        //JButton loginButton = new JButton("登录");
        JButton loginButton = new JButton();

        JLabel labelCheck = new JLabel();
        //setIcons.setJLabelIcon(labelCheck,"src/Images/浏览.png",15,15);
        setIcons.setJLabelIcon(labelCheck,"src/Images/闭眼睛.png");


        loginButton.addActionListener(this);//设置事件监听
        loginButton.setActionCommand("login");//设置监听识别命令？


        //JButton registerButton = new JButton("注册");
        JButton registerButton = new JButton();
        registerButton.addActionListener(this);//设置事件监听
        registerButton.setActionCommand("register");//设置监听识别命令？


        panelSystem.add(labelSystem);
        p1.add(labelAccount);
        p1.add(textAccount);
        p2.add(labelPassword);
        p2.add(textPassword);

        //p2.add(labelCheck);

        p3.add(loginButton);
        p3.add(registerButton);

        //为标签设置图标

        setIcons.setJLabelIcon(labelSystem,"src/Images/logo.png");

        //setIcons.setJLabelIcon(labelAccount,"src/Images/userName.png");
        setIcons.setJLabelIcon(labelAccount,"src/Images/用户名 (2).png");
        //setIcons.setJLabelIcon(labelAccount,"src/Images/我的2.png",15,15);

        //setIcons.setJLabelIcon(labelPassword,"src/Images/password.png");
        setIcons.setJLabelIcon(labelPassword,"src/Images/密码 (2).png");
        //setIcons.setJLabelIcon(labelPassword,"src/Images/密码.png",20,20);
        //为按钮设置图标
        //setIcons.setJButtonIcon(loginButton,"src/Images/login.png");
        setIcons.setJButtonIcon(loginButton,"src/Images/登录.png");
        //setIcons.setJButtonIcon(loginButton,"src/Images/login.png",15,15);
        setIcons.setJButtonIcon(registerButton,"src/Images/注册 (2).png");
        //setIcons.setJButtonIcon(registerButton,"src/Images/注册.png",16,16);

//        p.add(p1);
//        p.add(p2);
//        p.add(p3);

        panel.add(panelSystem);
        panel.add(panelChoose);
        panel.add(p1);
        panel.add(p2);
        panel.add(p3);

        //无法设置背景色
//        labelAccount.setBackground(color2);
//        labelPassword.setBackground(color2);
//        textAccount.setBackground(color2);
//        textPassword.setBackground(color2);
//        panel.setBackground(color2);

//        JPanel cards = new JPanel(new CardLayout());
//        cards.add(panel,"card1");
//
//        //
//        CardLayout cl = (CardLayout)(cards.getLayout());
//        cl.show(cards,"card1");

        //无效
//        Dimension dimension = new Dimension(160, 60);
//        panel.setPreferredSize(dimension);

//        frame.add(p,BorderLayout.CENTER);
        frame.add(panel,BorderLayout.CENTER);
    }
    void InitVariate()
    {
        frame = new JFrame("登录界面");
        panel = new JPanel();//内容窗口？
        rb1 = new JRadioButton("用户登录");
        rb2 = new JRadioButton("图书管理员登录");
        rb3 = new JRadioButton("系统管理员登录");
        textAccount = new JTextField(12);
        textPassword = new JPasswordField(12);
        setIcons = new SetIcons();

        textAccount.setText("张三");
        textPassword.setText("123456");
    }
    void setFrame()
    {
        //frame.setBackground(new Color(255 ,255 ,240));
        frame.setBounds(300,200,600,400);
        replaceLogo();
    }
    void replaceLogo()
    {
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/图书馆3.png"));
    }
    void setClosedVisible()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private void setContentPane()
    {
        LoginChoose(frame);//登录账户选择（三选一）
        LoginAccount(frame,panel);//选择登录账户后的界面
    }
    public LoginFrame()
    {
        InitVariate();//初始化变量
        setFrame();
        setContentPane();
        setClosedVisible();
    }
    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
//        login.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        login.getFrame().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取账号，去掉后面的空格？
        String account = textAccount.getText().trim().toString();
        //获取密码，去掉后面的空格？
        String password = textPassword.getText().trim().toString();

        if(e.getActionCommand().equals("login"))//点击登录按钮
        {

            if(account.equals("张三") && password.equals("123456"))
            {

                frame.dispose();//关闭当前窗口
                //frame.setVisible(false);//关闭当前窗口

                //new UserFrame();//打开相应界面
                if(rb1.isSelected())//如果rb1
                {
                    //new UserFrame();
                    userFrame = new UserFrame(frame);
                    //userFrame.setVariate_previousFrame(this);
                    userFrame.Execute();
                    userFrame.setClosedVisible();
                }
                if(rb2.isSelected())//如果rb2
                {
                    librarianFrame = new LibrarianFrame(frame);
                    //librarianFrame.setVariate_previousFrame(this);
                    librarianFrame.Execute();
                    librarianFrame.setClosedVisible();//可关和可视
                }
                if(rb3.isSelected())//如果rb3
                {
                    //new SystemFrame();
                    systemFrame = new SystemFrame(frame);
                    //systemFrame.setVariate_previousFrame(this);
                    systemFrame.Execute();
                    systemFrame.setClosedVisible();
                }
            }
//            User user = verify.getUserByAccount(account);//查询
//            if(user != null)//如果用户存在
//            {
//                //验证密码和输入的是否相等
//                if(user.getPassword().equals(password))//如果密码正确
//                {
//                    frame.dispose();//关闭当前窗口
//                    //frame.setVisible(false);//关闭当前窗口
//                    //new UserFrame();//打开相应界面
//                    if(rb1.isSelected())//如果rb1
//                    {
//                        new UserFrame();
//                    }
//                    if(rb2.isSelected())//如果rb2
//                    {
//                        new LibrarianFrame();
//                    }
//                    if(rb3.isSelected())//如果rb3
//                    {
//                        new SystemFrame();
//                    }
//                }
//                else//如果密码输入不正确
//                {
//                    JOptionPane.showMessageDialog(null,"密码错误","信息", JOptionPane.INFORMATION_MESSAGE);
//                }
//            }
//            else//如果用户不存在
//            {
//                JOptionPane.showMessageDialog(null, "用户不存在", "信息", JOptionPane.INFORMATION_MESSAGE);
//            }
        }
        if(e.getActionCommand().equals("register"))//点击注册按钮
        {
            JOptionPane.showMessageDialog(null, "暂无相关内容，敬请期待...", "信息", JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getActionCommand().equals("User"))//JRadioButton
        {
            JOptionPane.showMessageDialog(null, "你选择了用户登录", "信息", JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getActionCommand().equals("Librarian"))
        {
            JOptionPane.showMessageDialog(null, "你选择了图书管理员登录", "信息", JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getActionCommand().equals("SystemAdministrator"))
        {
            JOptionPane.showMessageDialog(null, "你选择了系统管理员登录", "信息", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
