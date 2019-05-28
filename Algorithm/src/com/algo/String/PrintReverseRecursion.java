package src.com.algo.String;

public class PrintReverseRecursion {

	public static void main(String args[])
	{
		PrintReverseRecursion p = new PrintReverseRecursion();
		p.reverse("abc");
	}
	 public void reverse(String str)
	 {
		 
		 if(str==null || str.length()<=1)
			 System.out.println(str);
		 else{
		String rem = str.substring(0,str.length()-1);
		System.out.println(str.charAt(str.length()-1));
		reverse(rem);
		 }
	 }
}
