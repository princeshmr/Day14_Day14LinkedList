package Day14_DataStructure;

public class LinkedListUC5<E> {

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
	
	public void popFromStart()
    {  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            if(head != tail)
				{  
                   head = head.next;  
                }    
             
            else 
				{  
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
		LinkedListUC5<Integer> ll=new LinkedListUC5<Integer>();
		ll.insertAtEnd(56);
		ll.insertAtEnd(30);
        ll.insertAtEnd(70);
        ll.display();
        System.out.println("After deletion--------");
        ll.popFromStart();      
        ll.display();

	}

}
