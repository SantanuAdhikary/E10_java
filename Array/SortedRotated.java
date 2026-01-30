class  SortedRotated
{
	public static void main(String[] args) 
	{
		
		//int arr[] = {1,2,3,4,5};
		//int arr[] ={10,20,5,8,9};
		//int arr[] = {20,6,18,9,12};
		int arr[] ={10,11,2,6,14};
		int count = 0 ;
		for(int i=0 ; i<arr.length-1;i++)
		{
			if(arr[i] > arr[i+1])
				count++;		
		}	
		if(arr[arr.length-1] > arr[0])
			count++;
		
		System.out.println(count);
		
		if(count == 1)
			System.out.println("array is sorted or rotated");
		else
			System.out.println("it is not sorted or not rotated");
	}
}
