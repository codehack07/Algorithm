package src.com.algo.String;

import java.util.Stack;

public class PalindromString {
	
	public static void main(String args[])
	{
		String str = "abcba";
		PalindromString p = new PalindromString();
		System.out.println(p.isPalindrome(str));
		
	}
	

	
	
	public boolean isPalindrome(String str)
	{
		Stack<Character> stack = new Stack<Character>();
		int i=0;
		
		for( i=0;i<str.length()/2;i++)
		{
			stack.push(str.charAt(i));
		}
	
		if(str.length()%2!=0)
		{
			
			i++;
		}
		
		while(!stack.isEmpty() && i<str.length())
		{
			if(!(str.charAt(i)==stack.pop()))
				return false;
			i++;
		}
		return true;
	}

}
