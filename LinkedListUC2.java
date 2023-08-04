package Day14_DataStructure;

public class LinkedListUC2<E> {

	Node head;
	Node tail;
	public void insertAtStart(E data)
	{
		Node temp=new Node(data);
		if (head==null)
		{
			head=tail=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
	}
	public void display()
	{
		Node temp=head;
		while (temp.next != null)
		{
           System.out.println(temp.data);
		   temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		LinkedListUC2<Integer> ll=new LinkedListUC2<Integer>();
		ll.insertAtStart(70);
		ll.insertAtStart(30);
		ll.insertAtStart(56);
        ll.display();
	}

}
