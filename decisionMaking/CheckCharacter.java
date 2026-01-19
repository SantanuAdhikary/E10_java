import java.util.Scanner;
class CheckCharacter 
{	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one character : ");
		char ch = sc.next().charAt(0); 
		
		if(ch>='0' && ch<='9')
		{
			System.out.println("it is number");
		}
		else if(ch >='a' && ch <='z')
		{
			System.out.println("it is lowercase letter");
		}
		else if(ch >='A' && ch <='Z')
		{
			System.out.println("it is uppercase letter");
		}
		else{
			System.out.println("it is special character");
		}
	}
}
