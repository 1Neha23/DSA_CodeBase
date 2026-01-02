import java.util.*;

public class SmallestSubarray {
    
    
    public static int smallestSubarray(int a[],  int k)
    {
        int minVal = Integer.MAX_VALUE;
 

        for(int i=0; i< a.length; i++)
        {
            int sum =0;
            for(int j=i ; j< a.length; j++)
            {
                sum += a[j];
                if(sum ==k)
                {
                    minVal= Math.min(minVal , (j-i+1 ));
                }
            }
        }
        return minVal;
    }
    public static void main(String args[]) {
      
      int a[] = { -8, -8, -3, 8  };

      int k =5;
      
      int result = smallestSubarray(a,   k);
      
      System.out.println(result);
      
    }
}
