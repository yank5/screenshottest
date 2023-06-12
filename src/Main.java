import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        Robot robot=new Robot();
        //ImageIO

        Ddraw draw=new Ddraw();
        while(draw.isActive()){
            draw.repaint();
            Thread.sleep(16);
        }
    }
}