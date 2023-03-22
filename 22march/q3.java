

import java.util.Scanner;

interface Salary
{
    void earnings();
    void deductions();
    void bonus();
}

class Manager implements Salary
{
    int basic;
    public void earnings()
    {
        System.out.println("Earnings: "+(basic+(0.8*basic)+(0.15*basic)));
    }
    public void deductions()
    {
        System.out.println("Deductions: "+(0.12*basic));
    }
    public void bonus()
    {
        System.out.println("Bonus: "+(0.5*basic));
    }
}

class SubStaff extends Manager
{
    public void bonus()
    {
        System.out.println("Bonus: "+(0.5*basic));
    }
}

public class q3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        SubStaff obj=new SubStaff();
        System.out.print("Enter basic salary: ");
        obj.basic=sc.nextInt();
        obj.earnings();
        obj.deductions();
        obj.bonus();
    }
}

