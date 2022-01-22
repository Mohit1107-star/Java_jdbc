import java.awt.Frame;
import java.util.Date;

/**
 *
 * @author assud
 */
public class Example2 {
    public static void main(String[] args) {
        Frame fr= new Frame();
        Date d= new Date();
        
        String str = d.toString();
        fr.setTitle(str);
        fr.setBounds(50,50,400,400);
        fr.setVisible(true);
    }
}
