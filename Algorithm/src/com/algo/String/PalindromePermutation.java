package src.com.algo.String;

public class PalindromePermutation {

	public static void main(String args[])
	{
		String str = "Aactcaa";
		PalindromePermutation p = new PalindromePermutation();
		System.out.println(p.isPalindrome(str));

		System.out.println(Character.getNumericValue('a'));
		
	}
	
	public boolean isPalindrome(String str)
	{
		int arr[] = new int[256];
		int oddCount=0;
				
		for(int i=0;i<str.length();i++)
		{
			int val = str.charAt(i);
			System.out.println(val);
			
			arr[val]++;
			
			if(arr[val]%2==0)
			{
				oddCount--;
			}
			else
			{
				oddCount++;
			}
				
		}
       
		if(oddCount>1)
        return false;
		else
			return true;
	}
}
