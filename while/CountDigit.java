
import java.util.Scanner;
class CountDigit 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.print("enter one number : ");
		int n = sc.nextInt();
	
	    System.out.println("number is : "+n);
		
		int count = 0 ;
		
		while(n > 0)
		{
			n = n / 10 ;
			count++;
		}
		
		System.out.println("count is : "+count);
		
	}
}
