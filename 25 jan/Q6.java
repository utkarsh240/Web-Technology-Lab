import java.util.Scanner;

public class Q6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("Highest mark  "+max);
        System.out.println("Average mark  "+(sum/n));
    }
}