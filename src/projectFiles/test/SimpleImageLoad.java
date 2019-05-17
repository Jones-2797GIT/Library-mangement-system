
package projectFiles.test;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SimpleImageLoad {
    Image img;
    public SimpleImageLoad(){
        try{
            File imageFile=new File("images(1).jpg");
            img= ImageIO.read(imageFile);
        }catch(IOException exc){
            System.out.println("Cannot load image file.");
            System.exit(0);
        }
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }               
        });
    }
    public void paint(Graphics g){
        Graphics Graphics; 
        /*Graphics = g.drawImage(img, getInsets().left,getInsets().top,null);*/
    }

    private Object getInsets() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
