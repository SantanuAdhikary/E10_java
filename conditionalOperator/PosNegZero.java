import java.util.Scanner;
class  PosNegZero
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one integer number : ");
		int num = sc.nextInt();
		
		
	  String ans=	num == 0 ? "zero" : num>0 ? "positive" : "negative" ;
	  
	  System.out.println(ans);
	}
}
