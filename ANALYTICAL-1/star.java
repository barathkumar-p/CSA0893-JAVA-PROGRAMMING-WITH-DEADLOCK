import java.util.*;
public class star{

    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int totalCount = 0;
        
        System.out.print("Enter a string: ");
        
        do {
            String inp = s.nextLine();
        } 
        while (inp == "*");
        
        for (int i = 0; i < inp.length(); i++) {
            char c = inp.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }
        System.out.println("Total number of uppercase"+uppercaseCount);
        System.out.println("Total number of lowercase"+lowercaseCount);
    }
}
