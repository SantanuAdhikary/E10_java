import java.util.Scanner;
class Voter 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter your age : ");
		int age = sc.nextInt();
		
		System.out.print("do you have voter id ? ");
		boolean id = sc.nextBoolean();
		
		String ans= (age >=18) &&  (id==true ) ? "you are eligible for vote" : "you are not eligible for vote";
		
		System.out.println(ans);
	}
}
