class BinaryToDecimal {

    public static int convertDecimal(int binary)
    {
             int decimal =0;
             int base = 1 ;

             while(binary>0)
             {
                int lastdigit = binary % 10 ;

                decimal = decimal + lastdigit * base ; 
                binary = binary / 10 ;
                base = base * 2;
             }
             return decimal;

    }
    
    public static void main(String[] args) {
        
       int binary = 1010;

       int ans=  convertDecimal(binary);

       System.out.println(ans);
    }
}
