import java.util.Scanner;
class SpyNumber 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		
		int sum = 0 ;
		int mul = 1;
		
		while(n > 0)
		{
			int lastdigit = n % 10 ; 
			
			sum = sum + lastdigit;
			mul = mul * lastdigit;
			
			n = n / 10 ;
		}
		
		System.out.println("number is : "+n);
		if(sum == mul)
			System.out.println("it is spy number ");
		else
			System.out.println("it is not spy number");
	}
}
