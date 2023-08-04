package Day14_DataStructure;

public class LinkedListUC6<E> {

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
	
	public void popFromEnd()
	{  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {   
            if(head != tail ) {  
                Node temp = head;  
                //Loop through the list till the second last element such that current.next is pointing to tail  
                while(temp.next != tail) {  
                    temp = temp.next;  
                }  
                //Second last element will become new tail of the list  
                tail = temp;  
                tail.next = null;  
            }  
            //If the list contains only one element  
            //Then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
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
		LinkedListUC6<Integer> ll=new LinkedListUC6<Integer>();
		ll.insertAtEnd(56);
		ll.insertAtEnd(30);
	    ll.insertAtEnd(70);
	    ll.display();
	    System.out.println("Deleted From End Position-----------");
	    ll.popFromEnd();
	    ll.display();
	}

}
