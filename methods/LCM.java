 import java.util.*;
 class LCM {
    
    static Scanner sc = new Scanner(System.in);


    
    public static int findGcd(int a , int b)
    {
             int gcd =1 ; 

             int n = a<b ? a : b ;

             for(int i=1 ; i<=n ; i++)
             {
                if(a % i == 0 && b % i==0)
                    gcd = i;
             }


             return gcd;
    }
    public static void main(String[] args) {
         System.out.print("enter first number : ");
        int a = sc.nextInt(); 

        System.out.print("enter second number : ");
        int b = sc.nextInt(); 

        int lcm =  (a * b) / findGcd(a,b);

        System.out.println("gcd is : "+lcm);
    }
}
