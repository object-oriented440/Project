package UiDesign.Login;

import UiDesign.Enter.Menu.Else;
import UiDesign.Storage.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class resetFrame extends JFrame implements ActionListener {

    private JFrame previousFrame;
    private JPanel panel;
    private JLabel labelAct;
    private JLabel labelPwd1;
    private JLabel labelPwd2;
    private JTextField fieldAct;
    private JPasswordField fieldPwd1;
    private JPasswordField fieldPwd2;
    private JButton buttonYes;
    private JButton buttonReset;
    private JLabel labelSex;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb;//不可视JRadioButton
    private ButtonGroup group;//单选按钮组
    private JLabel labelHead;
    private JComboBox boxHead;
    private JButton buttonCancel;

    private void initVariate()
    {

    }
    private void setFrame()
    {
        this.setTitle("注册新账号");
        this.setBounds(380,250,470,270);

        Image image = Toolkit.getDefaultToolkit().getImage("src/Images/图书馆3.png");
        this.setIconImage(image);
    }
    private void setMenu()
    {
        Else menuElse = new Else(this,previousFrame);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuElse);
        this.setJMenuBar(menuBar);
    }
    private void createContentPane()
    {
        panel = new JPanel();

        Box HBox = Box.createHorizontalBox();
        Box vBTemp1 = Box.createVerticalBox();
        Box vBTemp2 = Box.createVerticalBox();
        Box hbt1 = Box.createHorizontalBox();
        Box hbt2 = Box.createHorizontalBox();
        Box hbt3 = Box.createHorizontalBox();
        Box hbt4 = Box.createHorizontalBox();
        Box hbt5 = Box.createHorizontalBox();
        Box hbt6 = Box.createHorizontalBox();
        Box hbt7 = Box.createHorizontalBox();

        labelAct = new JLabel("账号:");
        labelAct.requestFocusInWindow();//账号获得焦点
        labelPwd1 = new JLabel("密码:*");
        labelPwd2 = new JLabel("确认密码:*");
        fieldAct = new JTextField();
        fieldPwd1 = new JPasswordField();
        fieldPwd2 = new JPasswordField();
        buttonYes = new JButton("确认");
        buttonYes.addActionListener(this);
        buttonYes.setActionCommand("yes");
        buttonReset = new JButton("重填");
        buttonReset.addActionListener(this);
        buttonReset.setActionCommand("reset");

        int width=0,height=0;

        width = 20;

        //hbt1.add(Box.createHorizontalStrut(width));
        hbt1.add(labelAct);
        hbt1.add(Box.createHorizontalStrut(40));
        hbt1.add(fieldAct);
        //hbt1.add(Box.createHorizontalStrut(width));

        //hbt2.add(Box.createHorizontalStrut(width));
        hbt2.add(labelPwd1);
        hbt2.add(Box.createHorizontalStrut(35));
        hbt2.add(fieldPwd1);
        //hbt2.add(Box.createHorizontalStrut(width));

        //hbt3.add(Box.createHorizontalStrut(width));
        hbt3.add(labelPwd2);
        hbt3.add(Box.createHorizontalStrut(10));
        hbt3.add(fieldPwd2);
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

        labelHead = new JLabel("头像:");
        boxHead = new JComboBox();
        for(int i=0;i<=10;i++)
        {
            boxHead.addItem(new ImageIcon("src/Images/headPortrait/"+i+".png"));
        }
        boxHead.setSelectedIndex(3);

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

        hbt6.add(Box.createHorizontalStrut(width));
        hbt6.add(labelHead);
        hbt6.add(Box.createHorizontalStrut(width+10));
        hbt6.add(boxHead);
        hbt6.add(Box.createHorizontalStrut(width));

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
        HBox.add(Box.createHorizontalStrut(30));
        HBox.add(vBTemp2);
        //HBox.add(Box.createHorizontalStrut(15));

        panel.add(HBox);
        this.add(panel);
    }
    private void setClosedVisible()
    {
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public resetFrame(JFrame currentFrame)
    {
        this.previousFrame = currentFrame;
        initVariate();
        setFrame();
        setMenu();
        createContentPane();
        setClosedVisible();
    }

    public static void main(String[] args) {

    }
    /**
     * 用于注册账号
     * */
    private void register(User user) throws IOException, ClassNotFoundException
    {

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("yes")) {
            //点击了“登录”先判断账号密码的一类问题
            if (fieldAct.getText().length() == 0 || fieldPwd1.getPassword().length == 0)
            {
                String tempStr = "请输入账号或密码！";
                JOptionPane.showMessageDialog(this, tempStr);
                fieldAct.requestFocusInWindow();
                int length = fieldAct.getText().length();
                while (true)
                {
                    if(length == 0)
                    {
                        fieldAct.requestFocusInWindow();
                        break;
                    }
                    length = fieldPwd1.getPassword().length;
                    if(length == 0)
                    {
                        fieldPwd1.requestFocusInWindow();
                        break;
                    }
                }
            }
            else if (fieldPwd2.getPassword().length == 0)
            {
                String tempStr = "请确认密码！";
                JOptionPane.showMessageDialog(this, tempStr);
                fieldPwd2.requestFocusInWindow();
            }
            else if (!new String(fieldPwd1.getPassword()).equals(new String(fieldPwd2.getPassword())))
            {
                //判断两次输入密码是否一致
                String tempStr = "两次输入的密码不一致！";
                JOptionPane.showMessageDialog(this, tempStr);
                fieldPwd1.setText("");
                fieldPwd2.setText("");
                fieldPwd1.requestFocusInWindow();
            }
            //然后，此处用于保存账号信息
            /**
             * 账号
             * 密码
             * 性别
             * 头像
             * */
            else {
                //传入数据
                User user = new User(
                        fieldAct.getText(),
                        new String(fieldPwd1.getPassword()),
                        rb1.isSelected()? "男":"女",
                        boxHead.getSelectedIndex()
                        );

                try {
                    resetFrame.this.register(user);
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }

        }/*end yes*/

        if (e.getActionCommand().equals("reset")) {
            fieldAct.setText("");
            fieldPwd1.setText("");
            fieldPwd2.setText("");
            fieldAct.requestFocusInWindow();
//            rb1.setSelected(false);
//            rb2.setSelected(false);
//            rb1 = new JRadioButton("男",false);
//            rb2 = new JRadioButton("女",false);
            /**
             * 最初，组中的所有按钮都未被选择。
             * 一旦选择了任何按钮，该按钮在组中将总是选择状态。
             * 无法以编程方式“关闭”一个按钮以清除按钮组。
             * 要显示“未选择”的按钮，则需要将一个不可见的单选钮添加到组中，
             * 然后以编程方式选择该按钮，以关闭所有已显示的单选钮。
             * 例如，可以激活带标签 "none" 的普通按钮来选择不可见的单选钮。
             * */
            rb.setSelected(true);

            boxHead.setSelectedIndex(3);
        }/*end reset*/
        if (e.getActionCommand().equals("cancel")) {
            this.setVisible(false);
        }/*end cancel*/
    }
}
