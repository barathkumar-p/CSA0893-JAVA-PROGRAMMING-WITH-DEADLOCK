class staff
{
    public void display(){
        System.out.println("Code");
        System.out.println("Name");
    }
}
class Teacher extends staff
{
    public void display1(){
        System.out.println("subject");
        System.out.println("Publications");
    }
}
class typist extends staff
{
    public void display2(){
        System.out.println("Speed");
    }
}
class officer extends staff
{
    public void display3(){
        System.out.println("grade");
    }
}
class regular extends typist
{
    public void display4(){
        System.out.println("salary");
    }
}
class casual extends typist
{
    public void display5(){
        System.out.println("Daily wages");
    }
}

class college{
    public static void main(String args[]){
        casual c=new casual();
        c.display();
        c.display1();
        //c.display2();
        //c.display4();
        //c.display5();
    }
}