class A
{    
    public void display()
{
    System.out.println("Parent");
}
}

class B extends A
{
    public void display1()
{
    System.out.println("Child");
}    
}

class C extends B
{
    public static void display2()
{    System.out.println("grandchild");
}
}

class D extends P
{
    public void display3(){
        System.out.println("Heir");
    }
}
class heir
{
    public static void main(String args[]){
        D d=new D();
        d.display();
        d.display1();
        d.display2();
        d.display3();

    } 
}