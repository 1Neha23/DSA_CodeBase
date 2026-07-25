import java.util.*;
public class Fibonacci_Series
{
    public static void computeFibonacci(int num)
    {
        int num1 =0;
        int num2 = 1;
        int num3 =0;
        int count =0;
        while(count < num)
        {
           num3 = num1+num2;
           System.out.println(num3+" ");
           num1 = num2;
           num2 = num3;
           count++;

        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1 value");
        int num1 = sc.nextInt();
        System.out.println("Fibonacci series is:");
        computeFibonacci(num1);
       

    }

}