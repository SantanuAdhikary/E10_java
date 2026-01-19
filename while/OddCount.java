import java.util.Scanner;
class CountOdd 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		int count = 0 ;
		
		while(n > 0)
		{
			int lastdigit = n % 10 ; 
			
			if(lastdigit % 2 !=0)
				count++;
			
			n = n / 10 ;
				
		}
		
		System.out.println("odd numbers count is : "+count);
	}
}
