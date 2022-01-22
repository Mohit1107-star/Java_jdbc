
package OOPS_Lab;

import java.util.*;
import java.lang.Math;

public class Closestzero {
    
    public static void main(String[] args) {
        int[] arr3 ={1,3,5,-10,-6,8};
        int a = arr3[0];
        int b = arr3[1];
        int closest = Math.abs(a+b);
        for(int i=0;i<arr3.length-1;i++){
            for(int j=i+1;j<arr3.length;j++){
                if(Math.abs(arr3[i]+arr3[j])<closest){
                    a=arr3[i];
                    b=arr3[j];
                    closest = Math.abs(arr3[i]+arr3[j]);
                }   
            }       
        }
         System.out.println("The emenets whose sum is closes to 0 are:" + a + " and "+ b);
    }  
}
