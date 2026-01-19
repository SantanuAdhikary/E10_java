import java.util.Scanner;
class LastDigit 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		
		while(n > 0)
		{
			int lastdigit = n % 10 ;
			System.out.println("last digit " +lastdigit);
			n = n / 10 ;
			
		}
	}
}
