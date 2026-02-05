class Stock1 
{
	public static void main(String[] args) 
	{
		int arr[] ={7,1,3,5,6,4};
		
		int min = Integer.MAX_VALUE;
		int maxProfit = Integer.MIN_VALUE;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] < min)
				min = arr[i] ; 
			
			int profit = arr[i] - min ;
			
			maxProfit = Math.max(profit , maxProfit);
		}
		
		System.out.println("maximum profit is : "+maxProfit);
	}
}
