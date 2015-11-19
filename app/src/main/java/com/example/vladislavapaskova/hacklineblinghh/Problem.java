
public class Problem {

	//main question + answer
	protected String que;
	protected String ans;
	
	//hints
	protected String h1;
	protected String h2;
	
	/* COMPLEXITY VARIABLES
	 * will update later
	//average runtime q + a
	protected String qAvg;
	protected String aAvg;
	
	//worst runtime q + a
	protected String qWst;
	protected String aWst;
	
	//space complexity q + a
	protected String qSpc;
	protected String aSpc;
	*/
	
	//category of the problem (ie. arrays, stacks, bst)
	protected String cat;
	
	//boolean variables to track user progress
	protected boolean isCorrect;
	protected boolean isStarred;
	protected boolean isApproved;
	
	/**
	 * Constructor
	 * @param que
	 * @param ans
	 * @param h1
	 * @param h2
	 * @param cat
	 */
	
	public Problem( String que, String ans, String h1, String h2, String cat ){
		this.que = que;
		this.ans = ans;
		this.h1 = h1;
		this.h2 = h2;
		this.cat = cat;
		this.isCorrect = false;
		this.isStarred = false;
		this.isApproved = false;
	}

	/**
	 * Getter and setter functions
	 */
	
	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public String getH1() {
		return h1;
	}

	public void setH1(String h1) {
		this.h1 = h1;
	}

	public String getH2() {
		return h2;
	}

	public void setH2(String h2) {
		this.h2 = h2;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public boolean isStarred() {
		return isStarred;
	}

	public void setStarred(boolean isStarred) {
		this.isStarred = isStarred;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	
}
