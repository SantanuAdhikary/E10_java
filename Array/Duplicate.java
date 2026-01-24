class  Duplicate
{
	public static void main(String[] args) 
	{
		int arr[] = {10,5,3,10,8,1,12};
		
		int n = arr.length;
		
		boolean flag = false;
		
		int duplicate =-1;
		
		for(int i=0 ; i<n ;i++)
		{
			for(int j=i+1 ; j<n ;j++)
			{
				if(arr[i] == arr[j])
				{
					
					 flag = true;
					 duplicate = arr[i];
			         break;	
			    }
		  }
	  }
	  
	  if(flag)
		  System.out.println("duplicate is present "+duplicate);
	  else
		  System.out.println("duplicaste is not present");
}}
