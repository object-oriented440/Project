package UiDesign.CustomComponent.Panes;

import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Dao.BookDao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class BookModifyPane extends JPanel implements ActionListener, MouseListener, FocusListener {

    private SetIcons setIcons;

    private Box VBox;
    private Box CheckHBox;
    private Box tableHBox;
    private Box modifyVBox;
    private Box buttonHBox;

    private JLabel labelBookName;
    private JLabel labelBookAuthor;
    private JLabel labelBookPress;
    private JLabel labelBookCallNumber1;
    private JLabel labelBookCallNumber2;

    private JButton buttonQuery;
    private JButton buttonReset;

    private JTextField fieldBookName;
    private JTextField fieldBookAuthor;
    private JTextField fieldBookPress;
    private JTextField fieldBookCallNumber1;
    private JTextField fieldBookCallNumber2;

    private JPanel areaPanel;
    //private JTextArea areaBookIntroduce;

    private JLabel labelBookCategory;
    private JComboBox comboBoxBookCategory;

    private String stringDefault;

    private JScrollPane tableScrollPane;
    private String sql;

    private JTable table;
    private DefaultTableModel tableModel;

    private JLabel labelBookIntroduce;
    private JTextArea areaBookIntroduce;

    private JButton buttonModify;
    private JButton buttonDelete;
    private JButton buttonReset2;

    private void InitVariate()
    {
        setIcons = new SetIcons();
        VBox = Box.createVerticalBox();
        CheckHBox = Box.createHorizontalBox();
        tableHBox = Box.createHorizontalBox();
        labelBookCallNumber1 = new JLabel("图书索引号：");
        fieldBookCallNumber1 = new JTextField(10);
        fieldBookCallNumber1.setFont(new Font("微软雅黑",Font.BOLD,12));
        fieldBookCallNumber1.requestFocusInWindow();

        labelBookCallNumber2 = new JLabel("图书索引号：");
        fieldBookCallNumber2 = new JTextField(10);
        fieldBookCallNumber2.setFont(new Font("微软雅黑",Font.BOLD,12));

        buttonQuery = new JButton("查询");
        buttonQuery.addActionListener(this);
        buttonQuery.setActionCommand("query");
        setIcons.setJButtonIcon(buttonQuery,"src/Images/查询4.png",16,16);

        buttonReset = new JButton("重置");
        buttonReset.addActionListener(this);
        buttonReset.setActionCommand("reset 1");
        setIcons.setJButtonIcon(buttonReset,"src/Images/还原1.png",16,16);

//        /******/
//        //实例化一个滚动面板
//        tableScrollPane = new JScrollPane();
//        //将表格添加到滚动面板中
////        sql = "select bId,bBookName,bAuthor,bSex,bPrice,bBookDescription,"
////        +"btName from tb_book,tb_booktype where tb_book.btId=tb_booktype.btId;";
////        tableScrollPane.setViewportView(this.creatTable(sql));
//        tableScrollPane.setViewportView(this.creatTable());
//        //设置预定义大小
//        tableScrollPane.setPreferredSize(new Dimension(700,250));
//        tableHBox.add(tableScrollPane);

        modifyVBox = Box.createVerticalBox();

        labelBookIntroduce = new JLabel("书籍介绍：");
        areaBookIntroduce = new JTextArea(5,20);

        stringDefault = "请输入书籍的主要内容";
        areaBookIntroduce.setForeground(new Color(211, 211, 211));
        areaBookIntroduce.setFont(new Font("微软雅黑",Font.BOLD,16));
        areaBookIntroduce.setText(stringDefault);

        areaBookIntroduce.addFocusListener(this);


        areaBookIntroduce.setLineWrap(true);//激活自动换行功能  ！！！有这个功能
        areaBookIntroduce.setWrapStyleWord(true);//激活断行不断字功能

        //不太需要这个JScrollPane组件了
        JScrollPane scrollPane = new JScrollPane(areaBookIntroduce);

//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);//取消显示水平滚动条
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);//显示垂直滚动条

        areaPanel = new JPanel();
        areaPanel.add(scrollPane);

        buttonHBox = Box.createHorizontalBox();

        buttonModify = new JButton("修改");
        buttonModify.addActionListener(this);
        buttonModify.setActionCommand("modify");
        setIcons.setJButtonIcon(buttonModify,"src/Images/维护2.png",16,16);

        buttonDelete = new JButton("删除");
        buttonDelete.addActionListener(this);
        buttonDelete.setActionCommand("delete");
        setIcons.setJButtonIcon(buttonDelete,"src/Images/删除1.png",16,16);

        buttonReset2 = new JButton("重置");
        buttonReset2.addActionListener(this);
        buttonReset2.setActionCommand("reset 2");
        setIcons.setJButtonIcon(buttonReset2,"src/Images/还原1.png",16,16);

        labelBookName = new JLabel("书名：");
        labelBookAuthor = new JLabel("作者：");
        labelBookPress = new JLabel("出版社：");
        //labelBookCallNumber = new JLabel("索书号：");
        labelBookCategory = new JLabel("图书类别：");

        fieldBookName = new JTextField(10);
        fieldBookName.setFont(new Font("微软雅黑",Font.BOLD,12));
        fieldBookAuthor = new JTextField(10);
        fieldBookAuthor.setFont(new Font("微软雅黑",Font.BOLD,12));
        fieldBookPress = new JTextField(10);
        fieldBookPress.setFont(new Font("微软雅黑",Font.BOLD,12));
        //fieldBookCallNumber = new JTextField(10);

        comboBoxBookCategory = new JComboBox();
        comboBoxBookCategory.addItem("--请选择--");
        comboBoxBookCategory.addItem("玄幻类");
        comboBoxBookCategory.addItem("文学类");

        comboBoxBookCategory.setSelectedIndex(0);


    }
    private JTable creatTable() //??????
    {
        //表头
        String[] headers = {"索书号","书籍名称","书籍作者","书籍出版社","书籍类别"};
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
    private JTable creatTable(String sql)
    {
        // 获取所有的图书记录并将结果转换成一个二维数组
        String[][] rowdatas = new BookDao().ListToArray(new BookDao().getRecordsDataBySql(sql));
        // 表头
        String[] headers = {"编号", "图书名称", "图书作者", "作者性别", "图书价格", "图书描述", "图书类别"};
        // 实例化表格控件
        table = new JTable();
        // 设置行高
        table.setRowHeight(30);
        // 将表头和表格内容数据填充到表格数据模型中
        tableModel = new DefaultTableModel(rowdatas, headers);
        //为表格设置数据模型
        table.setModel(tableModel);
        // 返回填充完成的表格控件
        return table;
    }
    private void setPane()
    {
        int width = 0;
        int height = 0;

        width = 20;
        CheckHBox.add(labelBookCallNumber1);
        CheckHBox.add(Box.createHorizontalStrut(width));

        CheckHBox.add(fieldBookCallNumber1);
        CheckHBox.add(Box.createHorizontalStrut(100));

        CheckHBox.add(buttonQuery);
        CheckHBox.add(Box.createHorizontalStrut(30));

        CheckHBox.add(buttonReset);
        CheckHBox.add(Box.createHorizontalStrut(50));

        height = 15;
        VBox.add(CheckHBox);
        VBox.add(Box.createVerticalStrut(height));

        /******/
        //实例化一个滚动面板
        tableScrollPane = new JScrollPane();
        //将表格添加到滚动面板中
//        sql = "select bId,bBookName,bAuthor,bSex,bPrice,bBookDescription,"
//        +"btName from tb_book,tb_booktype where tb_book.btId=tb_booktype.btId;";
//        tableScrollPane.setViewportView(this.creatTable(sql));
        tableScrollPane.setViewportView(this.creatTable());
        //设置预定义大小
        tableScrollPane.setPreferredSize(new Dimension(700,250));

        tableHBox.add(tableScrollPane);

        VBox.add(tableHBox);
        VBox.add(Box.createVerticalStrut(height));


        Box hBoxTemp1 = Box.createHorizontalBox();
        Box hBoxTemp2 = Box.createHorizontalBox();
        Box hBoxTemp3 = Box.createHorizontalBox();
        Box hBoxTemp4 = Box.createHorizontalBox();

        hBoxTemp1.add(labelBookName);
        hBoxTemp1.add(Box.createHorizontalStrut(width));
        hBoxTemp1.add(fieldBookName);
        hBoxTemp1.add(Box.createHorizontalStrut(width));
        hBoxTemp1.add(labelBookAuthor);
        hBoxTemp1.add(Box.createHorizontalStrut(width));
        hBoxTemp1.add(fieldBookAuthor);

        hBoxTemp2.add(labelBookPress);
        hBoxTemp2.add(Box.createHorizontalStrut(width));
        hBoxTemp2.add(fieldBookPress);
        hBoxTemp2.add(Box.createHorizontalStrut(width));
        hBoxTemp2.add(labelBookCallNumber2);
        hBoxTemp2.add(Box.createHorizontalStrut(width));
        hBoxTemp2.add(fieldBookCallNumber2);

        hBoxTemp3.add(labelBookCategory);
        hBoxTemp3.add(Box.createHorizontalStrut(width));
        hBoxTemp3.add(comboBoxBookCategory);
        hBoxTemp3.add(Box.createHorizontalStrut(width));

        hBoxTemp4.add(labelBookIntroduce);
        hBoxTemp4.add(Box.createHorizontalStrut(width));
        //areaBookIntroduce.addFocusListener(this);
        hBoxTemp4.add(areaPanel);
        hBoxTemp4.add(Box.createHorizontalStrut(width));




        modifyVBox.add(hBoxTemp1);
        modifyVBox.add(Box.createVerticalStrut(height));
        modifyVBox.add(hBoxTemp2);
        modifyVBox.add(Box.createVerticalStrut(height));
        modifyVBox.add(hBoxTemp3);
        modifyVBox.add(Box.createVerticalStrut(height));
        modifyVBox.add(hBoxTemp4);
        modifyVBox.add(Box.createVerticalStrut(height));

        VBox.add(modifyVBox);
        VBox.add(Box.createVerticalStrut(height));

        buttonHBox.add(buttonModify);
        buttonHBox.add(Box.createHorizontalStrut(60));
        buttonHBox.add(buttonDelete);
        buttonHBox.add(Box.createHorizontalStrut(60));
        buttonHBox.add(buttonReset2);
        //buttonHBox.add(Box.createHorizontalStrut(width));

        VBox.add(buttonHBox);
        VBox.add(Box.createVerticalStrut(height));

        this.add(VBox);
    }
    public BookModifyPane()
    {
        InitVariate();
        setPane();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("query"))
        {

        }
        if(e.getActionCommand().equals("reset 1"))
        {
            fieldBookCallNumber1.setText("");
            fieldBookCallNumber1.requestFocusInWindow();
        }
        if(e.getActionCommand().equals("modify"))
        {

        }
        if(e.getActionCommand().equals("delete"))
        {

        }
        if(e.getActionCommand().equals("reset 2"))
        {
            fieldBookName.setText("");
            fieldBookAuthor.setText("");
            fieldBookPress.setText("");
            fieldBookCallNumber2.setText("");

            comboBoxBookCategory.setSelectedIndex(0);

            stringDefault = "请输入书籍的主要内容";
            areaBookIntroduce.setForeground(new Color(211, 211, 211));
            areaBookIntroduce.setFont(new Font("微软雅黑",Font.BOLD,16));
            areaBookIntroduce.setText(stringDefault);

            fieldBookName.requestFocusInWindow();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

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

    @Override
    public void focusGained(FocusEvent e) {
        JTextArea area = (JTextArea) e.getSource();
        if(area.getText().equals(stringDefault))
        {
            areaBookIntroduce.setForeground(Color.black);
            areaBookIntroduce.setFont(new Font("微软雅黑",Font.BOLD,16));
            areaBookIntroduce.setText("");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
