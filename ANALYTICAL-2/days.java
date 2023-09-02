import java.util.*;
class days{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the number of days:");
        int d = s.nextInt();
        int year = d/365;
        int e =d%365;
        int week= e/7;
        int day=e%7;
        System.out.println("Number of years"+ year);
        System.out.println("Number of weeks"+ week);
        System.out.println("number of days"+ day );


    }
}

