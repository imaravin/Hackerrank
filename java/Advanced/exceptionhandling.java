class myCalculator
    {
    public String power(int a,int b) 
        {
        if(a<0||b<0)
            return "java.lang.Exception: n and p should be non-negative";
        else
            return new Integer((int)Math.pow(a,b)).toString();
        
    }
}