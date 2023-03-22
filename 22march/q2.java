

import java.util.Scanner;

interface Motor
{
    int capacity=100;
    void run();
    void consume();
}

class WashingMachine implements Motor
{
    public void run()
    {
        System.out.println("Washing Machine is running");
    }
    public void consume()
    {
        System.out.println("Washing Machine is consuming "+capacity+" units of electricity");
    }
}

public class q2
{
    public static void main(String[] args)
    {
        WashingMachine obj=new WashingMachine();
        obj.run();
        obj.consume();
    }
}
