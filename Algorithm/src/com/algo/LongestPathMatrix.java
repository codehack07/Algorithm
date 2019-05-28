package com.algo;

public class LongestPathMatrix {
 
	public static int n=3;
	public static void main(String args[])
	{
		int a[][] = new int[][]{{1,2,9},
				{5,3,8},
				{4,6,7}
		};
		
		System.out.println(finLongestOverAll(a));
	}
	
	
	   static int findLongestFromACell(int i, int j, int mat[][], int dp[][])
	    {
	        // Base case
	        if (i<0 || i>=n || j<0 || j>=n)
	            return 0;
	  
	        // If this subproblem is already solved
	        if (dp[i][j] != -1)
	            return dp[i][j];
	  
	        // Since all numbers are unique and in range from 1 to n*n,
	        // there is atmost one possible direction from any cell
	        if (j<n-1 && ((mat[i][j] +1) == mat[i][j+1]))
	            return dp[i][j] = 1 + findLongestFromACell(i,j+1,mat,dp);
	  
	        if (j>0 && (mat[i][j] +1 == mat[i][j-1]))
	            return dp[i][j] = 1 + findLongestFromACell(i,j-1,mat,dp);
	  
	        if (i>0 && (mat[i][j] +1 == mat[i-1][j]))
	            return dp[i][j] = 1 + findLongestFromACell(i-1,j,mat,dp);
	  
	        if (i<n-1 && (mat[i][j] +1 == mat[i+1][j]))
	            return dp[i][j] = 1 + findLongestFromACell(i+1,j,mat,dp);
	  
	        // If none of the adjacent fours is one greater
	        return dp[i][j] = 1;
	    }
	     
	    // Function that returns length of the longest path
	    // beginning with any cell
	    static int finLongestOverAll(int mat[][])
	    {
	        // Initialize result
	        int result = 1;  
	  
	        // Create a lookup table and fill all entries in it as -1
	        int[][] dp = new int[n][n];
	        for(int i=0;i<n;i++)
	            for(int j=0;j<n;j++)
	                dp[i][j] = -1;
	  
	        // Compute longest path beginning from all cells
	        for (int i=0; i<n; i++)
	        {
	            for (int j=0; j<n; j++)
	            {
	                if (dp[i][j] == -1)
	                    findLongestFromACell(i, j, mat, dp);
	  
	                //  Update result if needed
	                result = Math.max(result, dp[i][j]);
	            }
	        }
	        for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat.length;j++)
				{
					System.out.print(dp[i][j]);
				}
				System.out.println();

				
			}
	        return result;
	    }
	
	
	
	
	public static int longestPath(int a[][],int dp[][],int i,int j,int n)
	{
		if(i<0||j<0||i>=n||j>=n)
			return 0;
	
		if(dp[i][j]!=-1)
			return dp[i][j];
		
		if(j-1>0 && (a[i][j-1]==a[i][j]+1))
		{
			return dp[i][j] = 1+longestPath(a,dp,i,j-1,n);
		}

		if(i-1>0 && (a[i-1][j]==a[i][j]+1))
		{
			return dp[i][j] = 1+longestPath(a,dp,i-1,j,n);
		}
		

		if(j+1<n && (a[i][j+1]==a[i][j]+1))
		{
			return dp[i][j] = 1+longestPath(a,dp,i,j+1,n);
		}
		

		if(i+1<n && (a[i+1][j]==a[i][j]+1))
		{
			return dp[i][j] = 1+longestPath(a,dp,i+1,j,n);
		}
		
		return dp[i][j]=1;
			
	}
	
	public static int longestPathAll(int arr[][])
	{
		int max=-1;
		int n = arr.length;
		
		int dp[][]= new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				dp[i][j]=-1;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(dp[i][j]==-1)
					  longestPath(arr,dp,i,j,n);
							
				
				max=Math.max(max, dp[i][j]);
			}
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(dp[i][j]);
			}
			System.out.println();

			
		}
		return max;
	}
}
