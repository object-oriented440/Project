package UiDesign.Enter.Manager.System;

import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Dao.BookDao;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class totalManager extends JFrame implements ActionListener, FocusListener {

    private JFrame previousFrame;
    private SetIcons setIcons;

    private JTable table;
    private DefaultTableModel tableModel;

    private JButton buttonDelete;

    private void initVariate()
    {
        setIcons = new SetIcons();
    }
    private void setFrame()
    {
        this.setTitle("系统管理界面");
        this.setBounds(300,200,600,400);
        Image image = Toolkit.getDefaultToolkit().getImage("src/Images/系统管理3.png");
        this.setIconImage(image);
    }
    private void setMenu()
    {
        Else menuElse = new Else(this,previousFrame);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuElse);
        this.setJMenuBar(menuBar);
    }
    private JTable creatTable()
    {
        // 获取所有的图书记录并将结果转换成一个二维数组
        //String[][] rowdatas = new BookDao().ListToArray(new BookDao().getRecordsDataBySql(sql));
        // 表头
        String[] headers = {"账号", "密码", "性别"};
        // 实例化表格控件
        table = new JTable();
        // 设置行高
        table.setRowHeight(30);
        // 将表头和表格内容数据填充到表格数据模型中
        tableModel = new DefaultTableModel(null, headers);
        //为表格设置数据模型
        table.setModel(tableModel);
        // 返回填充完成的表格控件
        return table;
    }
    private void setPane()
    {

        //使用服务器缓存中的TableModel???
        JTable registeredUserTable  = new JTable();
        registeredUserTable = this.creatTable();//暂时的

        JTable registeredLibrarianTable  = new JTable();
        registeredLibrarianTable = this.creatTable();

        JTable registeredSystemTable  = new JTable();
        registeredSystemTable = this.creatTable();


        //选项卡
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("用户列表",new JScrollPane(registeredUserTable));
        tabbedPane.addTab("图书馆管理员列表",new JScrollPane(registeredLibrarianTable));
        tabbedPane.addTab("系统管理员列表",new JScrollPane(registeredSystemTable));
        tabbedPane.setTabComponentAt(0, new JLabel("用户列表"));

        this.add(tabbedPane,BorderLayout.CENTER);

        buttonDelete = new JButton("删除");
        //buttonDelete.setFont(new Font("微软雅黑",Font.BOLD,16));
        //buttonDelete.setSize();
        Box htb1 = Box.createHorizontalBox();

        htb1.add(Box.createHorizontalStrut(300));
        htb1.add(buttonDelete);
        //htb1.add(Box.createHorizontalStrut(1));


        this.add(buttonDelete,BorderLayout.SOUTH);
    }
    public void Execute()
    {
        setFrame();
        setMenu();
        setPane();
    }
    public void setClosedVisible()
    {
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public totalManager(JFrame currentFrame,JFrame previousFrame)
    {
        this.previousFrame = currentFrame;
        initVariate();
    }
    public totalManager()
    {
        initVariate();
    }

    public static void main(String[] args) {
        totalManager totalManager = new totalManager();
        totalManager.Execute();
        totalManager.setClosedVisible();
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
