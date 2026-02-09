class CommonElement3 
{
	public static void main(String[] args) 
	{
		int a[] = {2,5,6,7,9,13,18,21};
		int b[] ={1,3,4,6,8,9,21};
		int c[] = {1,2,5,6,7,9,21};
		
		int i= 0, j = 0 , k = 0  ;
		
		while(i < a.length && j<b.length && k<c.length)
		{
			if(a[i] == b[j] && b[j]==c[k]) 
			{
				System.out.println(a[i]);
				i++;
				j++;
				k++;
			}
			else if(a[i] < b[j])
				i++;
			else if(b[j] < c[k])
				j++;
		    else 
				k++;		
		}
	}
}
