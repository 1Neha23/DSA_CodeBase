import java.util.*;
import java.lang.*;

public class Anagram{
    
    public static void main(String args[]) {
        String str1 = "java";
        String str2 = "avaj";
        System.out.println("String are anagram" +" " + anagram(str1 , str2));
        
    }
    
    public static boolean anagram(String str1 , String str2){
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        System.out.println(charArray1);
        Arrays.sort(charArray2);
        System.out.println(charArray2);
        
        return Arrays.equals(charArray1 , charArray2);
    }
}

