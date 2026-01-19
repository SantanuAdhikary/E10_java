import java.util.Scanner;
class Strongnumber
{
    static Scanner sc = new Scanner(System.in);
    public static int factorial(int num)
    {
            int fact = 1 ; 

            for(int i=1 ; i<=num ; i++)
            {
                fact = fact * i ; 
            }

            return fact;
    }
    public static void main(String[] args) {
        
        System.out.print("enter one number : ");
        int num = sc.nextInt() ;
        int sum = 0 ;
        int originalNum = num;
        while(num>0)
        {
            int ld = num % 10 ; 

            sum = sum + factorial(ld);

            num = num / 10 ;
        }

        System.out.println("sum is : "+sum);

        if(originalNum == sum)
            System.out.println("it is strong number");
        else
            System.out.println("it is not strong number");

    }
}