package Day14_DataStructure;

public class LinkedListUC7<E> {

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
	public boolean searchElement(E value) {
		Node temp=head;
		while(temp.next != null) {
			if(temp.data==value) {
				return true;
			}
			temp=temp.next;
		}
		if(temp.data==value) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		LinkedListUC7<Integer> ll=new LinkedListUC7<Integer>();
		ll.insertAtEnd(56);
		ll.insertAtEnd(30);
        ll.insertAtEnd(70);
        ll.display();
        boolean res=ll.searchElement(30);
        System.out.println(res);
	}

}
