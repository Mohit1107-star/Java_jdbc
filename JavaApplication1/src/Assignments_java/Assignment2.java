/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments_java;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author assud
 */

class MyassignFrame1 extends Frame implements ActionListener
{
    Button b1,b2,b3;
    static int x=0;
    
    public MyassignFrame1(String title)
    {
        super(title);
       
        b1=new Button("Close Frame");
        b2=new Button("Increment");
        b3=new Button("Decrement");
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setBounds(50,50,500,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() ==b1){
           System.exit(0);
       }
       else if(ae.getSource() == b2)
       {       
           x++;
           setTitle(Integer.toString(x));
       }
       else
       {
           x--;
           setTitle(Integer.toString(x));
       }
    }
}
public class Assignment2 {
     public static void main(String[] args) {
        MyassignFrame1 maf1 =  new MyassignFrame1("0");
    }
}
