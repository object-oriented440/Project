package UiDesign.Enter.SystemFrame;

import UiDesign.CustomComponent.ThreeFramePane.ContentPane;
import UiDesign.Enter.SystemFrame.Menu.MyMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemFrame extends JFrame implements ActionListener {
    private JFrame previousFrame;
    private MyMenu myMenu;
    private JPanel panel;
    private void InitVariate()
    {
        this.setTitle("系统管理员界面");
        panel = new JPanel();
        myMenu = new MyMenu(this,previousFrame);
    }
    private void setBounds()
    {
        this.setBounds(300,200,600,400);
    }
    private void setFrame()
    {
        setBounds();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/系统管理员1.png"));
    }
    public void setClosedVisible()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    private void creatMenu()
    {
        this.setJMenuBar(myMenu);//JFrame.setJMenuBar(JMenuBar)
    }
    private void creatContentPane()
    {
        ContentPane contentPane = new ContentPane("src/Images/系统管理xxx.png");
        //ContentPane contentPane = new ContentPane();
        panel.add(contentPane);
        //panel.add(new ContentPane());
        this.add(panel);
    }
    public void Execute()
    {
        //setBounds();//设置JFrame的窗口位置和窗口大小
        setFrame();
        creatMenu();//创建JMenu菜单
        creatContentPane();//创建内容窗格
    }
    public SystemFrame(JFrame currentFrame)
    {
        this.previousFrame = currentFrame;
        InitVariate();//初始化变量
    }
    public static void main(String[] args) {
        //SystemFrame systemFrame = new SystemFrame();
//        systemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        systemFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
