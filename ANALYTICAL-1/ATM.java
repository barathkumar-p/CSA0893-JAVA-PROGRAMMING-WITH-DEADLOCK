import java.utils.*;
public class ATM{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b,c,d,sum;
        System.out.println("ENter the number of 2000 notes:");
        a=s.nextInt();
        System.out.println("ENter the number of 500 notes:");
        b=s.nextInt();

        System.out.println("ENter the number of 200 notes:");
        c=s.nextInt();

        System.out.println("ENter the number of 100 notes:");
        d=s.nextInt();
        sum=(a*2000)+(b*500)+(c*200)+(d*100);
        System.out.println("total balance:"+sum);

    }
}