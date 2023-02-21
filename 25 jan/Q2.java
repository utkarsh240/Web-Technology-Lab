
public class Q2 {
    public static void main(String[] args) {
        int radius = 25;
        System.out.println("Perimeter of circle: " + perimeter(radius));
        System.out.println("Area of circle: " + area(radius));
    }

    public static double perimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    public static double area(int radius) {
        return Math.PI * radius * radius;
    }

    
}
