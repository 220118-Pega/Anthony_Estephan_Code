package com.revature.stacklite.dl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

/*
 * Repository that connects to an inmemory storage
 * Static list of issues and solutions
 * @author AnthonyEstephan
 */

public class InMemoryRepo implements Archive {

    //FIELDS
    private static List<Issue> listOfIssue;
    private static int latestId;


    //Constructor
    public InMemoryRepo() {
        
        List<Solution> listA = new ArrayList<Solution>(Arrays.asList(new Solution("Dont be dumb lol", 12, 1)));
        List<Solution> listB = new ArrayList<Solution>(Arrays.asList(new Solution("Git gud", 21, 2)));

        latestId = 1;
        listOfIssue = new ArrayList<Issue>();
        listOfIssue.add(new Issue("Code no work", "My code dont work why??", 1, listA));
        listOfIssue.add(new Issue("I get this error", "Everytime I try I get error...", 2, listB));
        

        latestId = 3;
    }

    @Override
    public void addIssue(Issue issue) {
        
        issue.setId(latestId);
        System.out.println("\n" + issue.toString() + "\n");

        latestId++;
        listOfIssue.add(issue);
        
    }

    @Override
    public List<Issue> getIssues() {
        // TODO Auto-generated method stub
        return this.listOfIssue;
    }

    @Override
    public Issue getIssueByID(int id) throws Exception {
        // TODO Auto-generated method stub
        Issue foundIssue = null;

        for(Issue issue:listOfIssue){

            if (issue.getId() == id){
                foundIssue = issue;
            }
        }
        
        if(foundIssue == null) { throw new Exception("Issue not found"); }
        return foundIssue;
    }

    @Override
    public void addSolution(Solution solution) {
        // TODO Auto-generated method stub
        try{
            Issue issue2Update = getIssueByID(solution.getIssueID());
            List<Solution> existingSolutions = issue2Update.getSolutions();

            if(existingSolutions == null) { existingSolutions = new ArrayList<Solution>(); }

            existingSolutions.add(solution);
            issue2Update.setSolutions(existingSolutions);
        
        } catch ( Exception e) { System.out.println("No issue by this ID"); }
    }

}
