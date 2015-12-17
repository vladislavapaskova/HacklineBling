package com.example.vladislavapaskova.hacklineblinghh;

public class DLLNode<T> extends LinkedListNode<T> {

	protected T data; //data stored in the node
	protected DLLNode<T> next; //pointer to the next node in list
	protected DLLNode<T> prev; //point to the previous node in list
	protected DLLNode<T> head;
	
	/**
	 * Constructor
	 */
	public DLLNode(){
		//this.student = student;
		this.next = null;
		this.prev = null;
	}
	
	public String getName(){
		return data.toString();
	}
	
	/**
	 * Get (pointer to) previous node
	 */
	public DLLNode<T> getPrev(){
		return prev;
	}
	
	/**
	 * Set the previous pointer to passed node
	 */
	public void setPrev( DLLNode<T> node ){
		this.prev = node;
	}
	
	/**
	 * Get (pointer to) next node.
	 **/
	public DLLNode<T> getNext(){
		return next;
	}
	
	/**
	 * Set the next pointer to passed node.
	 **/
	public void setNext( DLLNode<T> node ){
		this.next = node;
	}
	
	public static void main ( String[] args ) {
		System.out.println("DLLN Test");
	}
	
}
