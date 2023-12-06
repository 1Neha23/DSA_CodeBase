
// Given an array arr[] and an integer K, the task is to calculate the sum of all subarrays of size K.

// Examples: 

// Input: arr[] = {1, 2, 3, 4, 5, 6}, K = 3 
// Output: 6 9 12 15 
// Explanation: 
// All subarrays of size k and their sum: 
// Subarray 1: {1, 2, 3} = 1 + 2 + 3 = 6 
// Subarray 2: {2, 3, 4} = 2 + 3 + 4 = 9 
// Subarray 3: {3, 4, 5} = 3 + 4 + 5 = 12 
// Subarray 4: {4, 5, 6} = 4 + 5 + 6 = 15

//Sliding window opimal solution


public class MyClass {
    
    public static void subarray(int arr[] , int n, int k)
    {
        int sum =0;
      for(int i=0; i<k ;i++)
      sum = sum + arr[i];
   System.out.print(sum+ " "); 
       
      for(int i= k ; i<n; i++)
      {
      sum =(sum - arr[i-k]) + arr[i];
      System.out.print(sum+ " "); 
      }
        
   
      
    }
    public static void main(String args[]) {
        
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int n = arr.length; 
        int k = 3;
        subarray(arr, n ,k);
     
    }
}