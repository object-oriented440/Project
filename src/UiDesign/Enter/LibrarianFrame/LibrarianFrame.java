package UiDesign.Enter.LibrarianFrame;

import UiDesign.Enter.LibrarianFrame.Menu.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibrarianFrame extends JFrame implements ActionListener {

    JPanel panel;
    MyMenu myMenu;//
    private void InitVariate()
    {
        this.setTitle("图书管理员界面");
        panel = new JPanel();
        //myMenu = new MyMenu();
        myMenu = new MyMenu(this);
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
        //menuJMenuBar.setBackground(new Color(240,255,255));
        //this.add(myJMenu.creatMenu1());//,BorderLayout.NORTH);
        this.setJMenuBar(myMenu);//JFrame.setJMenuBar(JMenuBar)
    }
    private void creatContentPane()
    {

    }
//    private void transmit()
//    {
//        myMenu.getJFrame(this);
//    }
    public LibrarianFrame()
    {
        InitVariate();//初始化变量
        //transmit();//传递参数
        setBounds();//设置JFrame的窗口位置和窗口大小
        creatMenu();//创建JMenu菜单
        creatContentPane();//创建内容窗格

        //
        setClosedVisible();

    }

    public static void main(String[] args) {
        LibrarianFrame librarianFrame = new LibrarianFrame();
//        librarianFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        librarianFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
