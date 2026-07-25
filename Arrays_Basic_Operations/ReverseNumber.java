import java.util.*;

public class ReverseNumber
{
    public static int reverseNum(int number)
    {
        int rem;
        int rev = 0;
        while(number != 0)
        {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        return rev;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int num =sc.nextInt();
        int result =reverseNum(num);
        System.out.println("Reverse number is :" + " " + result);
    }
}