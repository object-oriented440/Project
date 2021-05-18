package UiDesign.Enter.UserFrame.Menu;

import UiDesign.AboutUs.AboutUsDialog;
import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import java.awt.*;
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
        if(e.getActionCommand().equals("borrow"))
        {

        }
        if(e.getActionCommand().equals("return"))
        {

        }
        if(e.getActionCommand().equals("order"))
        {

        }
    }
}
