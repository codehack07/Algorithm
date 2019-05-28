package com.algo.array;

import java.util.Stack;

public class QueueWith2Stacks<T> {

	Stack<T> main = new Stack<T>();
	Stack<T> secondary = new Stack<T>();
	
	public void enqueue(T n)
	{
		main.push(n);
	}
	
	public T dequeue()
	{
		if(!secondary.isEmpty()){
			return secondary.pop();
		}
		else
		{
			while(!main.empty())
			{
				T v = main.pop();
				secondary.push(v);
			}
		}
		return secondary.pop();
	}
	
	public static void main(String args[])
	{
		QueueWith2Stacks<Integer> queue = new QueueWith2Stacks<Integer>();
		for(int i=0;i<5;i++)
		{
			queue.enqueue(i);
		}
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());System.out.println(queue.dequeue());System.out.println(queue.dequeue());
	}
}
