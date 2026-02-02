class  BinarySearch
{
	public static int binarySearch(int arr[] , int item)
	{
		  int i=0 ;
		  int j = arr.length - 1 ;
		  while( i<=j)
		  {
			int mid = (i+j) / 2 ; 
			
			 if(arr[mid] == item)
				 return mid;
			 
			 else if(item > arr[mid])
				 i = mid + 1; 
			 
			 else 
				 j = mid - 1; 
		  }
		  
		  return -1;
	}
	
	public static void main(String[] args) 
	{
		int arr[] ={10,11,12,13,14,15,16,17,18,19,20};
		int item = 5;
		
	  int index =	binarySearch(arr,item);
	  
	  System.out.println(index);
	}
}
