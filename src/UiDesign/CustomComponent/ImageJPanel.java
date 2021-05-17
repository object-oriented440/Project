package UiDesign.CustomComponent;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageJPanel extends JPanel {

    private JLabel img1Label;//图片标签

    public ImageJPanel()
    {
        ImageIcon img_1 = new ImageIcon("D:\\\\IdeaProjects\\\\Project\\\\src\\\\Images\\\\img_1");
        img1Label = new JLabel(img_1);
        this.add(img1Label);
    }
    public static void main(String[] args) {

    }
}
