
import java.util.Scanner;
class PositiveNegative 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int num = sc.nextInt();
		
		 String ans = num < 0 ? "negative" : "positive"; 
		 
		 System.out.println(ans);
	}
}
