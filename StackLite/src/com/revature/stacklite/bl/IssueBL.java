package com.revature.stacklite.bl;

import java.util.List;

import com.revature.stacklite.dl.Archive;
import com.revature.stacklite.models.Issue;

public class IssueBL implements IssueManager {
    
    //FIELDS
    private Archive repo;


    //CONSTRUCTOR
    public IssueBL(Archive repo){ this.repo = repo; }


    @Override
    public void addIssue(Issue issue) {
       
        repo.addIssue(issue);
        
    }


    @Override
    public List<Issue> getIssues() {
        
        return repo.getIssues();

    }


}
