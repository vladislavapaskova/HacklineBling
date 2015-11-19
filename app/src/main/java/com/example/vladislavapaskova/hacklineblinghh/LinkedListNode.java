
public class LinkedListNode <T>
{
	/* 
	 * Instance Fields
	 */
	//data
	protected T data; 
	//next node
	protected LinkedListNode next; 

	public LinkedListNode()
	{
		
	}
	
	/**
	 * Get the data stored at this node.
	 **/
	public T getData()
	{
		//return the data
		return data; 
	}
	 
	/**
	 * Set the data stored at this node.
	 **/
	public void setData( T data )
	{
		//set the data to be equal
		this.data = data; 
	}
	 
	/**
	 * Get (pointer to) next node.
	 **/
	public LinkedListNode<T> getNext()
	{
		//return the next node
		return next; 
	}
	 
	/**
	 * Set the next pointer to passed node.
	 **/
	public void setNext( LinkedListNode<T> node )
	{ 
		//set the next node to be equal to the input/parameter
		next=node; 
	}
	 
	/**
	 * Returns a String representation of this node.
	 **/
	public String toString()
	{
		//return the string representation of data
		return data.toString(); 
	}
}
