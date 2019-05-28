package com.algo;

public class LongestCommonSubsequence {

	public static void main(String args[])
	{
	String s1 = "ABCDGH";
	String s2 = "AEDFHR";
	String s3="aabb";
	
	System.out.println(lcss(s1,s2,s1.length()-1,s2.length()-1));
	System.out.println(iterativeLcss(s1,s2,s1.length(),s2.length()));
	System.out.println(findLongestRepeatingSubSeq(s3));

	}
	
	public static int lcss(String s1,String s2,int m,int n)
	{
		if(m<0||n<0)
			return 0;
       if(s1.charAt(m) == s2.charAt(n))
    	   return 1+lcss(s1,s2,m-1,n-1);
       else
    	   return Math.max(lcss(s1,s2,m-1,n),lcss(s1,s2,m,n-1));
	}
	
	public static int iterativeLcss(String s1,String s2,int m,int n)
	{
	   int arr[][] = new int[m+1][n+1];
	   for(int i=0;i<=m;i++)
	   {
		 for(int j=0;j<=n;j++)
		 {    
	       if(i==0||j==0)
		     arr[i][j]=0;
	       else if(s1.charAt(i-1)==s2.charAt(j-1))
	    	   arr[i][j]=arr[i-1][j-1]+1;
	       else
	    	   arr[i][j]= Math.max(arr[i][j-1],arr[i-1][j]);
	   
	    }
	   }
	   return arr[m][n];			 
	
   }
	
	
	public static int findLongestRepeatingSubSeq(String str)
	{
	    int n = str.length();
	  
	    // Create and initialize DP table
	    int dp[][] = new int[n+1][n+1];
	    for (int i=0; i<=n; i++)
	        for (int j=0; j<=n; j++)
	            dp[i][j] = 0;
	  
	    // Fill dp table (similar to LCS loops)
	    for (int i=1; i<=n; i++)
	    {
	        for (int j=1; j<=n; j++)
	        {
	            // If characters match and indexes are 
	            // not same
	            if (str.charAt(i-1) == str.charAt(j-1) && i != j)
	                dp[i][j] =  1 + dp[i-1][j-1];          
	                       
	            // If characters do not match
	            else
	                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
	        }
	    }
	   
	    
	    for(int i=0;i<=n;i++)
	    {
	    	for(int j=0;j<=n;j++)
	    	{
	    		System.out.print(dp[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	    return dp[n][n];
	}
}
