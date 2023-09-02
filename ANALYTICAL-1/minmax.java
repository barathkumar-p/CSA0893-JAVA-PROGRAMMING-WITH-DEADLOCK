import java.util.*;
public class minmax{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=s.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++){
            array[i]=s.nextInt();
        

        int min=array[0];
        int max=array[0];

        for(i=1;i<size;i++){
            if (array[i]>max){
                max=array[i];
            }else if (array[i]<min){
                min=array[i];
            }
        }
        int sum=max+min;
        System.out.println("The max number"+max);
        System.out.println("The min number"+min);
        System.out.println("The sum of max anfd min number"+sum);
        }
    }
}