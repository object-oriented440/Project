package UiDesign.Enter.Manager.Book;

import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class BookCategoryAdd extends JFrame implements ActionListener, FocusListener {

    private JFrame previousFrame;
    private JPanel panel;
    private SetIcons setIcons;

    private Box vBox;

    private JLabel labelName;
    private JLabel labelDescription;
    private JTextField fieldName;
    private JTextArea areaDescription;
    private String stringDefault;
    private JPanel areaPanel;

    private JButton buttonAdd;
    private JButton buttonReset;

    private void initVariate()
    {
        setIcons = new SetIcons();
        panel = new JPanel();

        labelName = new JLabel("图书类别：");
        labelDescription = new JLabel("图书类别描述：");
        fieldName = new JTextField(20);

        areaDescription = new JTextArea(5,20);
        areaDescription.addFocusListener(this);
        stringDefault = "请输入图书类别描述";
        areaDescription.setForeground(new Color(211, 211, 211));
        areaDescription.setFont(new Font("微软雅黑",Font.BOLD,16));
        areaDescription.setText(stringDefault);

        areaPanel = new JPanel();

        areaDescription.addFocusListener(this);


        areaDescription.setLineWrap(true);//激活自动换行功能  ！！！有这个功能
        areaDescription.setWrapStyleWord(true);//激活断行不断字功能

        //不太需要这个JScrollPane组件了
        JScrollPane scrollPane = new JScrollPane(areaDescription);

//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);//取消显示水平滚动条
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);//显示垂直滚动条

        areaPanel = new JPanel();
        areaPanel.add(scrollPane);

        buttonAdd = new JButton("添加");
        buttonAdd.addActionListener(this);
        buttonAdd.setActionCommand("add");
        setIcons.setJButtonIcon(buttonAdd,"src/Images/添加1.png",16,16);

        buttonReset = new JButton("重置");
        buttonReset.addActionListener(this);
        buttonReset.setActionCommand("reset");
        setIcons.setJButtonIcon(buttonReset,"src/Images/还原1.png",16,16);

    }
    private void setFrame()
    {
        this.setTitle("图书类别添加");
        this.setBounds(300,200,600,400);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/图书管理2.png"));

    }
    private void setMenu()
    {
        Else menuElse = new Else(this,previousFrame);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuElse);
        this.setJMenuBar(menuBar);
    }
    private void setContentPane()
    {
        vBox = Box.createVerticalBox();

        Box hTemp1 = Box.createHorizontalBox();
        Box hTemp2 = Box.createHorizontalBox();
        Box hTemp3 = Box.createHorizontalBox();

        int width = 0;
        int height = 0;

        width = 50;
        height = 60;

        vBox.add(Box.createVerticalStrut(30));

        hTemp1.add(labelName);
        hTemp1.add(Box.createHorizontalStrut(width));
        hTemp1.add(fieldName);
        //hTemp1.add(Box.createHorizontalStrut(width));

        vBox.add(hTemp1);
        vBox.add(Box.createVerticalStrut(height));

        hTemp2.add(labelDescription);
        hTemp2.add(Box.createHorizontalStrut(width));
        hTemp2.add(areaPanel);
        hTemp2.add(Box.createHorizontalStrut(width));

        //vBox.add(hTemp1);
        vBox.add(hTemp2);
        vBox.add(Box.createVerticalStrut(30));

        hTemp3.add(buttonAdd);
        hTemp3.add(Box.createHorizontalStrut(80));
        hTemp3.add(buttonReset);
        //hTemp3.add(Box.createHorizontalStrut(width));

        vBox.add(hTemp3);

        //this.add(vBox);
        panel.add(vBox);
        this.add(panel);
    }
    public void Execute()
    {
        setFrame();
        setMenu();
        setContentPane();
    }
    public void setClosedVisible()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public BookCategoryAdd(JFrame currentFrame,JFrame previousFrame)
    {
        this.previousFrame = currentFrame;
        initVariate();
    }
    public BookCategoryAdd()
    {
        initVariate();
    }
    public static void main(String[] args) {
        BookCategoryAdd bookCategoryAdd = new BookCategoryAdd();
        bookCategoryAdd.Execute();
        bookCategoryAdd.setClosedVisible();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void focusGained(FocusEvent e) {
        JTextArea area = (JTextArea) e.getSource();
        if(area.getText().equals(stringDefault))
        {
            areaDescription.setForeground(Color.black);
            areaDescription.setFont(new Font("微软雅黑",Font.BOLD,16));
            areaDescription.setText("");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
