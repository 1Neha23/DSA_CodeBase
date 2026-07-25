import java.util.*;
public class PalindromeNumber
{
    public static String checkPalindrome_Any_Type(Object obj)
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
            return "Object type value is not Palindrome";

        }

    }

    public static String checkStringPalindrome(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        if(reversed.equalsIgnoreCase(str))
        {
            return "string is palindrome";
        }
        else
        {
            return "string is not palindrome";
        }
    
         
    }

    public static String checkNumberPalindrome(Number num)
    {
        long original = num.longValue();
        long rem=0;
        long rev=0;
        while(original !=0)
        {
        rem= original % 10;
        rev = rev * 10 + rem;
        original = original / 10;
        }
        if(rev==num.longValue())
        {
            return "number is palindrome";
        }
        else
        {
            return "number is not palindrome";
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.println("Pick any. one option");
        System.out.println("1. checkNumberPalindrome");
        System.out.println("2 .checkStringPalindrome");
        System.out.println("3. checkPalindrome_Any_Type");
        System.out.println("4. Exit");
            int option = sc.nextInt();
            switch(option)
            {
                case 1:
                    {
                    System.out.println("enter number");
                    Number number = sc.nextInt();
                    String result = checkNumberPalindrome(number);
                    System.out.println(result);
                    break;
                    }
                case 2:
                    {
                    System.out.println("enter String");
                    String str  = sc.next();
                    String result = checkStringPalindrome(str);
                    System.out.println(result);
                    break;
                    }   
                case 3:
                    {
                    System.out.println("enter value which take as Object type");
                    Object value = sc.next();
                    String result = checkPalindrome_Any_Type(value);
                    System.out.println(result);
                    break;
                    }   
                case 4:
                    {
                        System.out.println("Exiting");
                        System.exit(0);
                        break;
                    } 
            }
        }


    }

}