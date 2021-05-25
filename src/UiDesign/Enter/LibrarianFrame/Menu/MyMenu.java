package UiDesign.Enter.LibrarianFrame.Menu;

import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Manager.Book.BookAdd;
import UiDesign.Enter.Manager.Book.BookCategoryAdd;
import UiDesign.Enter.Manager.Book.BookCategoryModify;
import UiDesign.Enter.Manager.Book.BookInformationModify;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*依附于JMenuBar的JMenu*/
public class MyMenu extends JMenuBar implements ActionListener {
    private JFrame currentFrame;
    private JFrame previousFrame;
    //private LibrarianFrame librarianFrame;
    private SetIcons setIcons;
    //private Else menuElse;//
//    public void setVariate_frame(JFrame jf)
//    {
//        this.frame = jf;
//    }
//    public void setVariate_previousFrame(JFrame jf)
//    {
//        this.previousFrame = jf;
//    }
//    public void transmit(JFrame previousFrame)
//    {
//        this.previousFrame = previousFrame;
//    }
//    private void InitVariate()
//    {
//        setIcons = new SetIcons();
//        menuElse = new Else(this.frame);
//    }
    private void InitVariate()
    {
        setIcons = new SetIcons();
    }
//    public void InitVariate(JFrame frame)
//    {
//        //this.frame = frame;//传入数据
//        setVariate_frame(frame);
//        //librarianFrame = (LibrarianFrame) frame;
//        setIcons = new SetIcons();
//        menuElse = new Else(this.frame,this.previousFrame);
//        //menuElse.setVariate_previousFrame(previousFrame);
//        //menuElse.InitVariate(this.frame);
//
//        //menuElse.transmit(previousFrame);
//
//        //menuElse = new Else(librarianFrame);
//    }
//    private void InitVariate(JFrame frame,JFrame previousFrame)
//    {
//        //this.frame = frame;//传入数据
//        setVariate_frame(frame);
//        //this.previousFrame = previousFrame;
//        setVariate_previousFrame(previousFrame);
//        //librarianFrame = (LibrarianFrame) frame;
//        setIcons = new SetIcons();
//        menuElse = new Else(this.frame,this.previousFrame);
//
//        //menuElse.transmit(previousFrame);
//
//        //menuElse = new Else(librarianFrame);
//    }
    public JMenu creatMenu1()
    {
        JMenu menu = new JMenu("图书管理");
        JMenuItem item;
        item = new JMenuItem("图书添加");
        setIcons.setJMenuItemIcon(item,"src/Images/添加1.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("bookAdd");
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("图书信息修改");
        setIcons.setJMenuItemIcon(item,"src/Images/维护2.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("bookInformationModify");
        menu.add(item);

        return menu;
    }
    public JMenu creatMenu2()
    {
        JMenu menu = new JMenu("图书类别管理");
        JMenuItem item;
        item = new JMenuItem("图书类别添加");
        setIcons.setJMenuItemIcon(item,"src/Images/添加1.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("categoryAdd");
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("图书类别维护");
        setIcons.setJMenuItemIcon(item,"src/Images/维护2.png",16,16);
        item.addActionListener(this);
        item.setActionCommand("categoryMaintain");
        menu.add(item);

        return menu;
    }
    public void AddIntoJMenuBar()
    {
        this.add(creatMenu1());
        this.add(creatMenu2());

        Else menuElse = new Else(currentFrame,previousFrame);
        //JMenuBar menuBar = new JMenuBar();
        //menuBar.add(menuElse);

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
//    public MyMenu(LibrarianFrame librarianFrame)
//    {
//        InitVariate(librarianFrame);
//        AddIntoJMenuBar();
//    }
//    public MyMenu()
//    {
//
//    }
    public void Execute()
    {

    }
    public MyMenu(JFrame currentFrame,JFrame previousFrame)
    {
        this.currentFrame = currentFrame;
        this.previousFrame = previousFrame;
        InitVariate();
        AddIntoJMenuBar();
    }
    public MyMenu(JFrame frame)
    {
//        InitVariate(frame);
//        AddIntoJMenuBar();
    }
//    public MyMenu(JFrame frame,JFrame previousFrame)
//    {
//        InitVariate(frame,previousFrame);
//        AddIntoJMenuBar();
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("bookAdd"))
        {
//            //向下转型
//            LibrarianFrame librarianFrame = (LibrarianFrame) frame;
//            JPanel panel = librarianFrame.getJPanel();//得到panel
//            panel.removeAll();
//            panel.add(new BookAdd());
            //直接新JFrame拉倒
            //currentFrame.dispose();
            //currentFrame.setVisible(false);
            BookAdd bookAdd = new BookAdd(currentFrame,previousFrame);//创建对象的时候，不要调用函数！！！太难了~~~
            //new BookAdd(frame);
            //bookAdd.setVariate_previousFrame(previousFrame);
            //bookAdd.setMenu();
            bookAdd.Execute();
            bookAdd.setClosedVisible();

        }
        if(e.getActionCommand().equals("bookInformationModify"))
        {
            //currentFrame.dispose();
            //currentFrame.setVisible(false);
            BookInformationModify bookInformationModify = new BookInformationModify(currentFrame,previousFrame);
            bookInformationModify.Execute();
            bookInformationModify.setClosedVisible();

        }
        if(e.getActionCommand().equals("categoryAdd"))
        {
            //currentFrame.dispose();
            //currentFrame.setVisible(false);
            //JOptionPane.showMessageDialog(null, "暂无相关内容，敬请期待...", "信息", JOptionPane.INFORMATION_MESSAGE);
            //currentFrame.setVisible(false);
            BookCategoryAdd bookCategoryAdd = new BookCategoryAdd(currentFrame,previousFrame);
            bookCategoryAdd.Execute();
            bookCategoryAdd.setClosedVisible();
        }
        if(e.getActionCommand().equals("categoryMaintain"))
        {
            //currentFrame.dispose();
            //currentFrame.setVisible(false);
            //JOptionPane.showMessageDialog(null, "暂无相关内容，敬请期待...", "信息", JOptionPane.INFORMATION_MESSAGE);
            //currentFrame.setVisible(false);
            BookCategoryModify bookCategoryModify = new BookCategoryModify(currentFrame,previousFrame);
            bookCategoryModify.Execute();
            bookCategoryModify.setClosedVisible();
        }
    }

}
