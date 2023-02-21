import java.util.Scanner;

class Number
{
    int n;
    int a[];
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
    }
    void swap()
    {
        int max = a[0];
        int min = a[0];
        int maxpos = 0;
        int minpos = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
                maxpos = i;
            }
            if(a[i]<min)
            {
                min = a[i];
                minpos = i;
            }
        }
        int temp = a[maxpos];
        a[maxpos] = a[minpos];
        a[minpos] = temp;
    }
    void display()
    {
        System.out.println("The elements are");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}

public class q5
{
    public static void main(String[] args) {
        Number obj = new Number();
        obj.read();
        obj.swap();
        obj.display();
    }
}
