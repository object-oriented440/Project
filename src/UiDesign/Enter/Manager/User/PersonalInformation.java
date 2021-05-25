package UiDesign.Enter.Manager.User;

import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class PersonalInformation extends JFrame implements ActionListener, FocusListener {

    private JFrame previousFrame;
    private JPanel panel;
    private SetIcons setIcons;

    private JLabel labelName;//姓名
    private JLabel labelSex;//性别
    private JLabel labelAct;//一卡通号
    private JLabel labelMajor;//专业
    private JLabel labelBorrowBookNumber;//借书数量显示

    private JTextField fieldName;
    private JTextField fieldAct;
    private JTextField fieldMajor;
    private JTextField fieldBorrowBookNumber;

    private JButton buttonYes;
    private JButton buttonReset;
    private JButton buttonCancel;

    private ButtonGroup group;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb;



    private void initVariate()
    {
        setIcons = new SetIcons();
    }
    private void setFrame()
    {
        this.setTitle("个人信息添加");
        this.setBounds(380,250,470,270);
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
                "个人信息添加", TitledBorder.CENTER,TitledBorder.TOP));

        Box HBox = Box.createHorizontalBox();

        Box vBTemp1 = Box.createVerticalBox();
        Box vBTemp2 = Box.createVerticalBox();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder(border,
                null, TitledBorder.CENTER,TitledBorder.TOP));
        p2.setBorder(BorderFactory.createTitledBorder(border,
                null, TitledBorder.CENTER,TitledBorder.TOP));
        p1.add(vBTemp1);
        p2.add(vBTemp2);

        Box hbt1 = Box.createHorizontalBox();
        Box hbt2 = Box.createHorizontalBox();
        Box hbt3 = Box.createHorizontalBox();
        Box hbt4 = Box.createHorizontalBox();
        Box hbt5 = Box.createHorizontalBox();
        Box hbt6 = Box.createHorizontalBox();
        Box hbt7 = Box.createHorizontalBox();

        labelName = new JLabel("姓名:");
        labelName.requestFocusInWindow();//账号获得焦点
        labelAct = new JLabel("一卡通:");
        labelMajor = new JLabel("专业:");
        fieldName = new JTextField();
        fieldAct = new JTextField();
        fieldMajor = new JTextField();
        buttonYes = new JButton("确认");
        buttonYes.addActionListener(this);
        buttonYes.setActionCommand("yes");
        buttonReset = new JButton("重填");
        buttonReset.addActionListener(this);
        buttonReset.setActionCommand("reset");

        int width=0,height=0;

        width = 20;

        //hbt1.add(Box.createHorizontalStrut(width));
        hbt1.add(labelName);
        hbt1.add(Box.createHorizontalStrut(30));
        hbt1.add(fieldName);
        //hbt1.add(Box.createHorizontalStrut(width));

        //hbt2.add(Box.createHorizontalStrut(width));
        hbt2.add(labelAct);
        hbt2.add(Box.createHorizontalStrut(18));
        hbt2.add(fieldAct);
        //hbt2.add(Box.createHorizontalStrut(width));

        //hbt3.add(Box.createHorizontalStrut(width));
        hbt3.add(labelMajor);
        hbt3.add(Box.createHorizontalStrut(31));
        hbt3.add(fieldMajor);
        //hbt3.add(Box.createHorizontalStrut(width));

        hbt4.add(Box.createHorizontalStrut(width));
        hbt4.add(buttonYes);
        hbt4.add(Box.createHorizontalStrut(width));
        hbt4.add(buttonReset);
        hbt4.add(Box.createHorizontalStrut(width));

        labelSex = new JLabel("性别:");
        rb1 = new JRadioButton("男");
        //rb1.add
        rb2 = new JRadioButton("女");

        rb = new JRadioButton();
        rb.setVisible(false);

        group = new ButtonGroup();//单选按钮组
        group.add(rb1);
        group.add(rb2);
        group.add(rb);

//        labelHead = new JLabel("头像:");
//        boxHead = new JComboBox();
//        for(int i=0;i<=10;i++)
//        {
//            boxHead.addItem(new ImageIcon("src/Images/headPortrait/"+i+".png"));
//        }
//        boxHead.setSelectedIndex(3);

        buttonCancel = new JButton("取消");
        buttonCancel.addActionListener(this);
        buttonCancel.setActionCommand("cancel");

        hbt5.add(Box.createHorizontalStrut(width));
        hbt5.add(labelSex);
        hbt5.add(Box.createHorizontalStrut(width));
        hbt5.add(rb1);
        hbt5.add(Box.createHorizontalStrut(5));
        hbt5.add(rb2);
        hbt5.add(Box.createHorizontalStrut(width));

        labelBorrowBookNumber = new JLabel("已借数量:");
        fieldBorrowBookNumber = new JTextField();

        /*此处获取已借数量的数据！！！代码没写*/
        int temp = 0;
        fieldBorrowBookNumber.setText(""+temp+"");

        /**/

        fieldBorrowBookNumber.setForeground(Color.red);
        fieldBorrowBookNumber.setFont(new Font("微软雅黑",Font.BOLD,16));
        fieldBorrowBookNumber.setEditable(false);//设为不可被编辑状态

        hbt6.add(Box.createHorizontalStrut(width));
        hbt6.add(labelBorrowBookNumber);
        hbt6.add(Box.createHorizontalStrut(width+10));
        hbt6.add(fieldBorrowBookNumber);
        hbt6.add(Box.createHorizontalStrut(width));

        hbt6.setVisible(false);

        hbt7.add(Box.createHorizontalStrut(3*width));
        hbt7.add(buttonCancel);
        hbt7.add(Box.createHorizontalStrut(width/2));

        height = 15;
        vBTemp1.add(Box.createVerticalStrut(height));
        vBTemp1.add(hbt1);
        vBTemp1.add(Box.createVerticalStrut(height));
        vBTemp1.add(hbt2);
        vBTemp1.add(Box.createVerticalStrut(height));
        vBTemp1.add(hbt3);
        vBTemp1.add(Box.createVerticalStrut(2*height));
        vBTemp1.add(hbt4);
        //vBTemp1.add(Box.createVerticalStrut(height));

        vBTemp2.add(Box.createVerticalStrut(height));
        vBTemp2.add(hbt5);
        vBTemp2.add(Box.createVerticalStrut(height));
        vBTemp2.add(hbt6);
        vBTemp2.add(Box.createVerticalStrut(2*height+2));
        vBTemp2.add(hbt7);
        //vBTemp2.add(Box.createVerticalStrut(height));

        //HBox.add(Box.createHorizontalStrut(15));
        HBox.add(vBTemp1);
        //HBox.add(p1);
        HBox.add(Box.createHorizontalStrut(30));
        //HBox.add(p2);
        HBox.add(vBTemp2);
        //HBox.add(Box.createHorizontalStrut(15));

        panel.add(HBox);
        this.add(panel);
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
    public PersonalInformation(JFrame currentFrame,JFrame previousFrame)
    {
        this.previousFrame = currentFrame;
        initVariate();
    }
    public PersonalInformation()
    {
        initVariate();
    }

    public static void main(String[] args) {
        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.Execute();
        personalInformation.setClosedVisible();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("yes"))
        {
            String tempStr;
            if (fieldName.getText().length() == 0 ||fieldAct.getText().length() == 0 ||
                    fieldMajor.getText().length() == 0 ||
                    (!rb1.isSelected() && !rb2.isSelected()))
            {
                tempStr = "请将信息填写完全！";
                JOptionPane.showMessageDialog(this, tempStr);
                int length = fieldName.getText().length();
                while(true)
                {
                    if(length == 0)
                    {
                        fieldName.requestFocusInWindow();
                        break;
                    }
                    length = fieldAct.getText().length();
                    if(length == 0)
                    {
                        fieldAct.requestFocusInWindow();
                        break;
                    }
                    length = fieldMajor.getText().length();
                    if(length == 0)
                    {
                        fieldMajor.requestFocusInWindow();
                        break;
                    }
                    break;
                }
            }

        }/*end yes*/
        if (e.getActionCommand().equals("reset")) {
            fieldName.setText("");
            fieldAct.setText("");
            fieldMajor.setText("");
            fieldName.requestFocusInWindow();
            rb.setSelected(true);
        }/*end reset*/
        if (e.getActionCommand().equals("cancel")) {
            this.setVisible(false);
        }/*end cancel*/
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
