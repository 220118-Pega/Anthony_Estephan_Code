package com.revature.stacklite.bl;

import java.util.List;

import com.revature.stacklite.dl.Archive;
import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

public class IssueBL implements IssueManager {
    
    //FIELDS
    private Archive repo;


    //CONSTRUCTOR
    public IssueBL(Archive repo){ this.repo = repo; }


    //METHODS
    @Override
    public void addIssue(Issue issue) {
       
        repo.addIssue(issue);
        
    }

    @Override
    public List<Issue> getIssues() {
        
        return repo.getIssues();

    }

    @Override
    public Issue getIssueByID(int id) throws Exception{
        // TODO Auto-generated method stub
        return repo.getIssueByID(id);
    }


    @Override
    public void addSolution(Solution solution) throws Exception{
        // TODO Auto-generated method stub
        repo.addSolution(solution);
        
    }

}
