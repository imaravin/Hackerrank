import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  

        

        
    private static final void recursiveStones(StringBuilder sb, int stones, int a, int b) {
        if (a == b) {
            sb.append(a * stones).append(" ");
        } else {
            recursiveStones(sb, stones, 0, Integer.MIN_VALUE, new int[]{a, b});
        }
    }

    private static final void recursiveStones(StringBuilder sb, int stones, int acc, int curr, int[] types) {
        if (stones <= 0) {
            sb.append(acc).append(" ");
        } else {
            for (int t : types) {
                if (t >= curr) {
                    recursiveStones(sb, stones - 1, acc + t, t, types);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = Integer.parseInt(in.nextLine());

        for (int i = 0; i < tests; i++) {
            int stones = Integer.parseInt(in.nextLine()) - 1;
            int n1 = Integer.parseInt(in.nextLine());
            int n2 = Integer.parseInt(in.nextLine());

            StringBuilder sb = new StringBuilder();
            recursiveStones(sb, stones, Math.min(n1, n2), Math.max(n1, n2));
            System.out.println(sb);
        }
    }


}