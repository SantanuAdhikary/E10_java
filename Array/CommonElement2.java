class CommonElement2 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,5,6,7,9,13,18,21};
		int b[] ={1,3,4,6,8,9,13};
		
		int i= 0, j = 0 ;
		
		while(i < a.length && j<b.length)
		{
			if(a[i] == b[j])
			{
				System.out.println(a[i]);
				i++;
				j++;		
			}
			else if(a[i] > b[j])
				j++;
		    else 
				i++;		
		}
	}
}
