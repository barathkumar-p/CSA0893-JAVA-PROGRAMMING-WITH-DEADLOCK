import java.io.*;
import java.util.*;
class A implements Runnable{
    public void run(){
        System.out.println("S");
    }
}
class runable
{
    public static void main(String [] args){
        A b=new A();
        Thread t=new Thread(b);
        t.start();
    }
}