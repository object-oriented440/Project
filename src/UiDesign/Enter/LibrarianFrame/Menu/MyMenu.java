package UiDesign.Enter.LibrarianFrame.Menu;

import UiDesign.AboutUs.AboutUsDialog;
import UiDesign.CustomComponent.Tools.SetIcons;

import javax.naming.InitialContext;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*依附于JMenuBar的JMenu*/
public class MyMenu extends JMenuBar implements ActionListener {
    private JFrame frame;
    private SetIcons setIcons;
    public void InitVariate()
    {
        frame = new JFrame();
        setIcons = new SetIcons();
    }
    public void getJFrame(JFrame frame)
    {
        this.frame = frame;
    }
    public JMenu creatMenu1()
    {
        JMenu menu = new JMenu("图书管理");
        JMenuItem item;
        item = new JMenuItem("图书添加");
        item.addActionListener(this);
        item.setActionCommand("bookAdd");
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("图书维护");
        item.addActionListener(this);
        item.setActionCommand("bookMaintain");
        menu.add(item);

        return menu;
    }
    public JMenu creatMenu2()
    {
        JMenu menu = new JMenu("图书类别管理");
        JMenuItem item;
        item = new JMenuItem("类别添加");
        item.addActionListener(this);
        item.setActionCommand("categoryAdd");
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("类别维护");
        item.addActionListener(this);
        item.setActionCommand("categoryMaintain");
        menu.add(item);

        return menu;
    }
    public JMenu creatMenuElse()
    {
        JMenu menu = new JMenu("其他");

        JMenuItem item;

        item = new JMenuItem("退出");
        item.addActionListener(this);
        item.setActionCommand("exit");
        //设置图标

        menu.add(item);

        menu.addSeparator();

        item = new JMenuItem("关于我们");
        item.addActionListener(this);
        item.setActionCommand("AboutUs");
        menu.add(item);

        return menu;
    }
    private void AddIntoJMenuBar()
    {
        this.add(creatMenu1());
        this.add(creatMenu2());
        this.add(creatMenuElse());
    }
    public MyMenu()
    {
        InitVariate();//初始化变量
        AddIntoJMenuBar();
    }
    public static void main(String[] args) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("bookAdd"))
        {

        }
        if(e.getActionCommand().equals("bookMaintain"))
        {

        }
        if(e.getActionCommand().equals("categoryAdd"))
        {

        }
        if(e.getActionCommand().equals("categoryMaintain"))
        {

        }
        if(e.getActionCommand().equals("exit"))
        {
            frame.dispose();
        }
        if(e.getActionCommand().equals("AboutUs"))
        {
            System.out.println("just a test");
            new AboutUsDialog();
            //System.out.println("just a test");
        }
    }

}
