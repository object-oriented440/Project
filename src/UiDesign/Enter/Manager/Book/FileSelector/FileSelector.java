package UiDesign.Enter.Manager.Book.FileSelector;

import UiDesign.CustomComponent.Tools.SetIcons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FileSelector extends JLabel implements MouseListener {

    private String imagePath;
    private SetIcons setIcons;
    private JFileChooser fileChooser;
    public SetIcons getSetIcons()
    {
        return setIcons;
    }
    private void InitVariate()
    {
        imagePath = "src/Images/添加图片5.png";
        setIcons = new SetIcons();
        fileChooser = new JFileChooser("C:\\Users\\www29\\Desktop\\bookImages");
    }
    private void setLabel()
    {
        setIcons.setJLabelIcon(this,imagePath,250,250);
        this.addMouseListener(this);//!!!
    }
    public FileSelector()
    {
        InitVariate();
        setLabel();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int a = fileChooser.showSaveDialog(null);//保存文件，指定路径
        /**
         * CANCEL_OPTION 表示单击"取消"按钮退出对话框
         * APPROVE_OPTION 表示无文件选取或正常选取文件
         * ERROR_OPTION 表示发生错误或对话框已被解除而退出对话框
         * */
        if(a == fileChooser.APPROVE_OPTION)
        {
            //被选中的文件保存为文件对象
            File file = fileChooser.getSelectedFile();
            //this.setIcon(file);
            imagePath = file.getPath();
            //setIcons.setJLabelIcon(this,imagePath);//,250,250);
            setIcons.setJLabelImageScale(this,imagePath,250);

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
            this.setCursor(new Cursor(Cursor.HAND_CURSOR));//设置光标
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

//    public static void main(String[] args) {
//
//    }
}
