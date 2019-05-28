package src.com.algo;

public class LargestDiff {

	public static void main(String args[])
	{
		int arr[] = {2, 3, 10, 6, 4, 8, 1};
		
		System.out.println(largestdiff(arr)+ " "+largestdiff1(arr));
	}
	
	public static int largestdiff(int []arr)
	{
		int max_diff=arr[1]-arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]-min>max_diff)
			{
				max_diff=arr[i]-min;
			}
			if(arr[i]<min)
				min=arr[i];
		}
		return max_diff;
	}
	
   public static int largestdiff1(int []arr)
   {
	   int n = arr.length;
	   int max_diff=-1000;
	   int val = arr[n-1];
	   
	   for(int i=n-2;i>=0;i--)
	   {
		   
		   if(arr[i]<val)
		   {
			   max_diff=max(max_diff,val-arr[i]);
		   }
		   else
		   {
			   val=arr[i];
			   
		   }
	   }
	  return max_diff; 
   }
   
   public static int max(int m,int n)
   {
	   if(m>n)
		   return m;
	   else
		   return n;
	   
   }

}

