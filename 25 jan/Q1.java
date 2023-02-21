
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sqrt(num));
    }

    public static double sqrt(int num) {
        double t;
        double sqrtroot = num / 2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (num / t)) / 2;
        } while ((t - sqrtroot) != 0);
        return sqrtroot;
    }
}
