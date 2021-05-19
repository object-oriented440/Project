package UiDesign.Enter.Menu;

import UiDesign.AboutUs.AboutUsDialog;
import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Login.LoginFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* 菜单"其他"
* */
public class Else extends JMenu implements ActionListener {
    //private JMenu menu;
    private SetIcons setIcons;
    private JFrame currentFrame;
    private JFrame previousFrame;
//    public void setVariate_previousFrame(JFrame jf)
//    {
//        this.previousFrame = jf;
//    }
//    public void transmit(JFrame previousFrame)
//    {
//        this.previousFrame = previousFrame;
//    }
    //test
//    public void getJFrame(JFrame frame)
//    {
//        this.frame = frame;
//    }
//    //private void setJFrame(JFrame frame)
//    {
//        this.frame = frame;
//    }
    private void InitVariate()
    {
        setIcons = new SetIcons();
    }
    private void setElse()
    {
        //menu.setText("其他");
        this.setText("其他");

        JMenuItem item;

        item = new JMenuItem("返回");
        item.addActionListener(this);
        item.setActionCommand("return");
        setIcons.setJMenuItemIcon(item,"src/Images/返回1.png",16,16);

        this.add(item);

        this.addSeparator();

        item = new JMenuItem("退出");
        item.addActionListener(this);
        item.setActionCommand("exit");
        //设置图标
        //setIcons.setJMenuItemIcon(item,"src/Images/exit.png");
        setIcons.setJMenuItemIcon(item,"src/Images/退出.png",16,16);

        //menu.add(item);
        this.add(item);

        //menu.addSeparator();
        this.addSeparator();

        item = new JMenuItem("关于我们");
        item.addActionListener(this);
        item.setActionCommand("AboutUs");
        //设置图标
        setIcons.setJMenuItemIcon(item,"src/Images/关于.png",16,16);

        //menu.add(item);
        this.add(item);
    }
    public Else(JFrame frame)
    {
        this.currentFrame = frame;
        InitVariate();
        setElse();
    }
    public Else(JFrame currentFrame,JFrame previousFrame)
    {
        this.currentFrame = currentFrame;
        this.previousFrame = previousFrame;
        InitVariate();
        setElse();
    }
//    public Else(JFrame frame,JFrame previousFrame)
//    {
//        InitVariate();
//        setJFrame(frame);
//        this.previousFrame = previousFrame;
//        setElse();
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("return"))
        {
            //currentFrame.dispose();
            currentFrame.setVisible(false);

            //new LoginFrame();//是否正确？

//            previousFrame.setTitle("这怎么就是新JFrame了？！");
//            previousFrame.setSize(300,200);
            previousFrame.setVisible(true);
            //点击返回返回上一个界面

        }
        if(e.getActionCommand().equals("exit"))
        {
            //System.out.println("test:exit?");
            //currentFrame.dispose();
            currentFrame.setVisible(false);
            //frame.setVisible(true);
        }
        if(e.getActionCommand().equals("AboutUs"))
        {
            //System.out.println("just a test");
            new AboutUsDialog();
            //System.out.println("just a test");
        }
    }

//    public static void main(String[] args) {
//
//    }
}
