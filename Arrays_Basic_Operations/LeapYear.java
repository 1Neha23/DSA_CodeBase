import java.util.*;
public class LeapYear
{
    public static boolean checkLeapYear(int year)
    {
        if(year % 400==0 || (year % 4==0  && year % 100!=0))
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter leap year");
        int year = sc.nextInt();
        if(checkLeapYear(year))
        {
        System.out.println(year + " " + "is a leap  Year");
        }
        else
        {
             System.out.println(year + " " + "is a not  leap  Year");
        }

    }

}