class Method
{
    int area(int x)
    {
        return x*x;
    }
    float area(float y)
    {
        return y*y;
    }
    float area(int a,float b)
    {
        return a*b;
    }
    float area(float x,float y)
    {
        return x*y;
    }
}
class polymorphism{
    public static void main(String args[]){
        Method m=new Method();
        System.out.println(m.area(5));
        System.out.println(m.area(3.5f));
        System.out.println(m.area(5,5.5f));
        System.out.println(m.area(3.5f,4.5f));
    }
}