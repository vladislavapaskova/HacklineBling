
public class LinkedList <T> 
{
/*
 * Instance Fileds
 */
	//create an instance of the head and the tail 
	protected LinkedListNode<T> head; 
	protected LinkedListNode<T> tail; 
	//create a variable for the size
	public int size=0; 
	
	public LinkedList()
	{
		//this.head=head; 
		tail=getLastNode(); 
	}
	
	/**
	 * Get data stored in head node of list.
	 **/
	public T getFirst()
	{
		//return the data from the head
		return head.getData(); 
	}
	 
	/**
	 * Get the head node of the list.
	 **/
	public LinkedListNode<T> getFirstNode()
	{
		//return the head
		return head; 
	}
	 
	/**
	 * Get data stored in tail node of list.
	 **/
	public T getLast()
	{
		//return the data from the tail
		return tail.getData(); 
	}
	 
	/**
	 * Get the tail node of the list.
	 **/
	public LinkedListNode<T> getLastNode()
	{
		/*
		//create a new node
		LinkedListNode<T> newNode= new LinkedListNode<T> (); 
		newNode=head; 
		while(newNode!=null)
		{
			newNode=newNode.getNext(); 
		}
		tail=newNode; 
		*/
		//return the tail
		return tail; 
	}
	 
	/**
	 * Insert a new node with data at the head of the list.
	 **/
	public void insertFirst( T data )
	{
		//create a new node
		LinkedListNode<T> newNode= new LinkedListNode<T> (); 
		//put data at the head 
		newNode.setData(data); 
		//point it to the old head
		newNode.setNext(head);
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
	public void insertAfter( LinkedListNode<T> currentNode, T data )
	{
		
		//create a new node
		LinkedListNode<T> newNode= new LinkedListNode<T> ();
		//put data at the head 
		newNode.setData(data);
		//set the next node to new node
		newNode.setNext(currentNode.getNext());
		//set new node to be next to current node
		currentNode.setNext(newNode);
		if(currentNode.equals(tail))
		{
			tail=newNode; 
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
		LinkedListNode<T> newNode= new LinkedListNode<T> (); 
		//put data at the head 
		newNode.setData(data); 
		//put it at last position
		tail.setNext(newNode);
		//reset the tale
		tail=newNode; 
		//increment the size 
		size++;
	}
	 
	/**
	 * Remove head node
	 **/
	public void deleteFirst()
	{
		//create a new node
		LinkedListNode<T> newNode= new LinkedListNode<T> (); 
		//assign this to be the head one
		newNode=head; 
		//made head null
		head=null; 
		//reassign head
		head=newNode.getNext(); 
		//decrement the size 
		size--;
	}
	 
	/**
	 * Remove tail node
	 **/
	public void deleteLast()
	{
		//create a new node
		LinkedListNode<T> newNode= head;
		//assign this to be the head one
		LinkedListNode<T> previous=head; 
		//check until node is not a tail
		while(newNode!=tail)
		{
			//assign previous
			previous=newNode; 
			//increment nre node
			newNode=newNode.getNext(); 
		}
		tail=previous;  
		//newNode.setNext(null); 
		//decrement the size 
		size--;
	}
	 
	/**
	 * Remove node following currentNode
	 * If no node exists (i.e., currentNode is the tail), do nothing
	 **/
	public void deleteNext( LinkedListNode<T> currentNode )
	{	
		//check if the array is empty or if the tail is the head
		if(size==0||currentNode==tail)
		{
			return;
		}
		else
		{
		//create a new node
		LinkedListNode<T> next= new LinkedListNode<T> ();
		////make next the node after the current node
		next=currentNode.getNext(); 
		//set the current node to be two nodes away
		currentNode.setNext(next.getNext()); 
		//set the next to next to null
		next.setNext(null); 
		next=null; 
		
		//decrement the size 
		size--;
		}
	}
	 
	/**
	 * Return the number of nodes in this list.
	 **/
	public int size()
	{
		//var for size
		int sizeInt=0; 
		//create a new node
		LinkedListNode<T> newNode= new LinkedListNode<T> (); 
		//assign it to the head
		newNode=head;
		//check until it is not a null
		while(newNode!=null)
		{
			//increment new node
			newNode=newNode.getNext();
			sizeInt++;
		}
		size=sizeInt; 
		//return the size
		return size; 
	}
	 
	/**
	 * Check if list is empty.
	 * @return true if list contains no items.
	 **/
	public boolean isEmpty()
	{
		/*
		//create a new node
		LinkedListNode<T> newNode= new LinkedListNode<T> (); 
		//assign this to be the head one
		newNode=head; 
		//make a for loop to go through the list
		for(int i=0; i<size; i++)
		{
			//check if the current node is null
			if(newNode=null)
			{
				//if there is a null return true
				return true; 
			}
			else
			{
				//reassign new node to be the next node
				newNode=newNode.getNext(); 

			}
		}
		//if none of them were true return false
		return false; 
		*/
		//check if size is equal to zero, there will be nothing
		if(size==0)
		{
			return true; 
		}
		return false; 
		
	}
	 
	/**
	 * Return a String representation of the list.
	 **/
	public String toString()
	{
		//create a new node
		LinkedListNode<T> newNode= new LinkedListNode<T> (); 
		//assign this to be the head one
		newNode=head;
		//initialize the printing var
		String print="";

		for(int i=0; i<size; i++)
		{
			//add each data point
			print += newNode.toString();
			//increment newNode
			newNode=newNode.getNext(); 
		}
		return print; 
	}
	public String toStringPlus()
		{
		//create a new node
		LinkedListNode<T> newNode= new LinkedListNode<T> (); 
		//assign this to be the head one
		newNode=head;
		String print=""; 
		for(int i=0; i<size; i++)
		{
			print += newNode.toString() + "->"; 
			newNode=newNode.getNext(); 
		}
		print=print.substring(0, print.length()-2);
		return print; 
		}

}