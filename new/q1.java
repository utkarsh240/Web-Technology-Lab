import java.util.Scanner;

class Area
{
    double area(double r)
    {
        return 3.14*r*r;
    }
    double area(double l,double b)
    {
        return l*b;
    }
    double area(double a,double b,double c)
    {
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

public class q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Area a=new Area();
        System.out.println("Enter 1 for circle, 2 for triangle, 3 for square");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter radius");
            double r=sc.nextDouble();
            System.out.println("Area of circle is "+a.area(r));
            break;
            case 2:
            System.out.println("Enter sides of triangle");
            double s1=sc.nextDouble();
            double s2=sc.nextDouble();
            double s3=sc.nextDouble();
            System.out.println("Area of triangle is "+a.area(s1,s2,s3));
            break;
            case 3:
            System.out.println("Enter sides of square");
            double s=sc.nextDouble();
            System.out.println("Area of square is "+a.area(s,s));
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}
