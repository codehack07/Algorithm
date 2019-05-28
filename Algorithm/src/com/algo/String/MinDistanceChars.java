package src.com.algo.String;

public class MinDistanceChars {

	public static void main(String args[])
	{
        
		String s1 = "hello how are you";
		System.out.println(distance(s1,"hello","you"));
		System.out.println(distanceChars("AxxxxA",'A','A'));

	}


	
	public static int distance(String str,String a,String b){
		int aIndex=-1;
		int bIndex=-1;
		int minDistance=Integer.MAX_VALUE;
		String[] aS=str.toLowerCase().split("[ \t]+");
		int i=0;
		for(String t:aS){
			if(t.equals(a)){
				aIndex=i;
			}
			if(t.equals(b)){
				bIndex=i;
			}
			if(aIndex!=-1 && bIndex!=-1){
				minDistance= minDistance > Math.abs(bIndex-aIndex) ? bIndex-aIndex : minDistance; 
			}
			i++;
		}
		if(aIndex ==-1 || bIndex==-1)
			return -1;
		else
			return minDistance;
	}
	
	public static int distanceChars(String str,char a,char b){
		int aIndex=-1;
		int bIndex=-1;
		int minDistance=Integer.MAX_VALUE;
		char [] aS = str.toCharArray();
		int i=0;
		boolean isSame = a==b;
		boolean flag=false;
		for(char t:aS){
			if(t ==a){
				if(!isSame)
				{
					aIndex=i;
				}
				else
				{
					if(!flag){
						aIndex=i;
					    flag=true;	
					}
				}					
			}
			
			if(t==b){	
				if(!isSame)
					bIndex=i;
				else if(flag)
				{
					bIndex=i;
					flag=false;
				}
			}
			if(aIndex!=-1 && bIndex!=-1){
				minDistance= minDistance > Math.abs(bIndex-aIndex) ? Math.abs(bIndex-aIndex) : minDistance; 
			}
			i++;
		}
		if(aIndex ==-1 || bIndex==-1)
			return -1;
		else
			return minDistance;
	}
	
}
