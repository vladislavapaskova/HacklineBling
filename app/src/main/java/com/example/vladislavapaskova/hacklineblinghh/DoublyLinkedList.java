package com.example.vladislavapaskova.hacklineblinghh;
//http://techyrajeev.blogspot.com/2012/03/generic-doubly-linked-list-in-java.html

public class DoublyLinkedList<T> extends LinkedList<T> {

	protected DLLNode<T> head;
	protected DLLNode<T> tail;
	protected int size;
	protected int waitlistSize;
	
	/**
	 * Set up constructor
	 */
	public DoublyLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	//////////////////////////////////
	////////// GET METHODS ///////////
	//////////////////////////////////
	
	/**
	 * Returns head
	 */
	public DLLNode<T> getHead(){
		return head;
	}
	
	/**
	 * Returns data stored in head
	 */
	public T getHeadData(){
		return head.getData();
	}
	
	/**
	 * Returns number of nodes in list
	 */
	public int getSize(){
		return size;
	}
	
	/**
	 * Returns numbers of nodes in waitlist
	 */
	public int getWaitlistSize(){
		return waitlistSize;
	}

	//Randomly selects a problem from the arraylist
	public T getRandom()
	{
		DLLNode<T> newNode = head;
		int randomNum = (int)(Math.random()*size);
		for(int i =0; i<randomNum; i++){
			newNode= newNode.getNext();
		}
		return newNode.getData();
	}
	
	/////////////////////////////////////
	////////// INSERT METHODS ///////////
	/////////////////////////////////////
	
	/**
	 * Override insertFirst method
	 * Insert a new node with data at the head of the list
	 */
	public void insertFirst( T data ){
		//create new node that contains data
		DLLNode<T> newNode = new DLLNode<T>();
		newNode.setData( data );
		//if head = empty
		if( head == null ){
			head = newNode;
			tail = newNode;
			newNode.setNext( null );
			newNode.setPrev( null );
		}
		else{
			newNode.setNext( head );
			head.setPrev( newNode );
			head = newNode;
		}
		size++;
	}
	
	/**
	 * Insert new node before current node
	 * @param current
	 * @param data
	 */
	public void insertBefore( DLLNode<T> current, T data ){
		//UNUSED METHOD.....
		
		//create new node that contains data
		DLLNode<T> newNode = new DLLNode<T>();
		newNode.setData(data);
		
		newNode.setNext(current);
		current.setPrev(newNode);
		head = newNode;
		
		//DL deleted
//		newNode.setPrev(current.getPrev());
//		newNode.setNext(current);
//		current.setPrev(newNode);
//		current.getPrev().setNext(newNode);
		
		//increase size by 1
		size++;
	}
	
	/**
	 * Insert new node after current node
	 * @param current
	 * @param data
	 */
	public void insertAfter( DLLNode<T> current, T data ){
		//create new node that contains data
		DLLNode<T> newNode = new DLLNode<T>();
		newNode.setData( data );
		
		//DL's code
		DLLNode<T> nextNode = current.next;
		
		newNode.setPrev( current );
		//DL's code
		newNode.setNext( nextNode );
		
		//DL's code
		if (nextNode != null)
			nextNode.setPrev(newNode);			
			//current.getPrev().setNext( newNode );
		
		//DL's code
		current.setNext(newNode);
		
		//increase size by 1
		size++;
	}
	
	/**
	 * Insert new node to the end of the list
	 * @param student
	 */
	public void insertLast( T data ){
		//create temporary node that will contain data
		DLLNode<T> newNode = new DLLNode<T>();
		newNode.setData( data );
		//if tail = empty
		if( tail == null ){
			tail = newNode;
		} else{
			newNode.setPrev( tail );
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
	}
	
	/////////////////////////////////////
	////////// DELETE METHODS ///////////
	/////////////////////////////////////
	
	/**
	 * Remove head node
	 */
	public void deleteFirst(){
		DLLNode<T> newNode = head;
		//if the list is empty
		if ( size == 0 ){
			//set both the head and tail to null
			head = null;
			tail = null;
			//size decreases by 1
			size--;
		}
		else{
			//assign head to the following node
			head = head.getNext();
			//set the previous node (ex-head) to null
			head.setPrev( null );
			//size decreases by 1
			size--;
		}
	}
	
	/**
	 * Remove tail node
	 */
	public void deleteLast(){
		DLLNode<T> newNode = tail;
		//if the list is empty
		if ( size == 0 ){
			//set both the head and tail to null
			head = null;
			tail = null;
			//size decreases by 1
			size--;
		}
		else{
			//assign tail to the previous node
			tail = head.getPrev();
			//set the next node (ex-tail) to null
			tail.setNext( null );
			//size decreases by 1
			size--;
		}
	}
	
	/**
	 * Remove node following current
	 * If no node exists, do nothing!
	 */
	public void deleteNext( DLLNode<T> current ){
		//if the following node exists
		if( current.getNext() != null ){
			//current node points to the node after
			current.setNext( current.getNext().getNext() );
			//new node after now points back to current
			current.getNext().setPrev( current );
		}
		size--;
		
	}
	
	/**
	 * Turns DLL into a String
	 */
	public String toString() {
		//if list is empty
		if ( head == null ) {
			return "list is empty";
		} else {
			String str = head.toString();
			for ( DLLNode<T> node = head.getNext(); node != null; node = node.getNext() ) {
				str += ">" + node.getData().toString();
			}
			return str;
		}
	}
	
}
