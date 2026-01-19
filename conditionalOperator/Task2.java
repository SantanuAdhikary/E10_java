import java.util.Scanner;
class Task2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int num = sc.nextInt();
		
	  String ans = num>=0 ? 
		                num%2 == 0 ?"positive even" : "positive odd"   : 
		                num%2 == 0 ? "negative even" : "negative odd";
	
		
		System.out.println(ans);
	}
}
