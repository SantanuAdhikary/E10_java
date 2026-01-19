import java.util.Scanner;
class  Market
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter your bill : ");
		int bill = sc.nextInt();
		int price ;
		if(bill >=10000)
		{
			System.out.println("you will get 60% discount");
			 price = (bill * 40)/100;
			
			System.out.println("you have to pay : "+price);
		}
		else if(bill >=7000)
		{
			System.out.println("you will get 40% discount");
			price = (bill * 60)/100;
			
			System.out.println("you have to pay : "+price);
		}
		else if(bill >=5000)
		{
			System.out.println("you will get 30% discount");
			price = (bill * 70)/100;
			
			System.out.println("you have to pay : "+price);
		}
		else{
			System.out.println("you don't have any discount");
			System.out.println("you have to pay "+bill);
		}
	}
}
