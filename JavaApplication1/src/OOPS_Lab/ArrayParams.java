
package OOPS_Lab;

public class ArrayParams {
    public static void updateParam( double[] x )
      {
   	 x[0] = 9999;  // Update one of the array element
      }
    
    
      public static void main(String[] args)
      {
   	 double[] a = { 2.3, 3.4 , 4.5 };
    
   	 System.out.println("Array before calling updateParam:");     
    
   	 for (int i = 0; i < a.length; i++)
   	    System.out.println( a[i] );
    
   	 updateParam( a );       // Call updateParam
   	 System.out.println("Array AFTER calling updateParam:");
    
   	 for (int i = 0; i < a.length; i++)
   	    System.out.println( a[i] );
      }

}
