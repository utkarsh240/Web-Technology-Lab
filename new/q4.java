import java.util.Scanner;

class q4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for circle, 2 for square, 3 for triangle");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter radius");
                int r = sc.nextInt();
                System.out.println("Area of circle is " + (3.14 * r * r));
                break;
            case 2:
                System.out.println("Enter side");
                int s = sc.nextInt();
                System.out.println("Area of square is " + (s * s));
                break;
            case 3:
                System.out.println("Enter base and height");
                int b = sc.nextInt();
                int h = sc.nextInt();
                System.out.println("Area of triangle is " + (0.5 * b * h));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
