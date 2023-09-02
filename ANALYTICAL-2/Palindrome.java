import java.util.*;
class Palindrome{
    public static void main(String args[]){
        System.out.println("ENter the number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int m=n;
        int rev=0;
        while (m !=0){
            int rem=m%10;
            rev =rev*10 + rem;
            m=m/10;
        }
        System.out.println(rev);

        int a = n + rev;
        int f=a;
        System.out.println(a);

        int r=0;
        while (a !=0){
            int rema=a%10;
            r =r*10 + rema;
            a=a/10;
        }
        if (f==r){
            System.out.println("The given number is palindrome");
        }else{
            System.out.println("The given number is not palindrome");

        }

    }
}