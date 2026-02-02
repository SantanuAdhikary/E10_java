class LinearSearch 
{
	
	public static int linearSearch(int arr[] , int item)
	{
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] == item)
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) 
	{
		
		int arr[] = {5,9,21,15,7,12};
		int item = 25 ;
		
		int index = linearSearch(arr,item);
		
		System.out.println(index);
		
	}
}
