import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("first number");
                int x = sc.nextInt();
                System.out.println("second number");
                int y = sc.nextInt();
                System.out.println("third number");
                int z = sc.nextInt();
                if(x>y && x>z){
                    System.out.println(x+" is the largest number");
                }
                else if(y>x && y>z){
                    System.out.println(y+" is the largest number");
                }
                else{
                    System.out.println(z+" is the largest number");
                }
            }
        }
        

