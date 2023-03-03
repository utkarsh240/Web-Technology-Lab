import java.util.Scanner;
class Account
{
    int acc_no;
    double balance;
    Account(int acc_no,double balance)
    {
        this.acc_no=acc_no;
        this.balance=balance;
    }
    void disp()
    {
        System.out.println("Account number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}

class Person extends Account
{
    String name;
    int aadhar_no;
    Person(int acc_no,double balance,String name,int aadhar_no)
    {
        super(acc_no,balance);
        this.name=name;
        this.aadhar_no=aadhar_no;
    }
    void disp()
    {
        super.disp();
        System.out.println("Name: "+name);
        System.out.println("Aadhar number: "+aadhar_no);
    }
}

public class q4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Person[] p=new Person[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter account number, balance, name and aadhar number of person "+(i+1));
            p[i]=new Person(sc.nextInt(),sc.nextDouble(),sc.next(),sc.nextInt());
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("Details of person "+(i+1));
            p[i].disp();
        }
    }
}

