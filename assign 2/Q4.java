/*serialization is the process of converting an object into a stream of bytes to store the object or transmit it to memory, a database, or a file. Its main purpose is to save the state of an object in order to be able to recreate it when needed.

 */

import java.io.*;
import java.util.Scanner;

class Employee implements Serializable
{
    String name;
    int emp_id;
    double salary;
    Employee()
    {
        name="none";
        emp_id=0;
        salary=0;
    }
    Employee(String n,int id,double s)
    {
        name=n;
        emp_id=id;
        salary=s;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Salary: "+salary);
    }
}

class Q4
{
    public static void main(String args[]) throws IOException,ClassNotFoundException
    {
        Scanner sc=new Scanner(System.in);
        Employee e[]=new Employee[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter name: ");
            String n=sc.next();
            System.out.println("Enter employee ID: ");
            int id=sc.nextInt();
            System.out.println("Enter salary: ");
            double s=sc.nextDouble();
            e[i]=new Employee(n,id,s);
        }
        FileOutputStream fos=new FileOutputStream("employee.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        for(int i=0;i<10;i++)
        {
            oos.writeObject(e[i]);
        }
        oos.close();
        fos.close();
        FileInputStream fis=new FileInputStream("employee.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Employee e1[]=new Employee[10];
        for(int i=0;i<10;i++)
        {
            e1[i]=(Employee)ois.readObject();
        }
        ois.close();
        fis.close();
        System.out.println("Enter salary range: ");
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        for(int i=0;i<10;i++)
        {
            if(e1[i].salary>=s1 && e1[i].salary<=s2)
            {
                e1[i].display();
            }
        }
    }
}

