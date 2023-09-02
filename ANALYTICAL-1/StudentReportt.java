import java.util.*;
public class StudentReportt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the user number:");
        int userNo = s.nextInt();
        System.out.println("Enter the user name:");
        String userName = s.next();
        int marks[] = new int[5];
        System.out.println("Enter the 5 subject marks:");
        boolean passmark= true;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the subject " + (i + 1) + ": ");
            marks[i] = s.nextInt();
            if (marks[i] < 50) {
                passmark = false;
            }
        }
        if (passmark) {
            double sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += marks[i];
            }
        double avg = sum / 5;
        System.out.println("Average of 5 subjects: " + avg);
            if (avg > 90) {
                System.out.println("Grade S");
            } 
            else if (avg > 81) {
                System.out.println("Grade A");
            }
            else if (avg > 71) {
                System.out.println("Grade B");
            }
            else if (avg > 61) {
                System.out.println("Grade C");
            }
            else if (avg > 51) {
                System.out.println("Grade D");
            }
            else {
            System.out.println("student failed!");
        }
    }
}
}
