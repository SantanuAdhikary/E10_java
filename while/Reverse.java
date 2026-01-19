import java.util.Scanner;
class Reverse
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		int rev = 0 ;
		
		while(n > 0)
		{
			int ld = n % 10 ; 	
			rev = rev * 10 + ld;	
			n = n / 10;
		}	
		System.out.println("reverse is : "+rev);
	}
}
