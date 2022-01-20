package com.revature.stacklite.models;

public class Solution {
    
    //FIELDS
    private String answer;
    private int id;
    private int upvote;
    private int issueID;


    //CONSTRUCTOR
    public Solution() {}

    public Solution(String answer, int upvote) {
        this.answer = answer;
        setUpvote(upvote);
    }

    public Solution(String answer){
        this(answer,0);
    }

    public Solution(String answer, int upvote, int id){
        this(answer, upvote);
        this.id = id;
    }


    //METHODS

    public String getAnswer() {
        return answer;
    }

    public int getId() {
        return id;
    }

    public int getUpvote() {
        return upvote;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUpvote(int upvote) {
        this.upvote = upvote;
    }
    
    public int getIssueID() {
        return issueID;
    }

    public void setIssueID(int issueID) {
        this.issueID = issueID;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
