import java.util.*;
public class sumofeven{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i=1,sum=0;
        System.out.println("Enter the number:");
        int n=scanner.nextInt();
        while(i<=n){
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("sum of series:"+sum);

    }
}

