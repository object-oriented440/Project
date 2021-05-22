package UiDesign.Enter.Manager.Book;

import UiDesign.CustomComponent.Panes.BookAddPane;
import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Manager.Book.FileSelector.FileSelector;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BookAdd extends JFrame implements ActionListener, MouseListener {

    private JFrame previousFrame;
    private JPanel panel;//内容
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
    private JButton buttonAdd,buttonReset;//添加和重置按钮

    private JLabel labelSelect;
    private JButton buttonSelect;

    private JLabel labelPress;
    private JTextField fieldPress;

    private FileSelector fileSelector;
    private BookAddPane bookAddPane;


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
        setIcons.setJButtonIcon(buttonAdd,"src/Images/添加1.png",16,16);

        buttonReset = new JButton("重置");
        buttonReset.addActionListener(this);
        buttonReset.setActionCommand("reset");
        setIcons.setJButtonIcon(buttonReset,"src/Images/还原1.png",16,16);

//        labelSelect = new JLabel();
//        setIcons.setJLabelIcon(labelSelect,"src/Images/添加图片5.png");//,250,250);
        //labelSelect = new FileSelector();
        fileSelector = new FileSelector();
        //buttonSelect = new JButton("浏览");

        labelPress = new JLabel("出版社：");
        fieldPress = new JTextField(10);

        bookAddPane = new BookAddPane();

    }
    private void setBounds()
    {
        this.setBounds(300,150,710,570);
    }
    private void setFrame()
    {
        this.setTitle("图书添加功能");
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/图书地址添加.png"));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/图书管理2.png"));

        setBounds();
    }
    public void setMenu()
    {
        Else menuElse = new Else(this,previousFrame);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuElse);
        this.setJMenuBar(menuBar);
    }
    private void setContentPane()
    {
        JScrollPane scrollPane = new JScrollPane(bookAddPane);
        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);//显示垂直滚动条

        //panel.add(scrollPane);

        panel.add(bookAddPane);
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
    }
    public BookAdd(JFrame currentFrame,JFrame previousFrame)
    {
        this.previousFrame = currentFrame;
        InitVariate();
    }
    //便于测试
    public BookAdd()
    {
        System.out.println("just a test");
        InitVariate();
    }
    public static void main(String[] args) {
        //便于测试
        BookAdd bookAdd = new BookAdd();
        bookAdd.Execute();
        bookAdd.setClosedVisible();
        //由于有元素与前JFrame联系,因此不再单独运行
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("add"))
        {
            //添加按钮

        }
        if(e.getActionCommand().equals("reset"))
        {
            //重置按钮

        }
    }
    /**
     * 鼠标点击事件
     * */
    @Override
    public void mouseClicked(MouseEvent e) {
//        /*
//         * 通过电脑本地打开默认浏览器然后再打开URI所指向的位置
//         * */
//        Desktop desktop = Desktop.getDesktop();
//        String str = "https://github.com/object-oriented440/Project";
//        try {
//            desktop.browse(new URI(str));
//        } catch (URISyntaxException uriSyntaxException) {
//            uriSyntaxException.printStackTrace();
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }
    }
    /**
     * 鼠标按下事件
     * */
    @Override
    public void mousePressed(MouseEvent e) {
        //labelSelect.setCursor(new Cursor(Cursor.HAND_CURSOR));
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
