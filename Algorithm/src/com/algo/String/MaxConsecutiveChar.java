package src.com.algo.String;

public class MaxConsecutiveChar {
	
	public static void main(String args[])
	{
	MaxConsecutiveChar m = new MaxConsecutiveChar();
	String str = "geeekk";
	System.out.println(m.maxCount(str));
	

    String arr[] = {"geeksforgeeks", "geeks",
                    "geek", "geezer"};
    int n = arr.length/arr[0].length();
    System.out.println(arr.length+" "+arr[0].length()+" "+n);
 
	}
	
	public int maxCount(String str)
	{
		 int count=0;
		 int max=0;
		 
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
				count++;
			else 
			{
				if(max<=count)
					max=count;
				count=1;
			}
		}
		/*if(max<count)
			max=count;*/
		return max;
	}
}
