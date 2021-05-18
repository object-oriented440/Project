package UiDesign.Enter.UserFrame;

import UiDesign.Enter.UserFrame.Menu.MyMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserFrame extends JFrame implements ActionListener {

    MyMenu myMenu;
    JPanel panel;
    private void InitVariate()
    {
        this.setTitle("用户界面");
        panel = new JPanel();
        myMenu = new MyMenu(this);
    }
    private void setBounds()
    {
        this.setBounds(300,200,600,400);
    }
    private void setClosedVisible()
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

    }
    public UserFrame()
    {
        InitVariate();//初始化变量
        setBounds();//设置JFrame的窗口位置和窗口大小
        creatMenu();//创建JMenu菜单
        creatContentPane();//创建内容窗格
        setClosedVisible();

    }
    public static void main(String[] args) {
        UserFrame userFrame = new UserFrame();
//        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        userFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
