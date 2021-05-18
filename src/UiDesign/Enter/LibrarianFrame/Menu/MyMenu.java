package UiDesign.Enter.LibrarianFrame.Menu;

import UiDesign.AboutUs.AboutUsDialog;
import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Menu.Else;

import javax.naming.InitialContext;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*依附于JMenuBar的JMenu*/
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
    private void AddIntoJMenuBar()
    {
        this.add(creatMenu1());
        this.add(creatMenu2());
        this.add(menuElse);//
    }
//    private void transmit()//不要这样传递参数!!!
//    {
//        menuElse.getJFrame(frame);
//    }
//    public MyMenu()
//    {
//        InitVariate();//初始化变量
//        //transmit();
//        //menuElse.getFrame(frame);
//        AddIntoJMenuBar();
//    }
    public MyMenu(JFrame frame)
    {
        InitVariate(frame);
        AddIntoJMenuBar();
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
    }

}
