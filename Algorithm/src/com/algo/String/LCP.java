package src.com.algo.String;

public class LCP {

	public static void main(String args[])
	{
		 String arr[] = {"geeksforgeeks", "geeks",
                 "geek", "geezer"};
		 
		 LCP l = new LCP();
		 
           
		 String lcp = l.longestCommonPrefix(arr,arr.length);
		 System.out.println(lcp);

	}
	
	public  String longestCommonPrefix(String arr[],int n)
	{
		int minlen = getMinLen(arr);
		String result="";
		
		for(int i=0;i<minlen;i++)
		{
			char ch = arr[0].charAt(i);
			 for(int j=1;j<arr.length;j++)
			 {
			    if(arr[j].charAt(i)!=ch)
			    	return result;
			 }
			 result=result+ch;
		}
		return result;
	}
	
	public int getMinLen(String arr[])
	{
		int min = arr[0].length();
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i].length()<min)
				min=arr[i].length();
		}
		return min;
	}
}
