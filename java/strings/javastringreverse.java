import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char arr[]=A.toCharArray();
        boolean flag=true;
        for(int i=0,j=arr.length-1;i<A.length()/2-1;i++,j--)
            if(arr[i]!=arr[j])
            {
            flag=false;
            break;
        }
        System.out.println(flag?"Yes":"No");
        
    }
}
