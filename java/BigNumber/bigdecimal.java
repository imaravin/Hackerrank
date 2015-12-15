import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sm[] arr=new sm[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=new sm();
            arr[i].str=sc.next();
            arr[i].val=new BigDecimal(arr[i].str);
        }
        Arrays.sort(arr,new Comparator<sm>(){
            public int compare(sm a,sm b)
                {
                return b.val.compareTo(a.val);
            }
        });

        //Write your code here
      
      
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i].str);
        }

    }


}
      class sm
    {
    public BigDecimal val;
    public String str;
}

