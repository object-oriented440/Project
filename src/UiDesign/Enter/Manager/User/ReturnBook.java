package UiDesign.Enter.Manager.User;

import UiDesign.AboutUs.AboutUsDialog;
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
 * 查询搜索的时候，记得是搜索书库
 * */
public class ReturnBook extends JFrame implements ActionListener, FocusListener {

    private JFrame previousFrame;
    private SetIcons setIcons;
    private JPanel panel;

    private JLabel labelCallNumber;//索书号
    private JTextField fieldCallNumber;
    private JButton buttonQuery;
    private JButton buttonReturn;

    private JTable table;
    private DefaultTableModel tableModel;
    private JScrollPane tableScrollPane;

    private Box tableHBox;

    private void initVariate()
    {
        setIcons = new SetIcons();
    }
    private void setFrame()
    {
        this.setTitle("借书界面");
        this.setBounds(380,250,470,320);
        Image image = Toolkit.getDefaultToolkit().getImage("src/Images/用户.png");
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
        panel = new JPanel();
        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        panel.setBorder(BorderFactory.createTitledBorder(border,
                "还书",
                TitledBorder.CENTER,TitledBorder.TOP));

        labelCallNumber = new JLabel("索书号:");
        fieldCallNumber = new JTextField();
        fieldCallNumber.setFont(new Font("微软雅黑",Font.BOLD,12));
        fieldCallNumber.requestFocusInWindow();
        buttonQuery = new JButton("查询");
        buttonQuery.addActionListener(this);
        buttonQuery.setActionCommand("query");
        buttonReturn = new JButton("归还");
        buttonReturn.addActionListener(this);
        buttonReturn.setActionCommand("return");

        Box VBox = Box.createVerticalBox();
        Box hbt1 = Box.createHorizontalBox();
        //Box hbt2 = Box.createHorizontalBox();

        int width=20,height=15;

        hbt1.add(labelCallNumber);
        hbt1.add(Box.createHorizontalStrut(width));
        hbt1.add(fieldCallNumber);
        hbt1.add(Box.createHorizontalStrut(width));
        hbt1.add(buttonQuery);
        hbt1.add(Box.createHorizontalStrut(width));
        hbt1.add(buttonReturn);
        hbt1.add(Box.createHorizontalStrut(width));

        VBox.add(Box.createVerticalStrut(height));
        VBox.add(hbt1);

        tableHBox = Box.createHorizontalBox();
        tableScrollPane = new JScrollPane();

        tableScrollPane.setViewportView(this.creatTable());
        tableScrollPane.setPreferredSize(new Dimension(430,160));

        tableHBox.add(tableScrollPane);

        VBox.add(Box.createVerticalStrut(height));
        VBox.add(tableHBox);

        panel.add(VBox);
        this.add(panel);
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
    public ReturnBook(JFrame currentFrame,JFrame previousFrame)
    {
        this.previousFrame = currentFrame;
        initVariate();
    }
    public ReturnBook()
    {
        initVariate();
    }

    public static void main(String[] args) {
        ReturnBook returnBook = new ReturnBook();
        returnBook.Execute();
        returnBook.setClosedVisible();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("query"))
        {

        }/*end 查询按钮*/
        if(e.getActionCommand().equals("return"))
        {

        }/*end 归还书籍按钮*/
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
