package UiDesign.Enter.UserFrame;

import UiDesign.CustomComponent.ThreeFramePane.ContentPane;
import UiDesign.Enter.UserFrame.Menu.MyMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserFrame extends JFrame implements ActionListener {

    private JFrame previousFrame;
    private MyMenu myMenu;
    private JPanel panel;
    private void InitVariate()
    {
        this.setTitle("用户界面");
        panel = new JPanel();
        myMenu = new MyMenu(this,previousFrame);
    }
    private void setBounds()
    {
        this.setBounds(300,200,600,400);
    }
    private void setFrame()
    {
        setBounds();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/用户.png"));
    }
    public void setClosedVisible()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    private void creatMenu()
    {
        this.setJMenuBar(myMenu);//JFrame.setJMenuBar(JMenuBar)
    }
    private void creatContentPane()
    {
        ContentPane contentPane = new ContentPane("src/Images/用户登录4.png");
        panel.add(contentPane);
        //panel.add(new ContentPane());
        this.add(panel);
    }
    public void Execute()
    {
        //setBounds();//设置JFrame的窗口位置和窗口大小
        setFrame();
        creatMenu();//创建JMenu菜单
        creatContentPane();//创建内容窗格
    }
    public UserFrame(JFrame currentFrame)
    {
        this.previousFrame = currentFrame;
        InitVariate();//初始化变量
    }
//    public UserFrame()
//    {
//        InitVariate();//初始化变量
//        //setBounds();//设置JFrame的窗口位置和窗口大小
//        setFrame();
//        creatMenu();//创建JMenu菜单
//        creatContentPane();//创建内容窗格
//        setClosedVisible();
//
//    }
    public static void main(String[] args) {
        //UserFrame userFrame = new UserFrame();
//        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        userFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
