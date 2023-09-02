import java.util.*;
public class bonus{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the employee name");
        String empn=s.nextLine();
        System.out.println("Enter the employee grade A or B");
        String empg=s.nextLine();
        System.out.println("Enter the employee emps");
        Double emps=s.nextDouble();
    
    if(empg=="A"){
        Double bonus=emps*0.5;
        Double bemps=emps+bonus;
       
        if(emps<10000){
           bonus=emps*0.7;
           bemps=emps+bonus;
    
    }
    }
    else if(empg=="B"){
         bonus=emps*0.10;
         bemps=emps+bonus;
        if(emps<10000){
             bonus=emps*0.12;
             bemps=emps+bonus;
        }
    }
    System.out.println("Bonus of the employee with grade "+ bonus);
    System.out.println("bonus added emps of the employee with grade "+ bemps);

    }
}