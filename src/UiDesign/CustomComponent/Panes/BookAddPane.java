package UiDesign.CustomComponent.Panes;

import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Manager.Book.FileSelector.FileSelector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class BookAddPane extends JPanel implements ActionListener, FocusListener {

    private Box HBox;
    private Box leftVBox;
    private Box rightVBox;
    private FileSelector fileSelector;

    private SetIcons setIcons;

    private JLabel labelBookName;
    private JLabel labelBookAuthor;
    private JLabel labelBookPress;
    private JLabel labelBookCallNumber;

    private JButton buttonAdd;
    private JButton buttonReset;

    private JTextField fieldBookName;
    private JTextField fieldBookAuthor;
    private JTextField fieldBookPress;
    private JTextField fieldBookCallNumber;

    private JPanel areaPanel;
    private JTextArea areaBookIntroduce;

    private JLabel labelBookCategory;
    private JComboBox comboBoxBookCategory;

    private String stringDefault;


    private void InitVariate()
    {
        HBox =Box.createHorizontalBox();
        leftVBox = Box.createVerticalBox();
        rightVBox = Box.createVerticalBox();
        fileSelector = new FileSelector();

        setIcons = new SetIcons();

        labelBookName = new JLabel("书名：");
        labelBookAuthor = new JLabel("作者：");
        labelBookPress = new JLabel("出版社：");
        labelBookCallNumber = new JLabel("索书号：");

        buttonAdd = new JButton("添加");
        buttonAdd.addActionListener(this);
        buttonAdd.setActionCommand("add");
        setIcons.setJButtonIcon(buttonAdd,"src/Images/添加1.png",16,16);

        buttonReset = new JButton("重置");
        buttonReset.addActionListener(this);
        buttonReset.setActionCommand("reset");
        setIcons.setJButtonIcon(buttonReset,"src/Images/还原1.png",16,16);

        Dimension dimension = new Dimension(50, 10);

        fieldBookName = new JTextField(10);
        fieldBookName.setText("平凡的世界");
        //fieldBookName.setPreferredSize(dimension);

        fieldBookAuthor = new JTextField(10);
        fieldBookAuthor.setText("路瑶");
        //fieldBookAuthor.setPreferredSize(dimension);

        fieldBookPress = new JTextField(10);
        fieldBookPress.setText("北京十月文艺出版社");
        //fieldBookPress.setPreferredSize(dimension);

        fieldBookCallNumber = new JTextField(10);
        fieldBookCallNumber.setText("PFDSJ");
        //fieldBookCallNumber.setPreferredSize(dimension);


        areaPanel = new JPanel();
        areaBookIntroduce = new JTextArea(10,20);

        //areaBookIntroduce.setSelectedTextColor(Color.red);//设置文本颜色
        //areaBookIntroduce.setForeground(Color.red);

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

        areaPanel.add(scrollPane);

        labelBookCategory = new JLabel("图书类别：");
        comboBoxBookCategory = new JComboBox();

        comboBoxBookCategory.addItem("--请选择--");
        comboBoxBookCategory.addItem("玄幻类");
        comboBoxBookCategory.addItem("文学类");

        comboBoxBookCategory.setSelectedIndex(2);


    }
    private void setPane()
    {
        //for leftVBox
        leftVBox.add(fileSelector);

        //for rightVBox
        Box hBoxTemp1 = Box.createHorizontalBox();
        Box hBoxTemp2 = Box.createHorizontalBox();
        Box hBoxTemp3 = Box.createHorizontalBox();
        Box hBoxTemp4 = Box.createHorizontalBox();
        Box hBoxTemp5 = Box.createHorizontalBox();
        Box hBoxTemp6 = Box.createHorizontalBox();

        Box hBoxTemp7 = Box.createHorizontalBox();

        int width = 0;
        int height = 0;

        width = 10;
        hBoxTemp1.add(labelBookName);
        hBoxTemp1.add(Box.createHorizontalStrut(23));
        hBoxTemp1.add(fieldBookName);

        hBoxTemp2.add(labelBookAuthor);
        hBoxTemp2.add(Box.createHorizontalStrut(23));
        hBoxTemp2.add(fieldBookAuthor);

        hBoxTemp3.add(labelBookPress);
        hBoxTemp3.add(Box.createHorizontalStrut(width));
        hBoxTemp3.add(fieldBookPress);

        hBoxTemp4.add(labelBookCallNumber);
        hBoxTemp4.add(Box.createHorizontalStrut(width));
        hBoxTemp4.add(fieldBookCallNumber);

        //hBoxTemp5.add(areaBookIntroduce);
        hBoxTemp5.add(areaPanel);

        hBoxTemp6.add(buttonAdd);
        hBoxTemp6.add(Box.createHorizontalStrut(width));
        hBoxTemp6.add(buttonReset);

        hBoxTemp7.add(labelBookCategory);
        hBoxTemp7.add(Box.createHorizontalStrut(width));
        hBoxTemp7.add(comboBoxBookCategory);

        height = 20;

        rightVBox.add(hBoxTemp1);
        rightVBox.add(Box.createVerticalStrut(height));

        rightVBox.add(hBoxTemp2);
        rightVBox.add(Box.createVerticalStrut(height));

        rightVBox.add(hBoxTemp3);
        rightVBox.add(Box.createVerticalStrut(height));

        rightVBox.add(hBoxTemp4);
        rightVBox.add(Box.createVerticalStrut(height));

        rightVBox.add(hBoxTemp7);
        rightVBox.add(Box.createVerticalStrut(height));

        rightVBox.add(hBoxTemp5);
        rightVBox.add(Box.createVerticalStrut(height));

        rightVBox.add(hBoxTemp6);
        rightVBox.add(Box.createVerticalStrut(height));


        //for HBox
        width = 60;
        HBox.add(leftVBox);
        HBox.add(Box.createHorizontalStrut(width));
        HBox.add(rightVBox);

        this.add(HBox);
    }
    public BookAddPane()
    {
        InitVariate();
        setPane();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("add"))
        {

        }
        if(e.getActionCommand().equals("reset"))
        {

        }
    }


    /**
     * 组件获得焦点时
     * */
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

    /**
     * 组件失去焦点时
     * */
    @Override
    public void focusLost(FocusEvent e) {
//        areaBookIntroduce.setForeground(new Color(211, 211, 211));
//        areaBookIntroduce.setFont(new Font("微软雅黑",Font.BOLD,16));
//        areaBookIntroduce.setText("请输入书籍的主要内容");
    }

//    public static void main(String[] args) {
//
//    }
}
