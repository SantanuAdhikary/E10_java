import java.util.Scanner;
class Calculator 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("1.ADD	 \n2.SUB  \n3.MUL \n4.DIV");
		System.out.println();
		
		System.out.print("select one option : ");
		int option = sc.nextInt();
		
		
		
		switch(option)
		{
			case 1: System.out.println("welcome to addition");
					System.out.print("Enter first number : ");
					int a = sc.nextInt();
					
					System.out.print("Enter second number : ");
					int b = sc.nextInt();
			        System.out.println("addition is : "+(a+b));
					break;
			case 2: System.out.println("welcome to subtraction");
					System.out.print("Enter first number : ");
					int c = sc.nextInt();
					
					System.out.print("Enter second number : ");
					int d = sc.nextInt();
			        System.out.println("subtraction is : "+(c-d));
					break;
			case 3: System.out.println("welcome to multiplication");
					System.out.print("Enter first number : ");
					int e = sc.nextInt();
					
					System.out.print("Enter second number : ");
					int f = sc.nextInt();
			        System.out.println("multiplication is : "+(e*f));
					break;
			case 4: System.out.println("welcome to division");
					System.out.print("Enter first number : ");
					int g = sc.nextInt();
					
					System.out.print("Enter second number : ");
					int h = sc.nextInt();
			        System.out.println("division is : "+(g/h));
					break;
			default: System.out.println("invalid option");
		}
		
	}
}
