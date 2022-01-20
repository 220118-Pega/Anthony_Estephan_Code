package com.revature.stacklite.dl;

import java.util.ArrayList;
import java.util.List;

import com.revature.stacklite.models.Issue;

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
        
        latestId = 1;
        listOfIssue = new ArrayList<Issue>();
        listOfIssue.add(new Issue("Code no work", "My code dont work why??", 1));
        listOfIssue.add(new Issue("I get this error", "Everytime I try I get error...", 2));
        

        latestId = 3;
    }

    @Override
    public void addIssue(Issue issue) {
        
        issue.setId(latestId);
        latestId++;
        listOfIssue.add(issue);
        
    }

    @Override
    public List<Issue> getIssues() {
        // TODO Auto-generated method stub
        return this.listOfIssue;
    }

}
