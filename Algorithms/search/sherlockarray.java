import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int m=0;m<T;m++)
            {
             int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        
            int li=0;
            int ri=n-1;
            int lsum=arr[li];
            int rsum=arr[ri];
            while(li!=ri)
                {
                if(lsum<rsum)
                    {
                lsum+=arr[++li];
                }
                else
                    {
                rsum+=arr[--ri];
                }
            }
            System.out.println(lsum==rsum?"YES":"NO");
                
               
        }
        
    }
    
    
}