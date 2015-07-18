package com.algo;
import com.algo.*;
import com.algo.util.*;
public class TreeSize {

	public static void main(String args[])
	{
	int[] array = {10,8,2,3,5,2};
	/*TreeNode root = new TreeNode(array[0]);
	for(int i=1;i<array.length;i++)
	{
		 root.insertInOrder(array[i]);
	}
	*/
	TreeNode root =AssortedMethods.createTreeFromArray(array);
	 System.out.println("size? " + size(root));
	System.out.println("height? " + height(root));
	System.out.println("data="+root.data +" "+root.left.data+" "+root.right.data);
	//PrintPreorder(root);
	//System.out.println("lcs ="+lca(root,10,22).data);
	System.out.println("sum="+hasPathSum(root,22));
	}
	
	public static void PrintInorder(TreeNode root)
	{
		if(root==null)
			return;
		PrintInorder(root.left);
		System.out.println(root.data);
		PrintInorder(root.right);
	}
	public static void PrintPreorder(TreeNode root)
	{	
		if(root==null)
        return;
		System.out.println(root.data);

		PrintPreorder(root.left);
		PrintPreorder(root.right);
	}
	
	public static int size(TreeNode root)
	{
		if(root==null)
			return 0;
		else
		
			return (size(root.left)+size(root.right)+1);
	}
	
	public static int height(TreeNode root)
	{
		if(root==null)
			return 0;
		else
			return Utility.max(height(root.left),height(root.right))+1;
		
	}
	
	public static TreeNode lca(TreeNode root,int n1,int n2)
	{
		if(root==null)
			return null;
		if(root.data>n1 && root.data>n2)
			return lca(root.left,n1,n2);
		 if(root.data<n1 && root.data<n2)
			return lca(root.right,n2,n2);	
		return root;
	}
	
	public static boolean isSum(TreeNode root)
	{
		int left_data=0,right_data=0;
		if(root==null || (root.left==null && root.right==null)) return true;
		else
		{
			if(root.left!=null)
				left_data=root.left.data;
			if(root.right!=null)
				right_data=root.right.data;
		return (root.data==(left_data+right_data) && isSum(root.left) && isSum(root.right));
		}
	}

	public static boolean hasPathSum(TreeNode root,int sum)
	{
		if(root==null) return false; 
		
		sum=sum-root.data;
		
		if(root.left==null && root.right==null && sum==0 )
			return true;
		 
			return(hasPathSum(root.left,sum) || hasPathSum(root.right,sum));
		
	}
	
}

