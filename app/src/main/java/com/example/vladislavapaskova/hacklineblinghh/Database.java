package com.example.vladislavapaskova.hacklineblinghh;
import java.util.Hashtable;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;

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

    public Problem problemAtHand;
	
	
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
        problemAtHand = null;
		
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
        try {
            //create a variable for the problem attributes
            CsvReader problemAtt = new CsvReader("Test2.csv");

            problemAtt.readHeaders();

            while (problemAtt.readRecord())
            {
                String cat = problemAtt.get("cat");
                String que = problemAtt.get("que");
                String ans = problemAtt.get("ans");
                String h1 = problemAtt.get("h1");
                String h2 = problemAtt.get("h2");
                String sourceLink = problemAtt.get("sourceLink");

                //create the problem
                Problem problem = new Problem(que, ans, h1, h2, cat, sourceLink);
                //insert the problem into the database
                insertProblem(problem);
            }

            problemAtt.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void insertProblem(Problem problem)
    {
        switch (problem.getCat())
        {
            case "arrays":
                arraysList.insertFirst(problem);
                break;
            case "strings":
                stringsList.insertFirst(problem);
                break;
            case "trees":
                treesList.insertFirst(problem);
                break;
            case "stacks":
                stacksList.insertFirst(problem);
                break;
            case "heaps":
                heapsList.insertFirst(problem);
                break;
            case "linkedlists":
                linkedlistsList.insertFirst(problem);
                break;
            case "queues":
                queuesList.insertFirst(problem);
                break;
        }

    }
    public String retrieve(String str)
    {
        switch (str)
        {
            case "One":
                //ANYTHING IN REALITY COME BACK TO IT !!!!
                problemAtHand = stacksList.getRandom();
                break;
            case "Two":
                problemAtHand = arraysList.getRandom();
                break;
            case "Tree":
                problemAtHand = heapsList.getRandom();
                break;
            case "Four":
                problemAtHand = linkedlistsList.getRandom();
                break;
            case "Five":
                problemAtHand = stacksList.getRandom();
                break;
            case "Six":
                problemAtHand = stringsList.getRandom();
                break;
            case "Seven":
                problemAtHand = treesList.getRandom();
                break;
            case "Eight":
                problemAtHand = queuesList.getRandom();
                break;

        }

        return problemAtHand.getQue();
    }
    public String retrieveAnswer()
    {
        return problemAtHand.getAns();
    }
}
