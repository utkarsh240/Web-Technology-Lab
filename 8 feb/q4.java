import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape: ");
        String shape = sc.nextLine();
        if (shape.equals("circle")) {
            System.out.println("Enter the radius: ");
            double radius = sc.nextDouble();
            double area = 3.14 * radius * radius;
            System.out.println("Area of circle is: " + area);
        } else if (shape.equals("square")) {
            System.out.println("Enter the side: ");
            double side = sc.nextDouble();
            double area = side * side;
            System.out.println("Area of square is: " + area);
        } else if (shape.equals("triangle")) {
            System.out.println("Enter the base: ");
            double base = sc.nextDouble();
            System.out.println("Enter the height: ");
            double height = sc.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("Area of triangle is: " + area);
        } else {
            System.out.println("Invalid shape");
        }
    }
}