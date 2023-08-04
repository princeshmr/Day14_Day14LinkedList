package Day14_DataStructure;

public class LinkedListUC4<E> {


	Node head;
	Node tail;
	void insertAtEnd(E data)
	{
		Node temp=new Node(data);
		if (head==null)
		{
			head=tail=temp;
		}
		else
		{
			tail.next=temp;
		}
		tail=temp;
	}
	public void insertBetween(int index,E data)
	{
		Node t=new Node(data);
        Node temp=head;
		for (int i=1;i<=index-1 ;i++ )
		{
			temp=temp.next;
			
		}
		t.next=temp.next;
		temp.next=t;
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
		LinkedListUC4<Integer> ll=new LinkedListUC4<Integer>();
		ll.insertAtEnd(56);
        ll.insertAtEnd(70);
        ll.display();
        System.out.println("------------");
        ll.insertBetween(1,30);
        ll.display();

	}

}
