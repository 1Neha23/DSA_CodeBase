import java.util.*;
public class Factorial
{
    public static int checkFactorial(int num)
    {
        int fact =1;
        for(int i=1; i<=num;i++)
        {
            fact = fact*i;
        }
       return fact;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int result = checkFactorial(num);
        System.out.println("Factorial of given number is : "+ " "+ result);

    }
}