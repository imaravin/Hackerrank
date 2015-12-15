import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   // static int[100000][100000];

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int sum=s.nextInt();
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println(coin(sum,arr));
    }
       static public long coin(int total, int arr[]){
        
        long temp[][] = new long[arr.length+1][total+1];
        
        for(int i=0; i <= arr.length; i++){
            temp[i][0] = 1;
        }
        
        for(int i=1; i <= arr.length; i++){
            for(int j=1; j <= total ; j++){
                if(arr[i-1] > j){
                    temp[i][j] = temp[i-1][j];
                }
                else{
                    temp[i][j] = temp[i][j-arr[i-1]] + temp[i-1][j];
                }
            }
        }
        return temp[arr.length][total];
    }
}