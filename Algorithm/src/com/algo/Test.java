package src.com.algo;

public class Test {

	public static void main(String args[])
	{
	String s1="java";
	String s2="java";
	String s3=new String("java");
	String s4=new String("java");
	
	if(s1==s2)
	System.out.println("equals");
	else
	System.out.println("not equals");
	
	if(s1.equals(s3))
	System.out.println("equals");
	else
	System.out.println("not equals");

	if(s3.equals(s4))
		System.out.println("equals");
		else
		System.out.println("not equals");
	
	}	
}
