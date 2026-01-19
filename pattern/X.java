class X 
{
	public static void main(String[] args) 
	{
		int n = 7 ; 
		
		for(int i=0 ; i<n;i++)
		{
			for(int j=0 ; j<n;j++)
			{
				if(  i+j==n-1|| i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			// R

System.out.print("  ");

		for(int j = 0; j < n; j++)
		{
			if(
				j == 0 ||                 // left vertical line
				i == 0 && j<n/2 ||                 // top horizontal line
				i == n/2 && j<n/2||               // middle horizontal line
				(j == n/2 && i <= n/2) || // right vertical (top half)
				(i  == j+ n/2)            // diagonal leg
			  )
				System.out.print("r ");
			else
				System.out.print("  ");

			
		}
			System.out.println();
		}
	}
}
