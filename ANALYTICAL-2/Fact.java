import java.util.*; 
class Fact{
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println("Enter the position of n:");
        int p=s.nextInt();
        System.out.println("THe factors are:");
        for (int i=1; i<=n; i++){
           if(n%i==0){
               System.out.println(i);
           }
        int[] factors = new int[n];
        System.out.println(factors);

        }
    }

}
