/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS_Lab;

// Abstract class  
abstract class Human1
{        
  // Abstract method (does not have a body)
  public abstract void humanSound();
  // Regular method
  public void sleep() 
  {
    System.out.println("Zzz");      
  }
}

// Subclass (inherit from Animal)
class guy extends Human1 
{
  public void humanSound() 
  {
    // The body of animalSound() is provided here
    System.out.println("The guy says: Hemlo Birother");
  }
}

public class Class_abstract 
{
    public static void main(String[] args) 
    {
    guy myGuy = new guy(); // Create a Pig object
    myGuy.humanSound();
    myGuy.sleep();
    }

}
