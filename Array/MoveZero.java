import java.util.*;
class  MoveZero
{
	public static void main(String[] args) 
	{
		int arr[] = {1,0,1,1,0,1,0};
		
		int i= 0 ;
		int j=0;
		
		while(i<arr.length)
		{
			if(arr[i] == 1)
				i++;
			else
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
