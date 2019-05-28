package com.algo.array;

import java.util.HashSet;

public class DuplicateByKDistance {
	
	public static void main(String args[])
	{
		int arr[] = {10,5,3,4,3,5,6};
		int k=3;
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
				System.out.println("yes");
			
			set.add(arr[i]);
			
			if(i>=k)
				set.remove(arr[i-k]);
			
		}
	
	}

}
