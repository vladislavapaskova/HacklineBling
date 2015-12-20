package com.example.vladislavapaskova.hacklineblinghh;
import java.util.HashMap;
import java.util.ArrayList;


public class UserProgress {

	//declare hashmap to store all problems the user completed
	//key: isStarred, val: Problem
	HashMap<Boolean, Problem> completedList;
	
	//declare arraylists that store correct and incorrect problems separately
	ArrayList<Problem> correctProblems;
	ArrayList<Problem> incorrectProblems;
	
	//variables
	int correctNum;
	int incorrectNum;
	int totalNum = correctNum + incorrectNum;
	
	//constructor
	public UserProgress(){
		completedList = new HashMap<Boolean, Problem>();
		correctProblems = new ArrayList<Problem>();
		incorrectProblems = new ArrayList<Problem>();
		correctNum = 0;
		incorrectNum = 0;
	}
	
	//this method will be used when the user swipes left or right to signal a correct/incorrect problem
	//add the completed problem to the completedList (HashMap)
	public void addToList( Problem problem ){
		//put problem into the HashMap according to whether it was starred or not
		completedList.put( problem.getStarred(), problem );
		//then see if the user got the problem correct or not
		if( problem.getCorrect() == true ){
			correctProblems.add( problem );
			//also keep track the number of problems corect
			correctNum++;
		}
		else{
			incorrectProblems.add( problem );
			//keep track the number of problems wrong
			incorrectNum++;
		}
	}

	//this method will be used to let users know how they are doing 
	//creates a progress message depending on how many problems user got correct
	public String generateProgressMsg(){
		String msg = "";
		if( incorrectNum >= correctNum ){
			return msg = "Hm... You've been getting more problems wrong than correct!";
		}
		else if( incorrectNum == 0 ){
			return msg = "Wow! You're on a perfect streak!";
		}
		else{
			return msg = "Not bad! Keep practicing.";
		}
			
	}

	//GETTERS AND SETTERS
	public HashMap<Boolean, Problem> getCompletedList() {
		return completedList;
	}

	public void setCompletedList(HashMap<Boolean, Problem> completedList) {
		this.completedList = completedList;
	}

	public ArrayList<Problem> getCorrectProblems() {
		return correctProblems;
	}

	public void setCorrectProblems(ArrayList<Problem> correctProblems) {
		this.correctProblems = correctProblems;
	}

	public ArrayList<Problem> getIncorrectProblems() {
		return incorrectProblems;
	}

	public void setIncorrectProblems(ArrayList<Problem> incorrectProblems) {
		this.incorrectProblems = incorrectProblems;
	}

	public int getCorrectNum() {
		return correctNum;
	}

	public void setCorrectNum(int correctNum) {
		this.correctNum = correctNum;
	}

	public int getIncorrectNum() {
		return incorrectNum;
	}

	public void setIncorrectNum(int incorrectNum) {
		this.incorrectNum = incorrectNum;
	}
	
	
	

}
