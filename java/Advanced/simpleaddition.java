class Add
    {
    public void add(int...arr)
        {
        int l=arr.length;
        int sum=0;
        for(int i=0;i<l-1;i++)
            {
            System.out.print(arr[i]);
            System.out.print("+");
            sum+=arr[i];
        }
        System.out.print(arr[l-1]);
        System.out.print("=");
        System.out.println(sum+=arr[l-1]);
    }
}