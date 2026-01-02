//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;



// } Driver Code Ends


public class Solution
{
    public static int firstElementKTime(int[] a, int n, int k) { 
        
    //    Brute forece
        
       
    //  int min=Integer.MAX_VALUE; 
    //  int index=0;
    //   for(int i=0; i< n;i++)
    //   {
    //       for(int j=0;j<n;j++)
    //       {
    //           if(i !=j && a[i]==a[j])
    //           {
    //               min = Math.min(j-i, min);
    //              index =i;
    //           }
    //       }
          
          
    //   }
    //   return index;
    
    //optimized solution
    
     Map<Integer , Integer> map = new LinkedHashMap<>();
        for(int i :a)
        {
            if(map.containsKey(i))
            {
                map.put(i, map.get(i)+1);
            }
            else
            {
                map.put(i, 1);
            }
            
            if(map.get(i)==k)
               return i;
        }
        return -1;
        
    } 
    public static void main (String[] args)  {
	int a[] = new int[] { 1, 7, 4 ,3 ,4 ,8 ,7};
	int k= 2;
	int n = a.length;
	int b= firstElementKTime(a,k,n);
	System.out.println("value is " + b);
		
	}
}