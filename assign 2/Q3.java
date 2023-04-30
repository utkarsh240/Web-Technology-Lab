import java.util.Scanner;

abstract class TwoDshape
{
    private double width,height;
    private String name;
    TwoDshape()
    {
        width=height=0;
        name="none";
    }
    TwoDshape(double w,double h,String n)
    {
        width=w;
        height=h;
        name=n;
    }
    double getWidth()
    {
        return width;
    }
    double getHeight()
    {
        return height;
    }
    void setWidth(double w)
    {
        width=w;
    }
    void setHeight(double h)
    {
        height=h;
    }
    String getName()
    {
        return name;
    }
    void setName(String n)
    {
        name=n;
    }
    void showDimensions()
    {
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
    abstract double area();
}

class Triangle extends TwoDshape
{
    Triangle()
    {
        super();
    }
    Triangle(double w,double h,String n)
    {
        super(w,h,n);
    }
    double area()
    {
        return getWidth()*getHeight()/2;
    }
}

class Rectangle extends TwoDshape
{
    Rectangle()
    {
        super();
    }
    Rectangle(double w,double h,String n)
    {
        super(w,h,n);
    }
    double area()
    {
        return getWidth()*getHeight();
    }
}

class Q3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width of triangle: ");
        double w=sc.nextDouble();
        System.out.println("Enter height of triangle: ");
        double h=sc.nextDouble();
        System.out.println("Enter name of triangle: ");
        String n=sc.next();
        Triangle t=new Triangle(w,h,n);
        System.out.println("Enter width of rectangle: ");
        w=sc.nextDouble();
        System.out.println("Enter height of rectangle: ");
        h=sc.nextDouble();
        System.out.println("Enter name of rectangle: ");
        n=sc.next();
        Rectangle r=new Rectangle(w,h,n);
        System.out.println("Area of triangle: "+t.area());
        System.out.println("Area of rectangle: "+r.area());
    }
}
