package UiDesign.Enter.UserFrame.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu extends JMenuBar implements ActionListener {
    public JMenu creatMenu1()
    {
        JMenu menu = new JMenu("图书操作");
        JMenuItem item;
        item = new JMenuItem("借书");
        item.addActionListener(this);
        item.setActionCommand("borrow");
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("还书");
        item.addActionListener(this);
        item.setActionCommand("return");
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("预约");
        item.addActionListener(this);
        item.setActionCommand("order");
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
        if(e.getActionCommand().equals("borrow"))
        {

        }
        if(e.getActionCommand().equals("return"))
        {

        }
        if(e.getActionCommand().equals("order"))
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
