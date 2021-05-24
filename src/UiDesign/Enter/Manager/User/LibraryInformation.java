package UiDesign.Enter.Manager.User;

import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * 借阅信息查询  对应于当前用户的账号，获得它的借阅信息
 * */
public class LibraryInformation extends JFrame implements ActionListener, FocusListener {

    private JFrame previousFrame;
    private SetIcons setIcons;
    private JPanel panel;


    private Box tableHBox;
    private JTable table;
    private DefaultTableModel tableModel;


    private void initVariate()
    {
        setIcons = new SetIcons();
        panel = new JPanel();
    }
    private void setFrame()
    {
        this.setTitle("借阅信息查询");
        this.setBounds(380,250,470,270);
        Image image = Toolkit.getDefaultToolkit().getImage("src/Images/.png");
        this.setIconImage(image);
    }
    private void setMenu()
    {
        Else menuElse = new Else(this,previousFrame);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuElse);
        this.setJMenuBar(menuBar);
    }

    private void setPane()
    {
        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        panel.setBorder(BorderFactory.createTitledBorder(border,
                "已借书籍", TitledBorder.CENTER,TitledBorder.TOP));

        /******/
        tableHBox = Box.createHorizontalBox();
        //实例化一个滚动面板
        JScrollPane tableScrollPane = new JScrollPane();
        //将表格添加到滚动面板中
        tableScrollPane.setViewportView(this.creatTable());
        //设置预定义大小
        tableScrollPane.setPreferredSize(new Dimension(430,160));

        tableHBox.add(tableScrollPane);
        /******/

        panel.add(tableHBox);
        this.add(panel);
    }
    public void Execute()
    {
        setFrame();
        setMenu();
        setPane();
    }
    private JTable creatTable()
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
    public void setClosedVisible()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public LibraryInformation(JFrame currentFrame,JFrame previousFrame)
    {
        this.previousFrame = currentFrame;
        initVariate();
    }
    public LibraryInformation()
    {
        initVariate();
    }

    public static void main(String[] args) {
        LibraryInformation libraryInformation = new LibraryInformation();
        libraryInformation.Execute();
        libraryInformation.setClosedVisible();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
