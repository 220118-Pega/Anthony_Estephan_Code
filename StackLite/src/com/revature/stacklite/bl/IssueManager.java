package com.revature.stacklite.bl;

import java.util.List;

import com.revature.stacklite.models.Issue;

public interface IssueManager {
    
    void addIssue(Issue issue);
    List<Issue> getIssues();
    
}
