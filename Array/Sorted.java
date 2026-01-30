class Sorted 
{
	public static void main(String[] args) 
	{
		int arr[] = {4,6,19,10,60,80};
		
		boolean flag = true;
		
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i] < arr[i-1])
			{
				flag = false;
				break;
			}
		}
		
		if(flag == true)
			System.out.println("it is sorted");
		else 
			System.out.println("it is not sorted");
	}
}
