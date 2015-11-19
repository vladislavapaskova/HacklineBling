import java.util.Hashtable;
import java.io.*;

public class Database {
	
	//declare hash table
	private Hashtable<String, DoublyLinkedList> database;
	
	//declare  linked lists
	public DoublyLinkedList<Problem> stringsList; 
	public DoublyLinkedList<Problem> arraysList; 
	public DoublyLinkedList<Problem> treesList; 
	public DoublyLinkedList<Problem> stacksList; 
	public DoublyLinkedList<Problem> heapsList; 
	public DoublyLinkedList<Problem> linkedlistsList; 
	public DoublyLinkedList<Problem> queuesList; 
	
	//declare keys inside the hash table
	private String stringsKey; 
	private String arraysKey; 
	private String treesKey; 
	private String stacksKey; 
	private String heapsKey; 
	private String linkedlistsKey; 
	private String queuesKey;
	
	
	public Database(){
		
		//initiate the array
		database = new Hashtable<String, DoublyLinkedList>();
		
		//initialize linked lists
		stringsList = new DoublyLinkedList<Problem>();
		arraysList = new DoublyLinkedList<Problem>();
		treesList = new DoublyLinkedList<Problem>();
		stacksList = new DoublyLinkedList<Problem>();
		heapsList = new DoublyLinkedList<Problem>();
		linkedlistsList = new DoublyLinkedList<Problem>();
		queuesList = new DoublyLinkedList<Problem>();
		
		//initialize strings
		stringsKey = "strings";
		arraysKey = "arrays";
		treesKey = "trees";
		stacksKey = "stacks";
		heapsKey = "heaps";
		linkedlistsKey = "linkedlists";
		queuesKey = "queues";
		
		makeHashtable();
		
	}
	
	//make hashtable
	//put keys + doubly linked lists
	private void makeHashtable()
	{
		//7x, stringKey + DLL
		database.put(stringsKey, stringsList);
		database.put(arraysKey, arraysList);
		database.put(treesKey, treesList);
		database.put(stacksKey, stacksList);
		database.put(heapsKey, heapsList);
		database.put(linkedlistsKey, linkedlistsList);
		database.put(queuesKey, queuesList);
	}
	
	//function reads in csv and adds it to the hashtable
	private void transferCSV( File file ){
		//use reader to read CSV file and retrieve elements
		//put elements into Problem object
		//put Problem object inside database 
	}
	
}
