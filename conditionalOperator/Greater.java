import java.util.Scanner;
class Greater 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("first number is : "+num1);
		System.out.println("second number is : "+num2);
		
		
	  int ans =	num1 > num2 ? num1 : num2;
	  
	  System.out.println("greater is : "+ans);
	}
}
