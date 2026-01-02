import java.util.*;

public class RemoveDupsGFg {
    
    
    static String  removeDups(String S) {
        // code here
        String ans =" ";
        Set<Character> s= new HashSet<>();
        for(int i=0; i<S.length() ; i++)
        {
           if(! s.contains(S.charAt(i)))
           {
            s.add(S.charAt(i));
            ans = ans+ S.charAt(i);
           }
        }
        
        return ans;
    }

    public static void main(String args[]) {
     String s= "nehaaa";
     removeDups(s);
     System.out.print( removeDups(s));
    }
}