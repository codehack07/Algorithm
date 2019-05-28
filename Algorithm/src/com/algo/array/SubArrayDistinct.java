package com.algo.array;

import java.util.HashSet;

public class SubArrayDistinct {

	public static void main(String args[])
	{
		int arr[] ={1,2,3};
		
		int ans=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int j=i+1;
			HashSet<Integer> s =new HashSet<Integer>();
			while(j<arr.length && !s.contains(arr[j]))
			{
			
				s.add(arr[j]);
				j++;
			}
			ans+= ((j-i)*(j-i+1))/2;
			
		}
		
		System.out.println(ans);
	}
}
