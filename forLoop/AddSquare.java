import java.util.Scanner;
class AddSquare 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		int sum = 0 ; 
		for(int i=1 ; i<=n ; i++)
		{
			sum = sum + i*i;
		}
		
		System.out.println(sum);
	}
}
