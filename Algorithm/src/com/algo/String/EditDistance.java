package src.com.algo.String;


public class EditDistance {
	
	public static void main(String args[])
	{
		String s1="geek";
		String s2="gesek";
		
		System.out.println(editDistance(s1,s2));
	}

	
	public static int  editDistance(String s1,String s2)
	{
		int s1Size = s1.length();
		int s2Size = s2.length();
		
		int dist[][]= new int[s1Size+1][s2Size+1];
		
		for(int i=0;i<=s1Size;i++)
		{
			for(int j=0;j<=s2Size;j++)
			{
				if(i==0)
				{
					dist[i][j]=j;
				}
				else if(j==0)
				{
					dist[i][j]=i;
				}
				else if(s1.charAt(i-1) == s2.charAt(j-1))
				{
					dist[i][j]=dist[i-1][j-1];
				}
				else
				{
					dist[i][j]=1+Math.min(dist[i-1][j-1],Math.min(dist[i-1][j], dist[i][j-1]));
				}
			}
		}
		return dist[s1Size][s2Size];
	}
}
