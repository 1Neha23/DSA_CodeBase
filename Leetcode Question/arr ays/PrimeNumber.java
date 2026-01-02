public class PrimeNumberCode{
    
    static boolean isPrime(int n)
    {
        for(int i=2; i< n;i++ )
        {
            if(n%i == 0) return false;
        }
        return true;
    }
    
    static int checkPrime(int num)
    {
        int count =0;
        for(int i=2; i< num ;i++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.println(i);
            }
        }
         
        return count;
       
    }
    public static void main(String args[])
    {
      int num =20;
     int n = checkPrime(num);
     System.out.println("count is" + n);
      
    }
}