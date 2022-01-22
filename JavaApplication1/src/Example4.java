import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame implements ActionListener
{
    Button b1,b2;
    public MyFrame2(String title)
    {
        super(title);
       
        b1=new Button("Close Frame");
        b2=new Button("Change Color");
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        CloseFrame obj=new CloseFrame();
        b1.addActionListener(obj);
        b2.addActionListener(this);
        setBounds(50,50,500,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setBackground(Color.yellow);
    }
}

class CloseFrame implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
    
}



public class Example4 {
    public static void main(String[] args) {
        MyFrame2 mf2=new MyFrame2("Sachin's Frame");
    }
   
}
