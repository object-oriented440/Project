package UiDesign.Enter.LibrarianFrame;

import UiDesign.CustomComponent.ThreeFramePane.ContentPane;
import UiDesign.Enter.LibrarianFrame.Menu.*;
import UiDesign.Enter.Menu.Else;
import UiDesign.Login.LoginFrame;

import javax.naming.InitialContext;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibrarianFrame extends JFrame implements ActionListener {

    private JFrame previousFrame;
    private JPanel panel;
    private MyMenu myMenu;//
    //private ContentPane contentPane;
    //此时不允许 panel.add(contentPane)
    //同水平嵌套？

//    public void setVariate_previousFrame(JFrame jf)
//    {
//        this.previousFrame = jf;
//    }

    private void InitVariate()
    {
        this.setTitle("图书管理员界面");
        panel = new JPanel();
        //myMenu = new MyMenu();
        myMenu = new MyMenu(this,previousFrame);
        //myMenu.setVariate_previousFrame(previousFrame);

        //myMenu.InitVariate(this);
        //myMenu.AddIntoJMenuBar();
        //myMenu.Execute();
        //contentPane = new ContentPane();
    }

    private void setBounds()
    {
        this.setBounds(300,200,600,400);
    }
    private void setFrame()
    {
        setBounds();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/图书管理2.png"));
    }
    public void setClosedVisible()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    private void creatMenu()
    {
        this.setJMenuBar(myMenu);//JFrame.setJMenuBar(JMenuBar)


//        Else menuElse = new Else(this,previousFrame);
//        JMenuBar menuBar = new JMenuBar();
//        menuBar.add(menuElse);
//        this.setJMenuBar(menuBar);
    }
    private void creatContentPane()
    {
        ContentPane contentPane = new ContentPane("src/Images/图书管理.png");
        panel.add(contentPane);
        //panel.add(new ContentPane());
        this.add(panel);

        //panel.setVisible(false);
    }

    public void Execute()
    {
        //InitVariate();//初始化变量
        setFrame();
        creatMenu();//创建JMenu菜单
        creatContentPane();//创建内容窗格
    }

    public LibrarianFrame()
    {

    }
//    public LibrarianFrame(JFrame currentFrame,JFrame previousFrame)
//    {
//
//        this.previousFrame = currentFrame;
//        InitVariate();//变量初始化
//    }
    public LibrarianFrame(JFrame previousFrame)
    {
        //this
        //previousFrame = LoginFrame 没问题啊
        this.previousFrame = previousFrame;

        InitVariate();//变量初始化
    }


//    public static void main(String[] args) {
//        LibrarianFrame librarianFrame = new LibrarianFrame();
//        librarianFrame.Execute();
//        librarianFrame.setClosedVisible();
//    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
