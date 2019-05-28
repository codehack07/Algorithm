package com.algo.array;

public class LongestIncrSeq {

	public static void main(String args[])
	{
		int [] arr = {10,22,9,33,21,50,41,60,80};
		System.out.println(lis(arr));
	}
	
	
	public static int lis(int arr[])
	{
		int [] lis = new int[arr.length];
		int [] prev = new int[arr.length];
		
		for(int i=0;i<lis.length;i++)
		{
			lis[i]=1;
		}
		
		lis[0]=1;
		prev[0]=0;
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				
				if(arr[i]>arr[j] && lis[i]<lis[j]+1)
				{
					lis[i]=lis[j]+1;
					prev[i]=j;
					
				}
			}
		}
		int max=-1;
		int maxlength=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(lis[i]>max)
			{
				max=i;
			maxlength=lis[i];	
			}
		}
		
		int i = max;
		
		while(i>=0 && maxlength>0 )
		{
			System.out.println(arr[i]);
			i=prev[i];
			maxlength--;
		}
		return lis[arr.length-1];
		
	}
}
