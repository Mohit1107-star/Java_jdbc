
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author assud
 */

class MyFrame3 extends Frame implements ActionListener
{
    Button b1,b2;
    public MyFrame3(String title)
    {
        super(title);
       
        b1=new Button("Close Frame");
        b2=new Button("Change Color");
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        CloseFrame obj=new CloseFrame();
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
           setBackground(Color.cyan);
    }
}

public class Example5 {
    public static void main(String[] args) {
        MyFrame3 mf3 = new MyFrame3("Mohit Frame");
    }
}
