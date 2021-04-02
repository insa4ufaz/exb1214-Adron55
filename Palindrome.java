public class Palindrome{
    public static boolean is_palindrome(String s)
    {
        // add your code here
      String rvr = ""; // Objects of String class  
      int length = s.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         rvr = rvr + s.charAt(i);  
      if (s.equals(rvr))  
         return true;  
      else  
         return false;
    }
}
