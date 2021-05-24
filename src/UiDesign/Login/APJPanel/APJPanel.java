package UiDesign.Login.APJPanel;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class APJPanel extends JPanel implements ActionListener, FocusListener {


    private JLabel labelAccount;
    private JLabel labelPassword;
    private JTextField textFieldAccount;
    private JPasswordField passwordFieldPassword;
    private void initVariate()
    {
        labelAccount = new JLabel("账号:");
        labelPassword = new JLabel("密码:");

        textFieldAccount = new JTextField();
        textFieldAccount.requestFocusInWindow();//用户名获得焦点!!!

        passwordFieldPassword = new JPasswordField();
    }
    private void setPane()
    {
        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        this.setBorder(BorderFactory.createTitledBorder(border, "输入登录信息",
                TitledBorder.CENTER,TitledBorder.TOP));

        this.setLayout(new BorderLayout());


        Box VBox = Box.createVerticalBox();
        Box hBoxTemp1 = Box.createHorizontalBox();
        Box hBoxTemp2 = Box.createHorizontalBox();

        int width = 0;
        int height = 0;

        width = 20;
        height = 15;

        //VBox.add(Box.createVerticalStrut(15));

        hBoxTemp1.add(Box.createHorizontalStrut(150));
        hBoxTemp1.add(labelAccount);
        hBoxTemp1.add(Box.createHorizontalStrut(width));
        hBoxTemp1.add(textFieldAccount);
        hBoxTemp1.add(Box.createHorizontalStrut(150));

        VBox.add(hBoxTemp1);
        VBox.add(Box.createVerticalStrut(15));

        hBoxTemp2.add(Box.createHorizontalStrut(150));
        hBoxTemp2.add(labelPassword);
        hBoxTemp2.add(Box.createHorizontalStrut(width));
        hBoxTemp2.add(passwordFieldPassword);
        hBoxTemp2.add(Box.createHorizontalStrut(150));

        //VBox.add(hBoxTemp1);
        VBox.add(hBoxTemp2);

        //VBox.add(Box.createVerticalStrut(15));

        this.add(VBox);
    }

    public APJPanel()
    {
        initVariate();
        setPane();
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
