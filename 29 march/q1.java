
import java.util.Scanner;

class NegativeNumberException extends Exception
{
    public NegativeNumberException(String s)
    {
        super(s);
    }
}

class ProcessInput
{
    public void ProcessInput() throws NegativeNumberException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n<0)
        {
            throw new NegativeNumberException("Negative Number");
        }
        else
        {
            System.out.println("Double value is "+(n*2));
        }
    }
}

public class q1
{
    public static void main(String[] args) {
        ProcessInput p = new ProcessInput();
        try
        {
            p.ProcessInput();
        }
        catch(NegativeNumberException e)
        {
            System.out.println(e);
        }
    }
}
