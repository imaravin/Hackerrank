import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        try
            {
            String a=s.next();
            String b=s.next();
            Integer aa=Integer.parseInt(a);
            Integer bb=Integer.parseInt(b);
            System.out.println(aa/bb);
        }
        catch(ArithmeticException e)
            {
            System.out.println("java.lang.ArithmeticException: / by zero");
            
        }
        catch(InputMismatchException e)
            {
            System.out.println("java.util.InputMismatchException");
            
        }
        catch(NumberFormatException e)
            {
            //System.out.println("A");
            System.out.println("java.util.InputMismatchException");
            
        }
    }
}