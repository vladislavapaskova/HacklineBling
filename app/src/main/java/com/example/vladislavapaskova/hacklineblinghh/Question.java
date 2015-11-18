package com.example.vladislavapaskova.hacklineblinghh;

/**
 * Created by vladislavapaskova on 11/7/15.
 */
public class Question {

    protected String qData;
    protected String answer;
    protected String hint1;
    protected String hint2;
    protected String complexityAvgQ;
    protected String complexityWstQ;
    protected String complexitySpcQ;
    protected String qType;
    protected boolean isCorrect;
    protected boolean isStarred;

    public Question( String qData, String answer, String hint1, String hint2,
                     String complexityAvgQ, String complexityWstQ, String complexitySpcQ,
                     String qType ){
        this.qData = qData;
        this.answer = answer;
        this.hint1 = hint1;
        this.hint2 = hint2;
        this.complexityAvgQ = complexityAvgQ;
        this.complexityWstQ = complexityWstQ;
        this.complexitySpcQ = complexitySpcQ;
        this.qType = qType;
        this.isCorrect = false;
        this.isStarred = false;
    }

    public Question( String qData, String answer, String qType ){
        this.qData = qData;
        this.answer = answer;
        this.qType = qType;
    }

    //GETTERS AND SETTERS FOR VARIABLES
    public String getqData() {
        return qData;
    }

    public void setqData(String qData) {
        this.qData = qData;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getHint1() {
        return hint1;
    }

    public void setHint1(String hint1) {
        this.hint1 = hint1;
    }

    public String getHint2() {
        return hint2;
    }

    public void setHint2(String hint2) {
        this.hint2 = hint2;
    }

    public String getComplexityAvgQ() {
        return complexityAvgQ;
    }

    public void setComplexityAvgQ(String complexityAvgQ) {
        this.complexityAvgQ = complexityAvgQ;
    }

    public String getComplexityWstQ() {
        return complexityWstQ;
    }

    public void setComplexityWstQ(String complexityWstQ) {
        this.complexityWstQ = complexityWstQ;
    }

    public String getComplexitySpcQ() {
        return complexitySpcQ;
    }

    public void setComplexitySpcQ(String complexitySpcQ) {
        this.complexitySpcQ = complexitySpcQ;
    }

    public String getqType() {
        return qType;
    }

    public void setqType(String qType) {
        this.qType = qType;
    }

    public boolean getCorrect(){
        return isCorrect;
    }

    public void setCorrect( boolean isCorrect ){
        this.isCorrect = isCorrect;
    }

    public boolean getStarred(){
        return isStarred;
    }

    public void setStarred( boolean isStarred ){
        this.isStarred = isStarred;
    }
}
