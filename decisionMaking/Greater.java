

import java.util.Scanner;
class Greater
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("enter second number : ");
		int num2 = sc.nextInt();
		
		
		if(num1 > num2)
		{
			System.out.println(num1 + " is greater");
		}
		else{
			System.out.println(num2 + " is greater");
		}
		
		
	}
}
