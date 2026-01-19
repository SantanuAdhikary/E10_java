 class DecimalToBinary {
    

    public static String convertBinary(int decimal)
    {

          String binary = "";

          while(decimal>0)
          {
             int rem = decimal % 2 ; 

            binary = rem+ binary ;

             decimal = decimal / 2 ;
          }

          return binary;
    }
    public static void main(String[] args) {
        int decimal = 12; 

       String ans =  convertBinary(decimal);

       System.out.println(ans);
    }
}
