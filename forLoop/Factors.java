import java.util.Scanner;
class Factors 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			if(n % i == 0)
				System.out.print(i+" ");
		}
	}
}
