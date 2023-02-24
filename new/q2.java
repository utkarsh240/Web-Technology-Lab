import java.util.Scanner;

class Rectangle
{
    int length, breadth;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        length = sc.nextInt();
        breadth = sc.nextInt();
    }
    void calculate()
    {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("Area of rectangle is " + area);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
    void display()
    {
        System.out.println("Length of rectangle is " + length);
        System.out.println("Breadth of rectangle is " + breadth);
    }
}

class q2
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        r.read();
        r.calculate();
        r.display();
    }
}
