import java.util.Scanner;

class Shape
{
    double area;
    void showArea()
    {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape
{
    double radius;
    void getRadius()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }
    void calculateArea()
    {
        area = 3.14 * radius * radius;
    }
}

class Rectangle extends Shape
{
    double length, breadth;
    void getLengthBreadth()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }
    void calculateArea()
    {
        area = length * breadth;
    }
}

public class q3
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.getRadius();
        c.calculateArea();
        c.showArea();
        r.getLengthBreadth();
        r.calculateArea();
        r.showArea();
    }
}
