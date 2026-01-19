 class Addition {
    

    public static int power(int base,int pow)
    {
        
        int mul = 1 ; 
        for(int i=1 ; i<=pow ;i++)
        {
           mul = mul * base;
        }

        return mul;
    }

    public static void main(String[] args) {
        

      int ans =  power(5,3);

      System.out.println(ans);
    }
}


