import java.util.Arrays;
class TrappingWater 
{
	public static void main(String[] args) 
	{
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int n = arr.length;
		
		int water = 0 ;
		
		int left[] = new int[n];
		int right[] = new int[n];
		
		left[0] = arr[0] ;
		right[n-1] = arr[n-1];
		
		for(int i=1 ; i<n ;i++)
		{
			left[i] = Math.max(arr[i] , left[i-1]);
		}
		
		for(int i=n-2 ; i>=0 ; i--)
		{
			right[i] = Math.max(arr[i], right[i+1]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		
		
		for(int i=0 ; i<n ;i++)
		{
			water = water + (Math.min(left[i],right[i]) - arr[i]);
		}
			
			System.out.println("total water : "+water);
		
		
	}
}
