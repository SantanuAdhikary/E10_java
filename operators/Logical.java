class Logical
{
	public static void main(String[] args) 
	{
		int a = 20 ; 
		int b = 25 ; 

		System.out.println("=========== Logical AND operator ==========");
		
		System.out.println( a!= 5  && b==25 );  // true && true => true
		
		System.out.println( (a >= 19) && ( b < 25) ) ; // true && false => false
		
		System.out.println( (a<20) && (b!=20)); // false && true => false 
		
		System.out.println( a>20 &&  b!=25 ); // false && false => false
		
		
		System.out.println("=========== Logical OR operator ==========");
		
		System.out.println( a!= 5  || b==25 );  // true || true => true
		
		System.out.println( (a >= 19) || ( b < 25) ) ; // true || false => true
		
		System.out.println( (a<20) || (b!=20)); // false || true => true 
		
		System.out.println( a>20 ||  b!=25 ); // false || false => false 
		
		
		System.out.println("========== Logical NOT Operator ===========");
		
		int c = 10 ; 
		int d = 20 ; 
		
		System.out.println( ! (c >=d ));  // !false => true 
		System.out.println( ! (d ==20));  // !true => false 
		
		
		
	}
}
