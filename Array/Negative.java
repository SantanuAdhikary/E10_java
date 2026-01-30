import java.util.*;
class Negative 
{
	public static void main(String[] args) 
	{
		int arr[] = {5,-8,2,-4,-6,-7,20,21};
		
		int i = 0 ;
		int j = arr.length - 1 ;
		
		while(i < j)
		{
			// both are positive 
			
			if(arr[i] > 0 && arr[j] >0)
				j--;
			
			// both are negative 
			else if(arr[i] < 0 && arr[j] <0)
				i++;
			
			// first pos , last neg
			
			else if(arr[i] >0 && arr[j] <0)
			{
				int temp = arr[i] ; 
				arr[i] = arr[j] ; 
				arr[j] = temp;
				i++;
				j--;
			}
			// first is neg , last is pos
			else{
				i++;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
