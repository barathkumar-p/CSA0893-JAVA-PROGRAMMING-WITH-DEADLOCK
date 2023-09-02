class P
{
    int x=10;
    public void display()
{
    System.out.println("10");
}
}

class C extends P
{
    int y=15;
    public void display1()
{
    System.out.println("5");
}    
}

class inher
{
    public static void main(String args[])
{
C c=new C();
c.display1();
c.display();
}
}