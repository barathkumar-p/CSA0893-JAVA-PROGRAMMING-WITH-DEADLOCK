class Student
{
    public void display2(){
        System.out.println("Roll no");
         System.out.println("192121040");
    }
}
class Test extends Student{
    public void display1(){
        int eng=85;
        int tamil=90;
        int sci=100;
        int mat=50;
        int soc=100;
        int total=eng+tamil+sci+mat+soc;
    }
}
class Result extends Test{
    public void display(){
        System.out.println(total);
    }
}

class Studentclass{
    Result c=new Result();
    c.display();
}
