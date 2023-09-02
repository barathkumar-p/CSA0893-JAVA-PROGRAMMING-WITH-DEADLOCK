import java.util.*;
public class sumofseries{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i=1,j=0;
        System.out.println("Enter the number:");
        int n=scanner.nextInt();
        while(i<n){
            i=i+1;
            j=j+i;
        }
        System.out.println("sum of series:"+j);

    }
}

