import java.util.*;   
public class Pal  
{  
   public static void main(String args[])  
   {  
      String a, reverse = "";
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number");  
      a = in.nextLine();   
      int length = a.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + a.charAt(i);  
      if (a.equals(reverse))  
         System.out.println("It is a palindrome.");  
      else  
         System.out.println("I isn't a palindrome.");   
   }  
}  