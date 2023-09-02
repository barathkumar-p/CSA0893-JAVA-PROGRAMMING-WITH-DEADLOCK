import java.util.*;
public class studentreport{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the user number:");
        int userno=s.nextInt();
        System.out.println("Enter the user name:");
        String username=s.nextInt();
        System.out.println("Enter the 5 subject marks:");
        for(int i=0;i<=5;i++){
             System.out.println("Enter the subject1:");
             int s1=s.nextInt();
             System.out.println("Enter the subject2:");
             int s2=s.nextInt();
             System.out.println("Enter the subject3:");
             int s3=s.nextInt();
             System.out.println("Enter the subject4:");
             int s4=s.nextInt();
             System.out.println("Enter the subject5:");
             int s5=s.nextInt();
        }

        
        if (s1>50){
            Double avg=(s1+s2+s3+s4+s5)/5;
            System.out.println("Average of 5 subject"+avg);

        }
        if (avg>90){
            system.out.println("grade S");
        }
        else if (avg>90){
            System.out.println("grade A");
        }
        else if (avg>80){
            System.out.println("grade B");
        }
        else if (avg>70){
            System.out.println("grade C");
        }
        else if (avg>60){
            System.out.println("grade D");
        }
        else if (60<avg >51){
            System.out.println("grade E");
        }
        else if (avg <50){
            System.out.println("grade F");
        }
        else{
            System.out.println("INVALID INPUT");
        }
    }
}
