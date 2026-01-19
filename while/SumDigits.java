import java.util.Scanner;
class AddDigits 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		
		int sum = 0 ;
		
		while(n>0)
		{
			int lastdigit = n % 10 ;
			
			sum = sum + lastdigit;
			
			n = n / 10 ;
		}
		
		System.out.println("addition of digits is : "+sum);
	}
}
