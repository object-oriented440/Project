package UiDesign;

import UiDesign.CustomComponent.Tools.SetTexts;
import UiDesign.Login.LoginFrame;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*一次性设置所有字体*/
        new SetTexts().initGlobalFont(new Font("Dialog", Font.BOLD, 12));
        /*主运行*/
        LoginFrame loginFrame = new LoginFrame();
    }
}
