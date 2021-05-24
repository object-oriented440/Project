package UiDesign.Enter.UserFrame.Menu;

import UiDesign.AboutUs.AboutUsDialog;
import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Manager.Book.BookCategoryAdd;
import UiDesign.Enter.Manager.User.*;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu extends JMenuBar implements ActionListener {
    private JFrame currentFrame;
    private JFrame previousFrame;
    private SetIcons setIcons;
    //private Else menuElse;//
    public void InitVariate()
    {
        setIcons = new SetIcons();
        //menuElse = new Else(frame);
    }
    public JMenu creatMenu1()
    {
        JMenu menu = new JMenu("图书操作");
        JMenuItem item;
        item = new JMenuItem("借书");
        setIcons.setJMenuItemIcon(item,"src/Images/借入.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("borrow");
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("还书");
        setIcons.setJMenuItemIcon(item,"src/Images/还原1.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("return");
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("预约");
        setIcons.setJMenuItemIcon(item,"src/Images/预约2.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("order");
        menu.add(item);
        return menu;
    }
    public JMenu creatMenu2()
    {
        JMenu menu = new JMenu("信息查询");
        JMenuItem item;
        item = new JMenuItem("借阅信息");
        setIcons.setJMenuItemIcon(item,"src/Images/搜索.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("Library information");//借阅信息
        menu.add(item);
        //menu.addSeparator();

        return menu;
    }
    public JMenu creatMenu3()
    {
        JMenu menu = new JMenu("信息添加");
        JMenuItem item;
        item = new JMenuItem("个人信息");
        setIcons.setJMenuItemIcon(item,"src/Images/用户管理2.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("Personal information");//个人信息
        menu.add(item);
        //menu.addSeparator();

        return menu;
    }
    private void AddIntoJMenuBar()
    {
        this.add(creatMenu3());
        this.add(creatMenu2());
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
//    public MyMenu(JFrame frame)
//    {
//        InitVariate(frame);
//        AddIntoJMenuBar();
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("borrow"))
        {
            //currentFrame.setVisible(false);
            BorrowBook borrowBook = new BorrowBook(currentFrame,previousFrame);
            borrowBook.Execute();
            borrowBook.setClosedVisible();
        }
        if(e.getActionCommand().equals("return"))
        {
            //currentFrame.setVisible(false);
            ReturnBook returnBook = new ReturnBook(currentFrame,previousFrame);
            returnBook.Execute();
            returnBook.setClosedVisible();
        }
        if(e.getActionCommand().equals("order"))
        {
            //currentFrame.setVisible(false);
            ReserveBook reserveBook = new ReserveBook(currentFrame,previousFrame);
            reserveBook.Execute();
            reserveBook.setClosedVisible();
        }
        if(e.getActionCommand().equals("Library information"))
        {
            //currentFrame.setVisible(false);
            LibraryInformation libraryInformation = new LibraryInformation(currentFrame,previousFrame);
            libraryInformation.Execute();
            libraryInformation.setClosedVisible();
        }
        if(e.getActionCommand().equals("Personal information"))
        {
            //currentFrame.setVisible(false);
            PersonalInformation personalInformation = new PersonalInformation(currentFrame,previousFrame);
            personalInformation.Execute();
            personalInformation.setClosedVisible();
        }
    }
}
