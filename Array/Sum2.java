import java.util.Arrays;
class  Sum2
{
	
	public static boolean isPresent(int arr[] , int target)
	{	
	 /*	for(int i=0 ; i<arr.length; i++)
		{
			for(int j=i+1 ; j<arr.length;j++)
			{
				if(arr[i] + arr[j] == target)
					return true;
			}
		}	
		return false;  */
		
		
		Arrays.sort(arr);
		
		int i=0 , j = arr.length-1; 
		
		while(i < j )
		{
			if(arr[i] + arr[j] == target)
				return true;
			else if(arr[i]+arr[j] > target)
				j--;
			else
				i++;
		}
		
		return false;
	}
	public static void main(String[] args) 
	{
		int arr[] = {15,3,2,7,5,8,21,2};
		int target = 14 ;
		boolean ans = isPresent(arr,target);	
		System.out.println(ans);
	}
}
