package UiDesign.Enter.SystemFrame.Menu;

import UiDesign.AboutUs.AboutUsDialog;
import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu extends JMenuBar implements ActionListener {
    private JFrame frame;
    private SetIcons setIcons;
    private Else menuElse;//
    public void InitVariate(JFrame frame)
    {
        this.frame = new JFrame();

        setIcons = new SetIcons();
        menuElse = new Else(frame);
    }
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

    private void AddIntoJMenuBar()
    {
        this.add(creatMenu1());
        this.add(menuElse);
    }
    public MyMenu()
    {

    }
    public MyMenu(JFrame frame)
    {
        InitVariate(frame);
        AddIntoJMenuBar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("UserManager"))
        {

        }
        if(e.getActionCommand().equals("LibrarianManager"))
        {

        }
//        if(e.getActionCommand().equals("exit"))
//        {
//            frame.dispose();
//        }
//        if(e.getActionCommand().equals("AboutUs"))
//        {
//            new AboutUsDialog();
//        }
    }
}
