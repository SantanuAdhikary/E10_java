import java.util.Scanner;
class SuperHero 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("1.Batman \n2.Saktimaan \n3.Flash \n4.Hulk \n5.Captain America");
		
		System.out.println();
		System.out.print("Select One superHero : ");
		int option = sc.nextInt();
		
		
		switch(option)
		{
			case 1: System.out.println("you have selected Batman");
			         break;
			
			case 2: System.out.println("you have selected Saktimaan");
					break;
			
			case 3: System.out.println("you have selected Flash");
					break;
					
			case 4: System.out.println("you have selected Hulk");
					break;
					
			case 5: System.out.println("you have selected Captain America");
					break;
			
			default : System.out.println("for you no one is there to save");
			         
					 
		}
		
	}
}
