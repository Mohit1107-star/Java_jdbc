
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author assud
 */

class MyFrame5 extends Frame implements ActionListener
{
    Button b1,b2;
    Random rnd;
    
    public MyFrame5(String title)
    {
        super(title);
       
        b1=new Button("Close Frame");
        b2=new Button("Change Color");
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        rnd = new Random();
        b1.addActionListener(this);
        b2.addActionListener(this);
        setBounds(50,50,500,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() ==b1){
           System.exit(0);
       }
       else
       {           
           int red = rnd.nextInt(256);
           int green = rnd.nextInt(256);
           int blue =  rnd.nextInt(256);
           
           Color c = new Color(red,green,blue);
           setBackground(c);
       }
    }
}

public class Example6  {
    public static void main(String[] args) {
        MyFrame5 mf5 =  new MyFrame5(" Mohit bro Frane");
    }
}
