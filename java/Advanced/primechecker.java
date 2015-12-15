import static java.lang.System.in;
class Prime
    {
    
  
    public  void checkPrime(int... val)
        {
        for(int x:val)
            {
            boolean flag=false;
            for(int i=2;i<x;i++)
                if(x%i==0)
                flag=true;
                
                if(!flag && x!=1)
                System.out.print(x+" ");
                
                
        }
        System.out.println("");
    }

}
