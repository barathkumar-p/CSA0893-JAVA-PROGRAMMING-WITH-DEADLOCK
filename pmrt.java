class A 
{
    public void display()
    {
        System.out.println("Base");
    }
}

class B extends A
{  
    public void display()
    {
        System.out.println("Decimal");
    }

}
class pmrt
{
    public static void main(String args[])
    {
        B b=new B();
        b.display();
        //b.display1();

    }
}