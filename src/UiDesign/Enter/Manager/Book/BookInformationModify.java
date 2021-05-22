package UiDesign.Enter.Manager.Book;

import UiDesign.CustomComponent.Panes.BookModifyPane;
import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BookInformationModify extends JFrame implements ActionListener, MouseListener {

    private JFrame previousFrame;
    private JPanel panel;
    private SetIcons setIcons;

    private BookModifyPane bookModifyPane;



    private void initVariate()
    {
        panel = new JPanel();
        setIcons = new SetIcons();

        bookModifyPane = new BookModifyPane();
    }
    private void setFrame()
    {
        setTitle("图书信息修改");
        setBounds(300,60,800,700);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/图书管理2.png"));

    }
    private void setMenu()
    {
        Else menuElse = new Else(this,previousFrame);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuElse);
        this.setJMenuBar(menuBar);
    }
    private void setContentPane()
    {
        panel.add(bookModifyPane);
        this.add(panel);
    }
    public void Execute()
    {
        setFrame();
        setMenu();
        setContentPane();
    }
    public void setClosedVisible()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public BookInformationModify(JFrame currentFrame, JFrame previousFrame)
    {
        this.previousFrame = currentFrame;
        initVariate();
    }
    //just for test
    public BookInformationModify()
    {
        initVariate();
    }

    public static void main(String[] args) {
        BookInformationModify bookInformationModify = new BookInformationModify();
        bookInformationModify.Execute();
        bookInformationModify.setClosedVisible();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
}
