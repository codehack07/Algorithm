package src.com.algo;

import java.util.ArrayList;

public class FindNumber {

	public static void main(String args[])
	{
	//String s = "Dhoni7 Not Out at 183";
		String s="Ahello 123,78,  !20 pqer12";
	ArrayList<Integer> arr =findNumber(s);
	for(int i=0;i<arr.size();i++)
	{
		System.out.println(arr.get(i));
	}
	
	}
	
	public static ArrayList<Integer> findNumber(String s)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		StringBuilder str = new StringBuilder();
		char charr[] = s.toCharArray();
		for(int i=0;i<charr.length;i++)
		{
			char ch = charr[i];
			//System.out.println(ch+"");
			if(Character.isDigit(ch))
			{
			 str.append(ch);
			}
			else
			{
				if(str!=null && str.length()>0)
				{
					
					arr.add(Integer.parseInt(str.toString()));
					str=new StringBuilder();
				}
			}
		}
		if(str!=null && str.length()>0)
		{
			
			arr.add(Integer.parseInt(str.toString()));
			str=new StringBuilder();
		}
		
		return arr;
}
}