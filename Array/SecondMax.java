class  SecondMax
{
	public static void main(String[] args) 
	{
		int arr[] = {5,9,7,10,12,11,8,12};
		
		int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;j
		
		for(int i=0 ; i<n ; i++)
		{
			if(arr[i] > max)
			{
				smax = max; 
				max = arr[i];
			}
			else if(arr[i] > smax && arr[i] != max)
			{
				smax = arr[i];
			}
		}
		
		System.out.println("second maximum element is :"+smax);
	}
}
