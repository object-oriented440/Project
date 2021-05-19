package UiDesign.CustomComponent.ThreeFramePane;

import UiDesign.CustomComponent.Tools.SetIcons;

import javax.swing.*;

/*自定义内容组件*/
public class ContentPane extends JPanel {
    private JLabel labelImage;
    private SetIcons setIcons;
    private void InitVariate()
    {
        labelImage = new JLabel();
        setIcons = new SetIcons();

        //setLabelImage();
    }
    public void setLabelImage()
    {
        String imagePath = "src/Images/图书管理.png";
        //ImageIcon imageIcon = new ImageIcon(imagePath);
        //imageIcon = setIcons.setJLabelIcon(labelImage,imagePath);
        setIcons.setJLabelIcon(labelImage,imagePath,600,350);
        //labelImage.setIcon(imageIcon);
    }
    public void setLabelImage(JLabel labelImage,String imagePath)
    {
        //String imagePath = "src/Images/图书管理.png";
        //ImageIcon imageIcon = new ImageIcon(imagePath);
        //imageIcon = setIcons.setJLabelIcon(labelImage,imagePath);
        setIcons.setJLabelIcon(labelImage,imagePath,600,350);
        //labelImage.setIcon(imageIcon);
    }
    public ContentPane(String imagePath)
    {
        InitVariate();//变量初始化
        //System.out.println("ContentPane()");
        setLabelImage(this.labelImage,imagePath);
        this.add(this.labelImage);
    }
    public ContentPane()
    {
        InitVariate();//变量初始化
        //System.out.println("ContentPane()");
        setLabelImage();
        this.add(labelImage);
    }
}
