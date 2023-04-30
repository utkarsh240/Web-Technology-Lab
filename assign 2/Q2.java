import java.util.Scanner;

class Shape
{
    void draw()
    {
        System.out.println("Drawing Shape");
    }
    void erase()
    {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
    void erase()
    {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Triangle");
    }
    void erase()
    {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape
{
    void draw()
    {
        System.out.println("Drawing Square");
    }
    void erase()
    {
        System.out.println("Erasing Square");
    }
}

class Q2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Shape s;
        Circle c=new Circle();
        Triangle t=new Triangle();
        Square sq=new Square();
        System.out.println("Enter 1 for circle, 2 for triangle, 3 for square: ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                s=c;
                break;
            case 2:
                s=t;
                break;
            case 3:
                s=sq;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        s.draw();
        s.erase();
    }
}


