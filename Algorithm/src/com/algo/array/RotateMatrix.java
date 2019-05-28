package com.algo.array;

public class RotateMatrix {
	
	public static void main(String[] args) 
    {
   
    int a[][] = { {1, 2, 3, 4},
                  {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };
 
    // Tese Case 2
    /* int a[][] = new int {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        };*/
    rotatematrix(a.length, a.length, a);
     
    }
	
	public static void rotatematrix(int row,int col,int a[][])
	{
		int r =0;
		int c=0;
		int prev,curr;
		
		while(r<row && c<col)
		{
			if(r+1==row || c+1==col)
				break;
			
			prev=a[r+1][c];
			
			for(int i=c;i<col;i++)
			{
				curr=a[r][c];
				a[r][c]=prev;
				prev=curr;
				
			}
           r++;
           
					
		}
	}

}
