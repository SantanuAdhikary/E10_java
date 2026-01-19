
import java.util.Scanner;
class Zomato 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("1.A2B");
		System.out.println("2.Second Wife");
		System.out.println("3.B3C40");
		
		System.out.print("Select any one Restaurant : ");
		int option = sc.nextInt();
		
		switch(option)
		{
			case 1 : System.out.println("welcome to A2B restaurant");
			
			         System.out.println("Menu");
					 System.out.print("1.Biriyani \n2.Chapathi \n3.Curd Rice");
					 System.out.println();
					 System.out.print("select any one food : ");
					 int food = sc.nextInt();
					 
					 int price ;
					 int quantity;
					 int bill =0;
					 
					 if(food == 1)
						{
							price = 300 ; 
							
							System.out.print("enter quantity : ");
							quantity = sc.nextInt();
		
							 bill = price * quantity;
							
							System.out.println("your bill is : "+bill);
					       
						}
					else if(food == 2)
						{
							price = 20 ;
							
							System.out.print("enter quantity : ");
							quantity = sc.nextInt();
		
							 bill = price * quantity;
							
							System.out.println("your bill is : "+bill);
							
					
						}
					else if(food == 3)
						{
							price = 60 ; 
							
						   System.out.print("enter quantity : ");
							quantity = sc.nextInt();
		
							 bill = price * quantity;
							
							System.out.println("your bill is : "+bill);
						}
					else 
						System.out.println("invalid food option");
					
					
			     
				 
				 System.out.print("Do you want to pay y/n ? ");
				 
				 char ch = sc.next().charAt(0);
				 
				 if(ch=='y' || ch == 'Y')
					{
						System.out.print("Enter the ammount : ");
						int amount = sc.nextInt();
						
						if(amount == bill)
						{
							int otp = (int) (Math.random()*8999)+1000;
							System.out.println("your otp is : "+otp);
							
							
							System.out.print("Enter the otp :");
							int userOtp = sc.nextInt();
							
							if(otp == userOtp)
								System.out.println("your order is placed");
							else
								System.out.println("invalid otp");
						}
						else
						{
							System.out.println("wrong amount");
						}
					}
				else
					{
						System.out.println("Thank you come again next time");
					}
					
						
					 break;
			
			case 2 : System.out.println("welcome to Second Wife restaurant");
					 break;
			
			case 3 : System.out.println("welcome to B3C40 restaurant");
					 break;
			
			default:System.out.println("invalid option");
		}
	}
}
