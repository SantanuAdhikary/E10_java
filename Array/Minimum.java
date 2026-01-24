class Minimum 
{
	public static void main(String[] args) 
	{
		int arr[] = {19,15,9,5,25,7};
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0 ; i<arr.length;i++)
		{
			if(arr[i] < min)
				min = arr[i];
		}
		
		System.out.println("minimum element is : "+min);
	}
}
