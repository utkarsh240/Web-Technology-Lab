import java.io.*;
import java.util.*;
import java.lang.Math;

public class q2
{
    public static void main(String[] args) throws IOException
    {
        Phone p = new Phone();
        SmartPhone s = new SmartPhone();
        CellularPhone c = new CellularPhone();
        p.on();
        s.on();
        c.on();
    }
}   
class Phone
{
    public void on()
    {
        System.out.println("Phone is on");
    }
}
class SmartPhone extends Phone
{
    public void on()
    {
        System.out.println("SmartPhone is on");
    }
}
class CellularPhone extends Phone
{
    public void on()
    {
        System.out.println("CellularPhone is on");
    }
}
