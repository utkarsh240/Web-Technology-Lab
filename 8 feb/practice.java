import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] numb = { 2, 7, 7, 5 };
        System.out.println(Arrays.toString(numb));
        change(numb);
        System.out.println(Arrays.toString(numb));

    }

    static void change(int[] arr) {
        arr[0] = 14;
    }
}
