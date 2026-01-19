
import java.util.Scanner;
class Subjects 
{
	static Scanner sc = new Scanner(System.in);
	
    static int option;
	public static void main(String[] args) 
	{
		
	do{	
		System.out.print("1.Java \n2.Python  \n3.webtech \n0.Exit ");
		System.out.println();
		System.out.println("select any one subject : ");
		option = sc.nextInt();
		
		switch(option)
		{
			case 1 : System.out.println("welcome to java");
				     break;
			case 2 : System.out.println("welcome to python");
				     break;
			case 3 : System.out.println("welcome to webtech");
				     break;
			case 0: System.out.println("bye bye see you again");
			        break;
			default:System.out.println("invalid input");
		}
	}while(option!=0);
	}
}
