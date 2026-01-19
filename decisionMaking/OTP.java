import java.util.Scanner;
class  OTP
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		
		long regNumber = 1234567890L;
		
		System.out.print("enter your register phone number : ");
		long phNo = sc.nextLong();
		
		System.out.println("Processing...");
		Thread.sleep(2000);
		
		if(regNumber == phNo)
		{
			
			int otp = (int) (Math.random() * 8999) + 1000;
			System.out.println("your otp is : "+otp);
			
			System.out.print("enter the otp : ");
			int userOtp = sc.nextInt();
			
			System.out.println("Processing...");
			Thread.sleep(2000);
			
			if(otp == userOtp)
			{
				System.out.println("welcome to my app");
			}
			else{
				System.out.println("invalid otp");
			}
		}
		else{
			System.out.println("wrong phone number");
		}
	}
}
