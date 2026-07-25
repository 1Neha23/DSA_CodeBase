import java.util.*;
public class EvenOdd_number
{
    public static String checkEvenOddNumber(int number)
    {
        if(number % 2 == 0)
        {
            return "even number";
        }
        else
        {
            return " odd number";
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int number = sc.nextInt();
        String result = checkEvenOddNumber(number);
        System.out.println(number + " " + result);
    }
}