/*
/Create two separate interfaces with abstract method and default method with different method names. Create a super class which implements both the interfaces at the same time. 
/Create a subclass which extends superclass. 
/Will the interfaces implemented in superclass be extended automatically in subclass or do we need to specify again? 
/Do we need to define all the abstract methods in subclass again or defining in superclass alone is enough? 
/Do we need to define all the abstract methods in all the classes which are implementing interfaces if there is no relation among classes?
/Will the default methods be called by the subclass object? 
/Can a default method in interface be a constructor? Whether constructors are possible in interfaces concept?
 */

package OOPS_Lab;

interface Inter1{
    abstract void getArea1();
    default void getSides1(){
        System.out.println("I can get sides of a polygon");
    }
}

interface Inter2{
    abstract void getArea2();
    default void getSides2(){
        System.out.println("I can get sides of a octagon");
    }
}

class superclass implements Inter2,Inter1 {
    int length = 5;
    int breadth = 6;
    
    public void getArea1(){
    int area = length*breadth;
        System.out.println("The area is: Interface1 se "+area);
    }
    public void getArea2(){
    int area = length*breadth;
        System.out.println("The area is: Interface2 se "+area);
    }
}

class subclass extends superclass{
    public void ownmethod(){
        int area= length*length;
        System.out.println("Its own area "+area);
    }
}
public class Lab6_Q2 {
    public static void main(String[] args) {
        
        subclass s1 = new subclass();
        s1.getArea1();
        s1.getArea2();
        s1.getSides1();
        s1.getSides2();
        s1.ownmethod();
    }
}
