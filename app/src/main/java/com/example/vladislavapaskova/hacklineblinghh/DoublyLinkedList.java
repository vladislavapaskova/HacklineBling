
public class DoublyLinkedList<T> extends LinkedList<T> 
{

	//instance fields
	//same as the linked list
	
	/**
	 * Insert a new node with data at the head of the list.
	 **/
	public void insertFirst( T data )
	{
		//create a new node
		DoublyLinkedListNode<T> newNode= new DoublyLinkedListNode<T> (); 
		//put data at the head 
		newNode.setData(data); 
		//point it to the old head
		newNode.setNext(head);
		//make the old one point back to the new one
		((DoublyLinkedListNode<T>)head).setPrevious(newNode); 
		//set the new node to be the head
		head=newNode;
		if(size==0)
		{
			tail=head; 
		}
		//increment the size 
		size++;
	}
	
	/**
	 * Insert a new node with data after currentNode
	 **/
	public void insertAfter( DoublyLinkedListNode<T> currentNode, T data )
	{
		
		//create a new node
		DoublyLinkedListNode<T> newNode= new DoublyLinkedListNode<T> ();
		
		//put data at the head 
		newNode.setData(data);
		//set new node to be next to current node
		currentNode.setNext(newNode);
		//set the current node to be the previous of the new node
		newNode.setPrevious(currentNode);
		if(currentNode.equals(tail))
		{
			tail=newNode; 
		}
		else
		{
			DoublyLinkedListNode<T> currentNextNode = new DoublyLinkedListNode<T>();
			currentNextNode= (DoublyLinkedListNode<T>) currentNode.getNext();
			//set the next node to new node
			newNode.setNext(currentNextNode);
			//set the previous node to the new node
			currentNextNode.setPrevious(newNode);
		}
		//increment the size 
		size++;
	}
	
	/**
	 * Insert a new node with data at the tail of the list.
	 **/
	public void insertLast( T data )
	{
		//create a new node
		DoublyLinkedListNode<T> newNode= new DoublyLinkedListNode<T> (); 
		//put data at the head 
		newNode.setData(data); 
		//put it at last position
		tail.setNext(newNode);
		DoublyLinkedListNode<T> oldEnd = new DoublyLinkedListNode<T> ();
		oldEnd = (DoublyLinkedListNode<T>) tail; 
		newNode.setPrevious(oldEnd);
		//reset the tale
		tail=newNode; 
		//increment the size 
		size++;
	}

	/**
	 * Remove node following currentNode
	 * If no node exists (i.e., currentNode is the tail), do nothing
	 **/
	public void deleteNext( DoublyLinkedListNode<T> currentNode )
	{	
		//check if the array is empty or if the tail is the head
		if(size==0||currentNode==tail)
		{
			return;
		}
		else
		{
		//create a new node
		DoublyLinkedListNode<T> next= new DoublyLinkedListNode<T> ();
		////make next the node after the current node
		next=(DoublyLinkedListNode<T>) currentNode.getNext(); 
		//set the current node to be two nodes away
		currentNode.setNext(next.getNext()); 
		((DoublyLinkedListNode<T>) next.getNext()).setPrevious(currentNode);
		//set the next to next to null
		next.setNext(null); 
		next=null; 
		
		//decrement the size 
		size--;
		}
	}
	
	
	
}
