package UiDesign.CustomComponent.Tools;

import javax.swing.*;
import java.awt.*;

public class SetIcons {
    /***自定义图标大小***/
    public ImageIcon iconSize(ImageIcon imageIcon,int width,int height)
    {
        Image img = imageIcon.getImage();//ImageIcon.getImage()
        img = img.getScaledInstance(width,height,Image.SCALE_DEFAULT);//

        imageIcon.setImage(img);//ImageIcon.setImage(Image)
        return imageIcon;
    }
    /*简单的，类似按比例缩小图片*/
    public void setJLabelImageScale(JLabel label,String imagePath,int width)//只传入width
    {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        int w = imageIcon.getIconWidth();
        int h = imageIcon.getIconHeight();
        int height = width*h/w;

        imageIcon = this.iconSize(imageIcon,width,height);
        label.setIcon(imageIcon);
    }
    /***设置JLabel的图标***/
    public void setJLabelIcon(JLabel label,String imagePath,int width,int height)
    {
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(imagePath);
        imageIcon = this.iconSize(imageIcon,width,height);
        label.setIcon(imageIcon);
    }
    public void setJLabelIcon(JLabel label,String imagePath)
    {
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(imagePath);
        label.setIcon(imageIcon);
    }
    /***设置JButton的图标***/
    public void setJButtonIcon(JButton button,String imagePath,int width,int height)
    {
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(imagePath);
        imageIcon = this.iconSize(imageIcon,width,height);
        button.setIcon(imageIcon);
    }
    public void setJButtonIcon(JButton button,String imagePath)
    {
        button.setIcon(new ImageIcon(imagePath));
    }
    /***设置JMenu的图标***/
    public void setJMenuIcon(JMenu menu,String imagePath)
    {
        menu.setIcon(new ImageIcon(imagePath));
    }
    /***设置JMenuItem的图标***/
    public void setJMenuItemIcon(JMenuItem item,String imagePath,int width,int height)
    {
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(imagePath);
        imageIcon = this.iconSize(imageIcon,width,height);
        item.setIcon(imageIcon);
    }
    public void setJMenuItemIcon(JMenuItem item,String imagePath)
    {
        item.setIcon(new ImageIcon(imagePath));
    }


//    public static void main(String[] args) {
//
//    }
}
