package src.com.algo;

public class MaxProfitTrading {

	public static void main(String args[])
	{
	int price[]={90, 80, 70, 60, 50};
	
	System.out.println("max profit="+ getmaxprofit(price));
	}
	
	public static int getmaxprofit(int price[])
	{
		
		int n = price.length;
		int profit[] = new int[n];
		int max=price[n-1];
		
		for(int i=0;i<n;i++)
		{
			profit[i]=0;
		}
		
		for(int i=n-2;i>=0;i--)
		{
			if(price[i]>max)
				max=price[i];
			
			profit[i]=max(profit[i+1],max-price[i]);
			
		}
		
		int min=price[0];
		for(int i=1;i<n;i++)
		{
			if(price[i]<min)
				min=price[i];
			
			profit[i]=max(profit[i-1],profit[i]+(price[i]-min));
		}
		
		return profit[n-1];
	}
	
	public static int max(int m,int n)
	{
		if(m<n)
			return n;
		else
			return m;
	}
}
