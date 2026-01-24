class AddElements 
{
	public static void main(String[] args) 
	{
		int arr[] = {5,6,10,20,26};
		
		int sum = 0 ; 
		
		for(int i=0 ; i<arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("sum of elements is : "+sum);
	}
}
