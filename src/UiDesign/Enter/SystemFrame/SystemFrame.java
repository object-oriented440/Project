package UiDesign.Enter.SystemFrame;

import UiDesign.Enter.SystemFrame.Menu.MyMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemFrame extends JFrame implements ActionListener {
    JPanel panel;
    private void InitVariate()
    {
        this.setTitle("系统管理员界面");
        panel = new JPanel();
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
        MyMenu myMenu = new MyMenu();
        this.setJMenuBar(myMenu);//JFrame.setJMenuBar(JMenuBar)
    }
    private void creatContentPane()
    {

    }
    public SystemFrame()
    {
        InitVariate();//初始化变量
        setBounds();//设置JFrame的窗口位置和窗口大小
        creatMenu();//创建JMenu菜单
        creatContentPane();//创建内容窗格

        //
        setClosedVisible();

    }
    public static void main(String[] args) {
        SystemFrame systemFrame = new SystemFrame();
        systemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        systemFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
