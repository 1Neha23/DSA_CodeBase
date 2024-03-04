public class KeyValuePair {
    
    
    
    //Brute force
    //Find key pair whose = given K  -> O(n)^2
    
    public static boolean KeyPair(int arr[],int K)
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i]+arr[j]==K)
                {
                    return true;
                    break;
                }
            }
        }
        return false;
    }
    
    
   //optimized solution -> O(n)
   public static boolean KeyPair(int arr[],int K)
    {
        HashMap<Integer,Integer<- freq> map = new HashMap<>();
        
        for(int i=0;i< arr.length;i++)
        {
           if(map.containsKey(K-arr[i])) 
           {
               return true;
           }
           map.put(arr[i],i);
        }
        return false;
    }
   
}