class Swap2
{
	public static void main(String[] args) 
	{
		int a = 10 ; 
		int b = 20 ; 
		
		System.out.println("before Swapping");
		System.out.println("a value is : "+a);
		System.out.println("b value is : "+b);
		
		a = a + b ;   // a= 30 , b=20
		b = a - b ;   // a=30, b = 10 
		a = a - b ;   // a= 20, b = 10 
		
		System.out.println("after Swapping");
		System.out.println("a value is : "+a);
		System.out.println("b value is : "+b);
	}
}
