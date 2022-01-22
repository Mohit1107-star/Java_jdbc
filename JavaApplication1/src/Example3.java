
import java.awt.Color;
import java.awt.Frame;
import java.util.Date;


public class Example3 {
    public static void main(String[] args) {
        Frame fr= new Frame();
        Date d= new Date();
        
        String str = d.toString();
        fr.setTitle(str);
        
//        Color cl = new Color(255,255,0);
//        fr.setBackground(cl);
//        
        fr.setBackground(Color.red);
        
        fr.setBounds(50,50,400,400);
        fr.setVisible(true);
    }
    
}
