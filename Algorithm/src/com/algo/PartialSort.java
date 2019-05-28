package src.com.algo;

public class PartialSort {

	public static void main(String args[])
	{
		int arr[] = {10, 20, 40, 30, 50, 60};
		
		partialsort(arr);
	}
	
	public static void partialsort(int arr[])
	{
		
		for(int i=arr.length-1;i>0;i--)
		{
			if(arr[i]<arr[i-1])
			{
			 int j=i-1;
			 while(j>0&& arr[j]>arr[i])
			 {
				 j--;
			     
			}	
			 swap(arr,i,j+1);
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	
	public static void swap(int arr[],int m,int n)
	{
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
	}
}
