package UiDesign.Enter.Menu;

import UiDesign.AboutUs.AboutUsDialog;
import UiDesign.CustomComponent.Tools.SetIcons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* 菜单"其他"
* */
public class Else extends JMenu implements ActionListener {
    //private JMenu menu;
    private SetIcons setIcons;
    private JFrame frame;//???
    //test
//    public void getJFrame(JFrame frame)
//    {
//        this.frame = frame;
//    }
    private void setJFrame(JFrame frame)
    {
        this.frame = frame;
    }
    private void InitVariate()
    {
        frame = new JFrame();
        //menu = new JMenu();
        setIcons = new SetIcons();
    }
    private void setElse()
    {
        //menu.setText("其他");
        this.setText("其他");

        JMenuItem item;

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
    public Else()
    {
        InitVariate();
        setElse();
    }
    public Else(JFrame frame)
    {
        InitVariate();
        setJFrame(frame);
        setElse();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("exit"))
        {
            //System.out.println("test:exit?");
            frame.dispose();
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
