
import java.util.Scanner;
class PosNegZero2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		
		
		if(n==0)
			System.out.println("it is zero");

        else if(n<0)
			System.out.println("it is negative");
		else
			System.out.println("it is positive");
		
	}
}
