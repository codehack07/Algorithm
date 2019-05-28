package com.algo.array;

public class SearchRotatedArray {
	public static void main(String args[])
	{
		int arr[]={5,6,7,8,9,10,1,2,3};
		System.out.println(search(arr,0,arr.length-1,10));
	}

	
	public static int search(int arr[],int low,int high,int key)
	{
		int mid = (low+high)/2;
		
		if(arr[mid]==key)
			return mid;
		
		if(arr[mid]>arr[low])
		{
			if(key >=arr[low] && arr[mid]>key)
			    return search(arr,low,mid-1,key);
			else
				return search(arr,mid+1,high,key);
		}
		else if(arr[mid]<arr[high])
		{
			if(key>arr[mid] && key<=arr[high])
				return search(arr,mid+1,high,key);
			else
				return search(arr,low,mid-1,key);
		}
		return -1;
	}
}
