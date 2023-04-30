import java.util.Scanner;
class Account
{
    int acc_no;
    double balance;
    void display()
    {
        System.out.println("Account number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}

class Person extends Account
{
    String name;
    int aadhar_no;
    void display()
    {
        super.display();
        System.out.println("Name: "+name);
        System.out.println("Aadhar number: "+aadhar_no);
    }
}

class Q1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Person p[]=new Person[5];
        for(int i=0;i<5;i++)
        {
            p[i]=new Person();
            System.out.println("Enter account number: ");
            p[i].acc_no=sc.nextInt();
            System.out.println("Enter balance: ");
            p[i].balance=sc.nextDouble();
            System.out.println("Enter name: ");
            p[i].name=sc.next();
            System.out.println("Enter aadhar number: ");
            p[i].aadhar_no=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            p[i].display();
        }
    }
}
