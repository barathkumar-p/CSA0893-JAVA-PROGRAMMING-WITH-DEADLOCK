import java.util.*;
class shape{
    public void volume(int a,int b,int c){
        return a*b*c;
    }
    public void sarea(int a,int b,int c){
        return 2((a*b)+(b*c)+(c*a));
    }
}


public class Box{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the side a:");
        int a =s.nextInt();
        System.out.println("Enter the side a:");
        int b= s.nextInt();
        System.out.println("Enter the side a:");
        int c=s.nextInt();
        shape s=new shape();

        System.out.println("Volume:"+s.volume(a,b,c));
        System.out.println("Volume:"+s.sarea(a,b,c));


    }
}