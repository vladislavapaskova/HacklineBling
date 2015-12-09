package com.example.vladislavapaskova.hacklineblinghh;

public class DoublyLinkedListNode<T> extends LinkedListNode<T>
{
//instance fields
	protected DoublyLinkedListNode<T> previous; 
	
//in our linked list node class we do not have a previous defined because we are only pointing in one direction
//thus we need to add those two additional methods so that we can tailor it to a doubly linked list node

	/**
	 * Get (pointer to) previous node.
	 **/
	public DoublyLinkedListNode<T> getPrevious()
	{
		//return the previous node
		return previous; 
	}
	 
	/**
	 * Set the previous pointer to passed node.
	 **/
	public void setPrevious( DoublyLinkedListNode<T> node )
	{ 
		//set the previous node to be equal to the input/parameter
		previous=node; 
	}
	
	
}
