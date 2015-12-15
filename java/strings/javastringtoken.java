 import java.io.*;
    import java.util.*;



    public class Solution {

      
        public static void main(String[] args) 
        {

      
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
         //   System.out.println(s);
           char arr[]=s.toCharArray();
            StringBuffer sb=new StringBuffer();
            ArrayList<String> list=new ArrayList<String>();
            boolean pre=false;
            for(char x:arr)
                {
                if(Character.isLetter(x)){
                    pre=true;
                sb.append(x);
                }
                else if(pre){
                list.add(new String(sb));
                    sb=new StringBuffer();
                    pre=false;
                }
            }
            if(new String(sb).compareTo("")!=0)
            list.add(new String(sb));
            System.out.println(list.size());
            for(String x:list)
                System.out.println(x);

        }
    }
