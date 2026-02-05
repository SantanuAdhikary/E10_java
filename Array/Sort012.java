import java.util.*;
class Sort012 
{
	public static void main(String[] args) 
	{
		
		int arr[] = {1,2,0,0,1,2,0,1,2};
		System.out.println(Arrays.toString(arr));
		
		int i=0 ;
		int j=arr.length - 1 ; 
		int k =0 ;
		
		while(k<=j)
		{
			if(arr[k] == 1 )
				k++;
			
			else if(arr[k] == 0)
			{
				int temp = arr[k] ;
				arr[k] = arr[i];
				arr[i] = temp;
				k++;
				i++;
			}
			else
			{
				int temp = arr[k] ; 
				arr[k] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
