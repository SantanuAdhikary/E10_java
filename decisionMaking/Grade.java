import java.util.Scanner;
class Grade 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter your mark : ");
		int mark = sc.nextInt();
		
		if(mark >=85)
		{
			System.out.println("your grade is : A ");
		}
		else if(mark >=65)
		{
			System.out.println("your grade is : B");
		}
		
	    else if(mark >=55)
		{
			System.out.println("your grade is : C");
		}
		
		else if(mark >=40)
		{
			System.out.println("your grade is : D");
		}
		else
		{
			System.out.println("you are fail");
		}
	}
}
