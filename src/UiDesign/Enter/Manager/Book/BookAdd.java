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
        this.setBounds(300,150,700,600);
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
//    private void setContentPane()
//    {
//
//        JPanel pane1 = new JPanel();
//        JPanel pane2 = new JPanel();
//
//        //for pane1
//        JPanel pane1_p1 = new JPanel();
//        JPanel pane1_p2 = new JPanel();
//
//        //for labelSelect
//        //labelSelect.addMouseListener(this);
//
//        //pane1_p1.add(labelSelect);
//        pane1_p1.add(fileSelector);
//        //pane1_p2.add(buttonSelect);
//
//        //pane1.setLayout(new GridLayout(2,1));
//        pane1.add(pane1_p1);
//        //pane1.add(pane1_p2);
//
//
//
//        //for pane2
//        JPanel p1,p2,p3,p4,p5,p6,p7;
//        p1 = new JPanel();
//        p2 = new JPanel();
//        p3 = new JPanel();
//        p4 = new JPanel();
//        p5 = new JPanel();
//        p6 = new JPanel();
//        p7 = new JPanel();
//
//        JPanel p1Left,p2Left,p3Left,p4Left,p5Left,p6Left,p7Left;
//        JPanel p1Right,p2Right,p3Right,p4Right,p5Right,p6Right,p7Right;
//
//        p1Left = new JPanel();
//        p2Left = new JPanel();
//        p3Left = new JPanel();
//        p4Left = new JPanel();
//        p5Left = new JPanel();
//        p6Left = new JPanel();
//        p7Left = new JPanel();
//
//        p1Right = new JPanel();
//        p2Right = new JPanel();
//        p3Right = new JPanel();
//        p4Right = new JPanel();
//        p5Right = new JPanel();
//        p6Right = new JPanel();
//        p7Right = new JPanel();
//
//
//        p1Left.add(labelName);
//        p1Right.add(fieldBookName);
//        //p1.add(JPanel.creat);
//        p2Left.add(labelAuthor);
//        p2Right.add(fieldBookAuthor);
//
//        p3Left.add(labelPress);
//        p3Right.add(fieldPress);
//
////        /**/
////        p3.add(labelSex);
////        //p3.add(group);//不需要
////        p3.add(rb1);
////        p3.add(rb2);
////        /**/
////
////        /**/
////        p4.add(labelPrice);
////        p4.add(fieldBookPrice);
////        /**/
////
////        /**/
////        p5.add(labelCategory);
////        p5.add(comboBookCategory);
////        p6.add(labelDescription);
////        //p6.add(areaBookDescription);
////        /**/
//
//        p7Left.add(buttonAdd);
//        p7Right.add(buttonReset);
//
////        p1.setLayout(new BorderLayout());//暂时
////        p2.setLayout(new BorderLayout());
////        p3.setLayout(new BorderLayout());
////        p7.setLayout(new BorderLayout());
//
//
//        p1.add(p1Left,BorderLayout.WEST);
//        p1.add(p1Right,BorderLayout.CENTER);
//
//        p2.add(p2Left,BorderLayout.WEST);
//        p2.add(p2Right,BorderLayout.CENTER);
//
//        p3.add(p3Left,BorderLayout.WEST);
//        p3.add(p3Right,BorderLayout.CENTER);
//
//        p7.add(p7Left,BorderLayout.WEST);
//        p7.add(p7Right,BorderLayout.CENTER);
//
//
//
//        pane2.setLayout(new GridLayout(4,1));
//
//        pane2.add(p1);
//        pane2.add(p2);
//        pane2.add(p3);
//        //pane2.add(p4);
//        //pane2.add(p5);
//        //pane2.add(p6);
//        pane2.add(p7);
//
//        panel.setLayout(new BorderLayout());
//        panel.add(pane1,BorderLayout.WEST);
//        panel.add(pane2,BorderLayout.CENTER);
//
//        this.add(panel);
//
//
//    }
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

        }
        if(e.getActionCommand().equals("reset"))
        {

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
