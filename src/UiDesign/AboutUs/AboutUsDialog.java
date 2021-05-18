package UiDesign.AboutUs;

import UiDesign.CustomComponent.Tools.SetIcons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.AbstractList;

public class AboutUsDialog extends JDialog implements ActionListener, MouseListener {

    private String stringVersion = "版本1.0";
    private JLabel labelImage;
    private JLabel labelSystem;
    private JLabel labelVersion;
    private JLabel labelLink;
    private JPanel panel;
    private JButton closeButton;
    private SetIcons setIcons;
    private void InitVariate()
    {
        //System.out.println("InitVariate()");
        labelImage = new JLabel();
        labelSystem = new JLabel();
        labelVersion = new JLabel();
        labelLink = new JLabel();
        panel = new JPanel();//内容窗格
        closeButton = new JButton("关闭");
        setIcons = new SetIcons();
    }
    private void setDialog()
    {
        //System.out.println("setDialog()");
        this.setTitle("关于我们");
        this.setBounds(400,240, 600, 350);
    }
    private void creatContentPane()
    {
        //System.out.println("creatContentPane()");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();//

        //ImageIcon imageIcon;


        setIcons.setJLabelIcon(labelImage,"src/Images/书本.png",180,180);

        labelSystem.setText("图书管理系统");
        labelSystem.setFont(new Font("微软雅黑",Font.BOLD,50));
        setIcons.setJLabelIcon(labelSystem,"src/Images/学习.png",60,60);

        labelVersion.setText(stringVersion);
        labelVersion.setFont(new Font("微软雅黑",Font.BOLD,30));
        setIcons.setJLabelIcon(labelVersion,"src/Images/版本.png",40,40);

        labelLink.setText("<html><u>相关GitHub链接</u></html>");
        labelLink.setForeground(new Color(0, 149, 200));//设置小组件颜色？
        labelLink.setFont(new Font("微软雅黑",Font.BOLD,30));
        setIcons.setJLabelIcon(labelLink,"src/Images/链接.png",40,40);

        labelLink.addMouseListener(this);//为JLabel注册鼠标事件监听器


        closeButton.addActionListener(this);//为JButton注册事件监听器
        closeButton.setActionCommand("closeButton");


        p1.add(labelImage);

//        p2.setLayout(new GridLayout(3,1));
//        p2.add(labelSystem);
//        p2.add(labelVersion);
//        p2.add(labelLink);
//        //closeButton.setAlignmentX();
//        //p2.add(closeButton);
        Box boxTotal = Box.createVerticalBox();
        boxTotal.add(labelSystem);
        boxTotal.add(Box.createVerticalStrut(50));
        boxTotal.add(labelLink);
        boxTotal.add(Box.createVerticalStrut(50));
        boxTotal.add(labelVersion);
        boxTotal.add(Box.createVerticalStrut(50));

        p2.add(boxTotal);

        panel.add(p1,BorderLayout.WEST);
        panel.add(p2,BorderLayout.CENTER);
        this.add(panel);

    }
    private void setClosedVisible()
    {
        //System.out.println("setClosedVisible()");
        //this.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);//这行不能有
        this.setVisible(true);
    }
    public AboutUsDialog()
    {
        InitVariate();
        setDialog();//设置总体结构
        creatContentPane();//设置内容窗格

        this.setContentPane(panel);

        //this.setVisible(true);
        setClosedVisible();
    }

    public static void main(String[] args) {
        AboutUsDialog aboutUsDialog = new AboutUsDialog();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("closeButton"))
        {
            this.dispose();
        }
    }

    /*
    * 鼠标点击事件
    * */
    @Override
    public void mouseClicked(MouseEvent e) {
        /*
        * 通过电脑本地打开默认浏览器然后再打开URI所指向的位置
        * */
        Desktop desktop = Desktop.getDesktop();
        String str = "https://github.com/object-oriented440/Project";
        try {
            desktop.browse(new URI(str));
        } catch (URISyntaxException uriSyntaxException) {
            uriSyntaxException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    /*
    * 鼠标按下事件
    * */
    @Override
    public void mousePressed(MouseEvent e) {
        labelLink.setCursor(new Cursor(Cursor.HAND_CURSOR));//???
        labelLink.setForeground(new Color(0, 0, 0));
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
