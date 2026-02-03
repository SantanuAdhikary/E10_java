import java.util.*;
class RightRotateByK 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		int arr[] = {10,20,30,40,50};
		int n = arr.length;
		
		System.out.print("enter how many times rotate : ");
		
		int k = sc.nextInt();
		
		k= k % n;
		
		int count = 1 ;
		
		for(int j=1 ; j<=k ;j++)
		{   
			System.out.println("hello"+count++);
				int last = arr[n-1];
				
				for(int i=n-2 ; i>=0;i--)
				{
					arr[i+1]=arr[i];
				}		
				arr[0] = last;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
