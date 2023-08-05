package Day14_DataStructure;

public class LinkedListUC8<E> {

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
	public void insertBetween(E value,E data) {
		Node t=new Node(data);
		Node temp=head;
		while(temp.next != null) {
			if(temp.data==value) {
				t.next=temp.next;
				temp.next=t;
			}
			temp=temp.next;
		}
		if(temp.data==value) {
			t.next=temp.next;
			temp.next=t;

		}
	}
	public static void main(String[] args) {
		LinkedListUC8<Integer> ll=new LinkedListUC8<Integer>();
		ll.insertAtEnd(56);
		ll.insertAtEnd(30);
        ll.insertAtEnd(70);
        ll.display();
        System.out.println("Insert the element after the 30 value :-");
        ll.insertBetween(30,40);
        ll.display();

	}

}
