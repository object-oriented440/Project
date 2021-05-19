package UiDesign.Enter.Manager.Book;

import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookAdd extends JFrame implements ActionListener {

    private JFrame frame;
    private JFrame previousFrame;
    private JPanel panel;
    private SetIcons setIcons;
    private JButton returnButton;
    private JLabel labelName,labelAuthor;
    private JTextField fieldBookName,fieldBookAuthor;
    private JLabel labelSex;
    private JRadioButton rb1,rb2;
    private ButtonGroup group;
    private JLabel labelPrice;
    private JTextField fieldBookPrice;
    private JLabel labelCategory;
    private JComboBox comboBookCategory;
    private JLabel labelDescription;
    private JTextArea areaBookDescription;
    private JButton buttonAdd,buttonReset;

//    public void setVariate_previousFrame(JFrame jf)
//    {
//        this.previousFrame = jf;
//    }
    private void InitVariate()
    {
        //this.frame = frame;

        panel = new JPanel();

        setIcons = new SetIcons();

        returnButton = new JButton("返回");
        returnButton.addActionListener(this);
        returnButton.setActionCommand("returnButton");

        labelName = new JLabel("书名：");
        fieldBookName = new JTextField(10);

        labelAuthor = new JLabel("作者：");
        fieldBookAuthor = new JTextField(10);

        labelSex = new JLabel("作者性别：");
        rb1 = new JRadioButton("男");
        rb2 = new JRadioButton("女");
        rb1.addActionListener(this);
        rb1.setActionCommand("rb1");
        rb2.addActionListener(this);
        rb2.setActionCommand("rb2");
        group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);

        labelPrice = new JLabel("书籍价格：");
        fieldBookPrice = new JTextField(5);

        labelCategory = new JLabel("书籍类别：");
        comboBookCategory = new JComboBox();

        labelDescription = new JLabel("书籍描述：");
        areaBookDescription = new JTextArea(10,40);

        buttonAdd = new JButton("添加");
        buttonAdd.addActionListener(this);
        buttonAdd.setActionCommand("add");
        setIcons.setJButtonIcon(buttonAdd,"src/Images/.png",16,16);

        buttonReset = new JButton("重置");
        buttonReset.addActionListener(this);
        buttonReset.setActionCommand("reset");
        setIcons.setJButtonIcon(buttonAdd,"src/Images/.png",16,16);

    }
    private void setBounds()
    {
        this.setBounds(300,200,600,400);
    }
    private void setFrame()
    {
        this.setTitle("图书添加功能");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/图书地址添加.png"));
        setBounds();
    }
    public void setMenu()
    {
        Else menuElse = new Else(this,previousFrame);
        //menuElse.setVariate_previousFrame(previousFrame);
        //menuElse.InitVariate(frame);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuElse);
        this.setJMenuBar(menuBar);
    }
    private void setContentPane()
    {
        //内容窗格
//        JLabel labelImage = new JLabel();
//        labelImage.setIcon(new ImageIcon("src/Images/星轨.png"));
        //panel.add(returnButton);
        //this.add(panel);
        JPanel p1,p2,p3,p4,p5,p6,p7;
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();

        p1.add(labelName);
        p1.add(fieldBookName);
        //p1.add(JPanel.creat);
        p2.add(labelAuthor);
        p2.add(fieldBookAuthor);
        p3.add(labelSex);
        //p3.add(group);
        p3.add(rb1);
        p3.add(rb2);
        p4.add(labelPrice);
        p4.add(fieldBookPrice);
        p5.add(labelCategory);
        p5.add(comboBookCategory);
        p6.add(labelDescription);
        //p6.add(areaBookDescription);
        p7.add(buttonAdd);
        p7.add(buttonReset);



        panel.setLayout(new GridLayout(7,1));

        panel.add(p1);
        panel.add(p2);
        panel.add(p3);
        panel.add(p4);
        panel.add(p5);
        panel.add(p6);
        panel.add(p7);

        this.add(panel);


    }
    public void setClosedVisible()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void Execute()
    {
        setFrame();
        setMenu();
        setContentPane();
        //setClosedVisible();
    }
    public BookAdd(JFrame currentFrame,JFrame previousFrame)
    {
        this.previousFrame = currentFrame;
        InitVariate();
    }
    public static void main(String[] args) {
        //BookAdd bookAdd = new BookAdd();
        //由于有元素与前JFrame联系,因此不再单独运行
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        String message = "default";
//        String title = "Default";
//        final int messageType = JOptionPane.INFORMATION_MESSAGE;
//        if(e.getActionCommand().equals("returnButton"))
//        {
////            message = "返回上一个Frame";
////            title = "信息";
////            JOptionPane.showMessageDialog(null,message,title,messageType);
//            this.dispose();
//            frame.setVisible(true);
//
//        }
        if(e.getActionCommand().equals("add"))
        {

        }
        if(e.getActionCommand().equals("reset"))
        {

        }
    }
}
