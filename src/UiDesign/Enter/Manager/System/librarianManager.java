package UiDesign.Enter.Manager.System;

import UiDesign.CustomComponent.Tools.SetIcons;
import UiDesign.Enter.Manager.User.BorrowBook;
import UiDesign.Enter.Menu.Else;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class librarianManager extends JFrame implements ActionListener, FocusListener {

    private JFrame previousFrame;
    private SetIcons setIcons;

    private void initVariate()
    {
        setIcons = new SetIcons();
    }
    private void setFrame()
    {
        this.setTitle("");
        this.setBounds(300,200,600,400);
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

    }
    public void Execute()
    {
        setFrame();
        setMenu();
        setPane();
    }
    public void setClosedVisible()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public librarianManager(JFrame currentFrame,JFrame previousFrame)
    {
        this.previousFrame = currentFrame;
        initVariate();
    }
    public librarianManager()
    {
        initVariate();
    }

    public static void main(String[] args) {
        librarianManager librarianManager = new librarianManager();
        librarianManager.Execute();
        librarianManager.setClosedVisible();
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
