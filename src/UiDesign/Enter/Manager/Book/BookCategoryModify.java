package UiDesign.Enter.Manager.Book;

import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class BookCategoryModify extends JFrame implements ActionListener, FocusListener {

    private JFrame previousFrame;
    private SetIcons setIcons;
    private JPanel panel;

    private JLabel labelName1;
    private JLabel labelName2;
    private JLabel labelDesc;
    private JTextField fieldName1;
    private JTextField fieldName2;
    private JTextArea areaDesc;

    private JTable table;
    private DefaultTableModel tableModel;

    private JButton buttonQuery;
    private JButton buttonModify;
    private JButton buttonDelete;

    private JPanel areaPanel;

    private String stringDefault;

    private void initVariate()
    {
        setIcons = new SetIcons();
        panel = new JPanel();

        labelName1 = new JLabel("图书类别:");
        labelName2 = new JLabel("图书类别:");
        labelDesc = new JLabel("描述:");
        fieldName1 = new JTextField();
        fieldName1.setFont(new Font("微软雅黑",Font.BOLD,12));
        fieldName2 = new JTextField();
        fieldName2.setFont(new Font("微软雅黑",Font.BOLD,12));

        areaDesc = new JTextArea(5,16);
        areaDesc.setLineWrap(true);
        areaDesc.setWrapStyleWord(true);

        stringDefault = "请输入书籍的主要内容";
        areaDesc.setForeground(new Color(211, 211, 211));
        areaDesc.setFont(new Font("微软雅黑",Font.BOLD,16));
        areaDesc.setText(stringDefault);

        areaDesc.addFocusListener(this);

        JScrollPane scrollPane = new JScrollPane(areaDesc);
        areaPanel = new JPanel();
        areaPanel.add(scrollPane);

        buttonQuery = new JButton("查询");
        buttonQuery.addActionListener(this);
        buttonQuery.setActionCommand("query");

        buttonModify = new JButton("修改");
        buttonModify.addActionListener(this);
        buttonModify.setActionCommand("modify");

        buttonDelete = new JButton("删除");
        buttonDelete.addActionListener(this);
        buttonDelete.setActionCommand("delete");

    }
    private void setFrame()
    {
        this.setTitle("图书类别添加功能");
        this.setBounds(300,200,570,500);
        Image image = Toolkit.getDefaultToolkit().getImage("src/Images/图书管理2.png");
        this.setIconImage(image);
    }
    private void setMenu()
    {
        Else menuElse = new Else(this,previousFrame);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuElse);
        //this.setJMenuBar(new JMenuBar().add(menuElse));//报错
        this.setJMenuBar(menuBar);
    }
    private void setPane()
    {
        Box VBox = Box.createVerticalBox();

        Box hbt1 = Box.createHorizontalBox();

        Box tableHBox = Box.createHorizontalBox();

        Box hbt2 = Box.createHorizontalBox();
        Box hbt3 = Box.createHorizontalBox();
        Box hbt4 = Box.createHorizontalBox();

        int width=20,height=15;

        hbt1.add(labelName1);
        hbt1.add(Box.createHorizontalStrut(width));
        hbt1.add(fieldName1);
        hbt1.add(Box.createHorizontalStrut(2*width));
        hbt1.add(buttonQuery);
        hbt1.add(Box.createHorizontalStrut(width));

        VBox.add(Box.createVerticalStrut(height));
        VBox.add(hbt1);
        VBox.add(Box.createVerticalStrut(height));


        /******/
        //实例化一个滚动面板
        JScrollPane tableScrollPane = new JScrollPane();
        //将表格添加到滚动面板中
        tableScrollPane.setViewportView(this.creatTable());
        //设置预定义大小
        tableScrollPane.setPreferredSize(new Dimension(400,150));

        tableHBox.add(tableScrollPane);
        //tableHBox.add(Box.createHorizontalStrut(100));
        /******/

        VBox.add(tableHBox);
        VBox.add(Box.createVerticalStrut(height));

        hbt2.add(labelName2);
        hbt2.add(Box.createHorizontalStrut(2*width+1));
        hbt2.add(fieldName2);
        hbt2.add(Box.createHorizontalStrut(2*width+7));

        VBox.add(hbt2);
        VBox.add(Box.createVerticalStrut(height));

        hbt3.add(labelDesc);
        hbt3.add(Box.createHorizontalStrut(width+20));
        hbt3.add(areaPanel);
        hbt3.add(Box.createHorizontalStrut(width));

        VBox.add(hbt3);
        VBox.add(Box.createVerticalStrut(height));

        hbt4.add(buttonModify);
        hbt4.add(Box.createHorizontalStrut(2*width));
        hbt4.add(buttonDelete);
        hbt4.add(Box.createHorizontalStrut(width));

        VBox.add(hbt4);
        VBox.add(Box.createVerticalStrut(height));

        panel.add(VBox);
        this.add(panel);

    }
    private JTable creatTable()
    {
        String[] headers = {"图书类别名称","图书类别描述"};
        //实例化表格控件
        table = new JTable();
        //设置行高
        table.setRowHeight(16);
        //将表头和表格内容数据填充到表格数据模型中
        tableModel = new DefaultTableModel(null,headers);
        //为表格设置数据模型
        table.setModel(tableModel);

        return table;
    }
    public void Execute()
    {
        setFrame();
        setMenu();
        setPane();
    }
    public void setClosedVisible()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public BookCategoryModify(JFrame currentFrame,JFrame previousFrame)
    {
        this.previousFrame = currentFrame;
        initVariate();
    }
    public BookCategoryModify()
    {
        initVariate();
    }

    public static void main(String[] args) {
        BookCategoryModify bookCategoryModify = new BookCategoryModify();
        bookCategoryModify.Execute();
        bookCategoryModify.setClosedVisible();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("query"))
        {

        }/*end 查询*/
        if(e.getActionCommand().equals("modify"))
        {


        }/*end 修改*/
        if(e.getActionCommand().equals("delete"))
        {

        }/*end 删除*/
    }

    @Override
    public void focusGained(FocusEvent e) {
        JTextArea area = (JTextArea) e.getSource();
        if(area.getText().equals(stringDefault))
        {
            areaDesc.setForeground(Color.black);
            areaDesc.setFont(new Font("微软雅黑",Font.BOLD,16));
            areaDesc.setText("");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
