import java.util.Arrays;
class TripletSum 
{
	
	public static boolean isPresent(int arr[] , int sum)
	{
		Arrays.sort(arr);
		int n = arr.length;
		for(int i=0 ; i<n ; i++)
		{
			int target = sum - arr[i] ;
			int j = i+1 ; 
			int k = n-1 ;
			
			while(j < k)
			{
				if(arr[j] + arr[k] == target)
					return true;
				else if(arr[j] + arr[k] > target)
					k--;
				else 
					j++;
			}
		}
		
		return false;
	}
	public static void main(String[] args) 
	{
		int arr[] = {1, 4, 45, 6, 10, 8}, sum = 21;
		
	 boolean ans =isPresent(arr,sum);
	 
	 System.out.println(ans);
	}
}
