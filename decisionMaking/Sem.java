import java.util.Scanner;
class Sem 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter internal marks : ");
		int internal = sc.nextInt();
		
		System.out.print("enter external marks : ");
		int external = sc.nextInt();
		
		if( internal >= 40 &&  external >=50)
		{
			System.out.println("you are pass");
		}
		else
		{
			System.out.println("you are fail");
		}
	}
}
