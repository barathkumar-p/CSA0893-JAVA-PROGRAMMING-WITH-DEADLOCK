import java.util.*;
class cal{
    public int PerfectSquare(int n)
    {
        for (int i=1; i<=n; i++)
        {
            if (math.sqrt(i) == (int)math.sqrt(i))
            {
                System.out.println(i);
            }
        }
    }
}



class Perf{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        cal c=new cal();
        System.out.println(c.PerfectSquare(n));   


    }
}