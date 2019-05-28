package src.com.algo;

public class MatrixZero {

	public static void main(String args[])
	{
		
		  int nrows=5;
		  int ncols=6;
		int[][] m1 = AssortedMethods.randomMatrix(nrows, ncols, 0, 100);
		AssortedMethods.printMatrix(m1);

		setZeros(m1);
		System.out.println("new matrix");
		AssortedMethods.printMatrix(m1);
	
}
	
	
	public static void  setZeros(int[][] m1)
	{
		
		boolean row[] = new boolean[m1.length];
		boolean col[] = new boolean[m1[0].length];
		
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[0].length;j++)
			{
				if(m1[i][j]==0)
				{
					row[i]=true;
					col[j]=true;
				}
			}
		}
		
		for(int i=0;i<row.length;i++)
		{
			if(row[i])
				nullifyrow(m1,i);
			
		}
		
		for(int i=0;i<col.length;i++)
		{
			if(col[i])
				nullifycol(m1,i);
			
		}
		
				
	}
	
	public static void  nullifyrow(int[][]m1,int i)
	{
		for (int j=0; j< m1[i].length;j++)
		{
			m1[i][j]=0;
		}
	}
	public static void  nullifycol(int[][]m1,int i)
	{
		for (int j=0; j< m1.length;j++)
		{
			m1[j][i]=0;
		}
	}
	
}
