public class MinSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        // Your implementation remains the same
         if(nums==null || nums.length==0) return 0;
        int min =Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum =0;
        while(j < nums.length)
        {
            sum += nums[j];
            j++;
           while(sum >= target)
           {
                   min = Math.min(min , j-i);
                   sum -= nums[i];
                   i++;          
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;
        
    
    }

    public static void main(String args[]) {
        MinSubArrayLen minSubArrayLenCalculator = new MinSubArrayLen();  // Create an instance
        int[] arr = {2, 3, 1, 2, 4, 3};
        int k = 7;
        int sum = minSubArrayLenCalculator.minSubArrayLen(k, arr);  // Call the instance method
        System.out.print("sum of smallest subarray: " + sum);
    }
}
