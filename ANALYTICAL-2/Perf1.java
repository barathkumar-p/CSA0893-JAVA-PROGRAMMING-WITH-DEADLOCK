class Perf1{
    public static void main(String args[]){
        int i;
        int a=0;
        for (i=1;i<10;i++){
            int p=i*i;
            System.out.println("Square of  "+i+"num  "+p);
            if (p<10){
                a=a+p;
            }
        }
        System.out.println("Sum of num"+a);
        
    }
}