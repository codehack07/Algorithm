package src.com.algo;

public class ReverseLinkListSet {

	public static void main(String args[])
	{
	int length=8;
	LinkedListNode[] nodes = new LinkedListNode[length];
	
	for (int i = 0; i < length; i++) {
		nodes[i] = new LinkedListNode(i+1, null, null);
		}
	for (int i = 0; i < length; i++) {
		if (i < length - 1) {
		nodes[i].setNext(nodes[i + 1]);
		}
		if (i > 0) {
		nodes[i].setPrevious(nodes[i - 1]);
		}
		}
	LinkedListNode head = nodes[0];
	System.out.println(head.printForward());
	head = reverse(head,3);
	System.out.println(head.printForward());

	}
	
	public  static LinkedListNode reverse(LinkedListNode head,int k)
	{
		LinkedListNode current=head;
		
		LinkedListNode prev=null;
		LinkedListNode next=null;
		int count=0;
		
		while(current!=null && count<k)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
		}
		
		if(next!=null)
		{
			head.next=reverse(next,k);
		}
		return prev;
	}
}
