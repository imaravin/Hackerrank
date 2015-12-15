import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int n=s.nextInt();
        ArrayList<String> arr=new ArrayList<String>();
        for(int i=0;i+n<str.length()+1;i++)
            arr.add(str.substring(i,n+i));
        Collections.sort(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size()-1));
        
    }
}