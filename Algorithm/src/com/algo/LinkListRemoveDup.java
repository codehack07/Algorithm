package src.com.algo;

public class LinkListRemoveDup {

	public static void main(String args[])
	{
	int length=8;
	int arr[] = {1,2,2,2,3,4,5,5};
	LinkedListNode[] nodes = new LinkedListNode[length];
	
	for (int i = 0; i < length; i++) {
		nodes[i] = new LinkedListNode(arr[i], null, null);
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
	head = removedup(head);
	System.out.println(head.printForward());

	}
	
	public static LinkedListNode removedup(LinkedListNode head)
	{
		LinkedListNode curr =head;
		LinkedListNode next=null;
		
		while(curr.next!=null)
		{
			next=curr.next;
			while( next!=null &&curr.data==next.data)
				next=next.next;
			curr.next=next;
			if(next!=null)
			curr=next;
		}
		return head;
	}
}
