/* write a java program to diplay the final price of the product 

  if bill is more than or equal to 10000, give 60% discount 
  if bill is between 7000 to 9999 give 40% discount 
  if bill is between 5000 to 6999 give 20% discount 
  less than 5000 there is no discount
  
*/
import java.util.Scanner;
class ProductPrice 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your bill : ");
		int bill = sc.nextInt();
		
		if(bill >= 10000)
		{
			System.out.println("you will get 60% discount");
			bill = (bill * 40)/100;
			
			System.out.println("your final bill is : "+bill);
		}
		else if(bill >=7000)
		{
			
			System.out.println("you will get 40% discount");
			bill = (bill * 60)/100;
			
			System.out.println("your final bill is : "+bill);
		}
		else if(bill >=5000)
		{
			System.out.println("you will get 20% discount");
			bill = (bill * 80)/100;
			
			System.out.println("your final bill is : "+bill);
		}
		else{
			System.out.println(" you don't have any discount your final bill is : "+bill);
		}
	}
}
