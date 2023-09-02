import java.util.*;
class Prime{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        
        boolean isprime(n){
            if (n<1){
                return false;
            }
        
            for (int i=2;i<n;i++){
                if (n%i==0){
                    return false;
                }
            return True;

        }
        System.out.println(isprime(n));
        }

    }
}