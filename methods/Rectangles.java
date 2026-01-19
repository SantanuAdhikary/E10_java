import java.util.Scanner;
class Rectangles 
{
	public static void area(int l , int w)
	{
		System.out.println("area of rectangle is : "+(l*w));
	}
	
	public static void perimeter(int l , int w)
	{
		int ans = 2 * (l+w);
		
		System.out.println("perimeter of rectable is : "+ans);
	}
	
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.print("enter the length of the rectangle : ");
		int l = sc.nextInt();
		
		System.out.print("enter the width of the rectangle : ");
		int w = sc.nextInt();
		
		area(l,w);
		perimeter(l,w);
	}
}
