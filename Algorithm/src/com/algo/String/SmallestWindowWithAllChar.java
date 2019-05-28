package src.com.algo.String;

public class SmallestWindowWithAllChar {
	
	public static void main(String args[])
	{
		String s = "aabcbcdbca";
		SmallestWindowWithAllChar p = new SmallestWindowWithAllChar();
		System.out.println(p.windowSize(s));
		
	}
	
	public int windowSize(String str)
	{
	   int lastIndex[] = new int[256];
	   int max=0;
	   int count=0;
	   int start=0;
	   int end=0;
	   count=1;
	   max=1;
	   
	   lastIndex[str.charAt(0)]=0;
	   
	   for(int i=1;i<str.length();i++)
	   {
		   int ch = str.charAt(i);
		   
		   if(i-lastIndex[ch]<=count)
		   {
			   if(max<count) max=count;
			   count=i-lastIndex[ch];
			   start=lastIndex[ch]+1;
			   end=i;
		   }
		   else
		   count++;
		   
		   lastIndex[ch]=i;
		   end=i;
		   
	   }
	   if(max<count) max=count;
	 System.out.println(str.substring(start, end+1));
	   return max;
		
	}

}
