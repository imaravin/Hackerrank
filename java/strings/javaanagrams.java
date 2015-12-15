import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
       if(A.length()!=B.length())
           return false;
       A=A.toLowerCase();
       B=B.toLowerCase();
     char a[]=A.toCharArray();
       char b[]=B.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       for(int i=0;i<A.length();i++)
           if(a[i]!=b[i])
           return false;
           return true;
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
