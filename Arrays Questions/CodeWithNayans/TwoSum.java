public class TwoSum
{
    public static int[] TwoSum(int arr[], int K)
    {
        int sum=0;
        int a[] = new int[2];
        for(int i=0;i< arr.length; i++)
        {
            for(int j=i+1; j< arr.length;j++)
            {
                sum = arr[i]+arr[j];
                if(sum== K)
                {
                    a[0]=i;
                    a[1]=j;
                    
                }
            }
        }
        return res;
    }
    
    
     public static int[] TwoSum(int arr[], int K)
    {
        // x= a + b;
        // b = a -X;
       
        int a[] = new int[2];
        HashMap<Ineger,Integer> map = new HashMap<>();
        for(int i=0;i< arr.length; i++)
        {
            if(map.containsKey(K - arr[i]))
            {
                int index = map.get((K - arr[i]);
                res[0]=index;
                res[1]= i;
            }
            map.put(arr[i], i);
        }
        return res;
    }
    
}