import java.util.*;

public class StudentReport {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the user number:");
        int userNo = s.nextInt();
        System.out.println("Enter the user name:");
        String userName = s.next();
        int[] marks = new int[5];
        System.out.println("Enter the 5 subject marks:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the subject" + (i + 1) + ": ");
            marks[i] = s.nextInt();
        }

        if (marks[i]>50){
        double avg = calculateAverage(marks);
        System.out.println("Average of 5 subjects: " + avg);
        }
        if (avg > 90) {
            System.out.println("Grade S");
        } 
        else if (avg > 80) {
            System.out.println("Grade A");
        } 
        else if (avg > 70) {
            System.out.println("Grade B");
        } 
        else if (avg > 60) {
            System.out.println("Grade C");
        } 
        else if (avg > 50) {
            System.out.println("Grade D");
        } 
        else if (avg > 40) {
            System.out.println("Grade E");
        }
         else {
            System.out.println("Grade F");
        }
    }

    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
