import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>=1?"Yes":"No");
        char arr[]=A.toCharArray();
        arr[0]=Character.toUpperCase(arr[0]);
        System.out.print(arr);
        char ar[]=B.toCharArray();
        ar[0]=Character.toUpperCase(ar[0]);
        System.out.print(" ");
        System.out.println(ar);
        
    }
}
