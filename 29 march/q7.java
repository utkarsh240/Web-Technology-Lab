/*Write a Java program to generate an
 ArrayIndexOutofBoundsException and handle it using 
 catch statement. */

import java.io.*;
import java.util.*;

public class q7

{
    public static void main(String[] args) {
        try
        {
            int a[] = new int[5];
            a[10] = 10;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}