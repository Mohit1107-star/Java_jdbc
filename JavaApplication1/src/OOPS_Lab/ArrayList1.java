/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS_Lab;

import java.util.ArrayList;
import java.util.List;

class Base { }

public class ArrayList1 {
	public static void main(String[] args) {
            
    	List myList = new ArrayList();
    	myList.add("Mohit");
    	myList.add(21);
    	myList.add(83.4);
        
    	myList.add(new Base());
    	for (Object kuchbhi : myList) {        	
        		System.out.println(kuchbhi);
    	}
	}

}
