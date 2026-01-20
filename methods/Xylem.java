 class Xylem {
    public static void main(String[] args) {
        int num = 12326;

        int lastdigit = num % 10 ;
        num = num / 10 ;

        int middleSum = 0 ; 

        while(num > 9)
        {
            int ld = num % 10 ; 

            middleSum = middleSum + ld;

            num = num / 10 ;
        }

        int sum = num + lastdigit ;

        System.out.println("first digit is : "+num);
        System.out.println("last digit is : "+lastdigit);
        System.out.println("first and last add result "+sum);
        System.out.println("middle digits sum is : "+middleSum);

        if(middleSum == sum)
            System.out.println("it is xylem number");
        else
            System.out.println("it is not xylem number");
    }
}
