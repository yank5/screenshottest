import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class Ddraw extends Frame{
    Graphics2D g2;
    Image img;
    Ddraw() throws IOException {
        Button button=new Button("!");
        button.setBounds(30,100,80,30);
        add(button);
        setForeground(new Color(100));
        setSize(500,500);
        setLocation(50,50);
        setTitle("T");
        setLayout(null);
        setUndecorated(true);
        setFocusable(true);
        setAlwaysOnTop(true);
        setBackground(new Color(10,10,10,10));
        img= ImageIO.read(new File("image.png"));

        var mouse=MouseInfo.getPointerInfo().getLocation();


        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                System.out.println(e);
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
                    dispose();
                }
            }
        });


        setVisible(true);
    }
    public void paintComponents(Graphics g){
        super.paintComponents(g);
        g2=(Graphics2D) g;
        //g2.drawImage(img,1,1,);

    }
}
