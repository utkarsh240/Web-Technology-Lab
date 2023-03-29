/*Write a java program to justify “A subclass exception 
 must appear before super-class exception”. */

import java.io.*;
import java.util.*;

public class q6

{
    public static void main(String[] args) {
        try
        {
            int a[] = new int[5];
            a[10] = 10;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

