import java.util.Scanner;
class Niven 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter one number : ");
		int n = sc.nextInt();
		int originalnumber = n ; 
		int sum = 0 ;
		while(n>0){
			int ld = n % 10 ; 
			sum = sum + ld;
			n = n / 10;
		}
		if(originalnumber % sum == 0)
			System.out.println("it is niven number");
		else
			System.out.println("it is not niven number");
	}
}
