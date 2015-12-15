import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        ArrayList<String[]> arr=new ArrayList<String[]>();
        int n=s.nextInt();
        s.nextLine();
        for(int i=0;i<n;i++)
            {
            String x=s.nextLine();
            arr.add(x.split(" "));
        }
        n=s.nextInt();
        for(int i=0;i<n;i++)
            {
            int x=s.nextInt();
            int y=s.nextInt();
            try{
                System.out.println(arr.get(x-1)[y]);
            }
            catch(Exception e)
                {
                System.out.println("ERROR!");
            }
        }
    }
}