
package OOPS_Lab;
/**
 *
 * @author assud
 */
public class Operator_Overloading {
    void operate(String str1 , String str2)
    {
        String str3 = str1 + str2;
        System.out.println("Concatanated string is " + str3);
    }
    
    void operate(int num1 , int num2)
    {
        int num3 = num1+ num2;
        System.out.println("The sum is " + num3);
    }
}

class main
{
    public static void main(String[] args) 
    {
        Operator_Overloading obj = new Operator_Overloading();
        obj.operate(2,3);
        obj.operate("Yash","Mohit");
    }
}