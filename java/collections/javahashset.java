import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        HashSet<String> hash=new HashSet<String>();
        s.nextLine();
        for(int i=0;i<n;i++)
            {
            hash.add(s.nextLine());
            System.out.println(hash.size());
        }
    }
}