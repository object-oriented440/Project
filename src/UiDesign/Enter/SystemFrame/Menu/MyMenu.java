package UiDesign.Enter.SystemFrame.Menu;

import UiDesign.AboutUs.AboutUsDialog;
import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Manager.Book.BookCategoryAdd;
import UiDesign.Enter.Manager.System.librarianManager;
import UiDesign.Enter.Manager.System.totalManager;
import UiDesign.Enter.Manager.System.userManager;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu extends JMenuBar implements ActionListener {
    private JFrame currentFrame;
    private JFrame previousFrame;
    private SetIcons setIcons;
    //private Else menuElse;//
    public void InitVariate()
    {
        //this.frame = new JFrame();

        setIcons = new SetIcons();
        //menuElse = new Else(frame);
    }
    public JMenu creatMenu1()
    {
        JMenu menu = new JMenu("系统管理");
        JMenuItem item;
        item = new JMenuItem("总管理");
        setIcons.setJMenuItemIcon(item,"src/Images/维护2.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("TotalManager");
        menu.add(item);
        //menu.addSeparator();

        item = new JMenuItem("用户管理");
        setIcons.setJMenuItemIcon(item,"src/Images/我的2.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("UserManager");
        //menu.add(item);
        //menu.addSeparator();

        item = new JMenuItem("图书管理员管理");
        setIcons.setJMenuItemIcon(item,"src/Images/维护2.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("LibrarianManager");
        //menu.add(item);

        return menu;
    }

    private void AddIntoJMenuBar()
    {
        this.add(creatMenu1());

        Else menuElse = new Else(currentFrame,previousFrame);
        this.add(menuElse);
    }
    public MyMenu()
    {

    }
    public MyMenu(JFrame currentFrame,JFrame previousFrame)
    {
        this.currentFrame = currentFrame;
        this.previousFrame = previousFrame;
        InitVariate();
        AddIntoJMenuBar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("TotalManager"))
        {
            totalManager totalManager = new totalManager(currentFrame,previousFrame);
            totalManager.Execute();
            totalManager.setClosedVisible();
        }
        if(e.getActionCommand().equals("UserManager"))
        {
            //currentFrame.setVisible(false);
            userManager userManager = new userManager(currentFrame,previousFrame);
            userManager.Execute();
            userManager.setClosedVisible();
        }
        if(e.getActionCommand().equals("LibrarianManager"))
        {
            //currentFrame.setVisible(false);
            librarianManager librarianManager = new librarianManager(currentFrame,previousFrame);
            librarianManager.Execute();
            librarianManager.setClosedVisible();
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
