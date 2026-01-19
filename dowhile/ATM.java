
import java.util.Scanner;
class ATM 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		int option;
		int amount = 1000;
		
		do{
		System.out.println("\t\t\t ATM");
		System.out.println("1.Withdrawal");
		System.out.println("2.Display Balance");
		System.out.println("3.Deposit");
		System.out.println("0.Exit");
		
		System.out.print("enter any one option : ");
		 option = sc.nextInt();
		
		
		
		
		switch(option)
		{
			case 1 : System.out.print("enter amount you want to withdrawl : ");
			         int withdrawl = sc.nextInt();
					 
					 if(withdrawl <=amount)
						{
							amount = amount - withdrawl;
							System.out.println(withdrawl+" is debited");
						}
						else{
							System.out.println("insufficient balance");
						}
						break;
			case 2 : System.out.println("your balance is : "+amount);
			         break;
					 
			case 3: System.out.print("enter the amount you want to deposit : ");
			        int deposit = sc.nextInt();
					amount = amount + deposit;
					break;
			
			case 0: System.out.println("have a good day. come again ");
					break;
			default : System.out.println("invalid input");
			
		}
		}while(option!=0);
	}
}
