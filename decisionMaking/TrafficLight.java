
import java.util.Scanner;
class TrafficLight 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter one color : ");
		
		String color = sc.next();
		
		
		switch(color)
		{
			case "red" : System.out.println("stop");
			             break;
			
			case "green" : System.out.println("go");
			             break;
			
			case "yellow": System.out.println("ready");
			             break;
			
			default : System.out.println("invalid color");
			
		}
	}
}
