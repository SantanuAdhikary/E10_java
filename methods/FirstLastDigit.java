 class FirstLastDigit {
    public static void main(String[] args) {
        
        int n = 9825;

        int lastdigit = n % 10 ;

        while(n>9)
        {
            n = n / 10 ;
        }
        System.out.println("last digit is : "+lastdigit);
        System.out.println("first digit is : "+n);
    }
}
