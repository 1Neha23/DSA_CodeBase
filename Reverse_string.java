public class Reverse_string {
    
  //
 
    public static void reverseString(char[] s) {
        int length = s.length;
        for(int i=0,j= length -1; i<s.length/2; i++,j--)
        {
           
           char temp = s[i];
            s[i]= s[j];
            s[j]= temp;
        }
        
        for(int i=0; i< s.length; i++)
        {
            System.out.print(s[i]);
        }
    }

    
    public static void main(String args[]) {
      
      char[] s = {'n','e','h','a'};
       reverseString(s);
    
    }
}