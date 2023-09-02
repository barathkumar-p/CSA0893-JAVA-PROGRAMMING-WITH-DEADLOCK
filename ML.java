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
    return "Parent";
}    
}

class C extends B
{
    public static void display2()
{    System.out.println("grandchild");
}
}
class ML
{
    public static void main(String args[]){
        C c=new C();
        c.display();
        c.display1();
        c.display2();

    } 
}