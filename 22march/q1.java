
import java.util.Scanner;

abstract class Student
{
    int rollno,regno;
    abstract void course();
}

class Kiitian extends Student
{
    public void course()
    {
        System.out.println("Course: B.Tech");
    }
}

public class q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Kiitian obj=new Kiitian();
        System.out.print("Enter roll no: ");
        obj.rollno=sc.nextInt();
        System.out.print("Enter reg no: ");
        obj.regno=sc.nextInt();
        obj.course();
    }
}


