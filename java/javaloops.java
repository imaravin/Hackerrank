import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
            {
            
            int a=s.nextInt();
            int b=s.nextInt();
            int n=s.nextInt();
            int ans=a;
            for(int i=0;i<n;i++)
                {
                ans+=((int)Math.pow(2,i))*b;
                System.out.print(ans+" ");
            }
            System.out.println("");
        }
    }
}