
package OOPS_Lab;

import java.util.Arrays;

public class UpdateParams1 {
    
    public static int[] addX(int n, int arr[], int x)
    {
  
        int newarr[] = new int[n + 1];
        for (int i = 0; i < n; i++)
            newarr[i] = arr[i];
  
        newarr[n] = x;
  
        return newarr;
    }
    
     public static void main(String[] args)
    {
  
        int arr[] = { 1, 2, 3, 4, 5, 6 };
  
        // print the original array
        System.out.println("Initial Array:\n" + Arrays.toString(arr));
  
        // element to be added
        int x = 7;
  
        // call the method to add x in arr
        arr = addX(arr.length, arr, x);
  
        // print the updated array
        System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));
    }
}
