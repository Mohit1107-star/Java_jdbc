
package OOPS_Lab;

class Animal{  
void eat(){System.out.println("Dog eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("Dog barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("Dog weeping...");}  
}  

public class Inheritance {    
    public static void main(String args[]){  
    BabyDog d=new BabyDog();  
    d.weep();  
    d.bark();  
    d.eat();  
}
}
