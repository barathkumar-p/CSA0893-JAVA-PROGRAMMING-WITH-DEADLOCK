import java.util.*;
class Arr{
     public static String sMethod() {
             return "HEalth is Wealth";
        }
    public static void main(String args[]){
       
        int[] n={3,5,6,9,12,45,16,17,20,23};
        //String[] ar={"HEalth is Wealth","HEalth","Wealth","invalid"};

        for (int i=0;i<10;i++){
            if(n[i]%3==0 && n[i]%5==0){
               // System.out.println("HEalth is Wealth");
                String s= sMethod();
                System.out.println(s);
             }
            
        /*
            else if(n[i]%3==0){
                //System.out.println("HEalth");
                return ar[1];
            }
            else if(n[i]%5==0){
                //System.out.println("Wealth");
                return ar[2];
            }
            else{
               
               return ar[3];
            }*/
        }

    }
}