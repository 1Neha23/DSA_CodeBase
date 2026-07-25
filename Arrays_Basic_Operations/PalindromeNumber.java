import java.util.*;
public class PalindromeNumber
{
    public static boolean checkPalindrome_Any_Type(Object obj)
    {
        if(obj instanceof String)
        {
            return checkStringPalindrome((String) obj);
        }
        else if(obj instanceof Integer || obj instanceof Long || obj instanceof Short
        || obj instanceof Byte)
        {
        return checkNumberPalindrome((Number) obj);
        }
        else
        {
            System.out.println("Unsupported type. Please provide String or Integer type.");
            return false;

        }

    }

    public static String checkStringPalindrome(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        if(reversed.equalsIgnoreCase(str))
        {
            return str;
        }
    
         
    }

    public static int checkNumberPalindrome(int num)
    {
        int rem=0;
        while(num !=0)
        {
        rem= num %10;
        int rev = rev * 10 + rem;
        num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


    }

}