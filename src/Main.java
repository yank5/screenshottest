import java.awt.*;
import java.awt.event.*;

public class Main extends Frame{
     Main(){
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
         setBackground(new Color(10,10,10,30));

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



    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot=new Robot();
        //ImageIO
        Main main=new Main();
        while(main.isActive()){
            main.repaint();
            Thread.sleep(16);
        }
    }
}