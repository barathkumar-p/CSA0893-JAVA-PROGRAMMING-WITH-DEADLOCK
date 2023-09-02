import java.util.*;
public class Triangle {
     double side1,side2,side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean isRight() {
        double[] sides = { side1, side2, side3 };
        Arrays.sort(sides);
        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
    }

    public boolean isScalene() {
        return side1 != side2 && side2 != side3 && side1 != side3;
    }

    public boolean isIsosceles() {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    public boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter side 1:");
        double side1=s.nextDouble();
        System.out.println("enter side 2:");
        double side2=s.nextDouble();
        System.out.println("enter side 3:");
        double side3=s.nextDouble();

        Triangle triangle = new Triangle(side1,side2,side3);

        System.out.println(triangle.isRight());       // true
        System.out.println(triangle.isScalene());     // true
        System.out.println(triangle.isIsosceles());   // false
        System.out.println(triangle.isEquilateral()); // false
    }
}
