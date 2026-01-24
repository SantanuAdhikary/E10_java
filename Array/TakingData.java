import java.util.*;
class TakingData 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the size of the array : " );
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("enter the data ");
		
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
