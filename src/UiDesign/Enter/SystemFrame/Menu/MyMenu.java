package UiDesign.Enter.SystemFrame.Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu extends JMenuBar implements ActionListener {
    public JMenu creatMenu1()
    {
        JMenu menu = new JMenu("管理");
        JMenuItem item;
        item = new JMenuItem("用户管理");
        item.addActionListener(this);
        item.setActionCommand("UserManager");
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("图书管理员管理");
        item.addActionListener(this);
        item.setActionCommand("LibrarianManager");
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
        this.add(creatMenuElse());
    }
    public MyMenu()
    {
        AddIntoJMenuBar();
    }
    public static void main(String[] args) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("UserManager"))
        {

        }
        if(e.getActionCommand().equals("LibrarianManager"))
        {

        }
        if(e.getActionCommand().equals("exit"))
        {

        }
        if(e.getActionCommand().equals("AboutUs"))
        {

        }
    }
}
