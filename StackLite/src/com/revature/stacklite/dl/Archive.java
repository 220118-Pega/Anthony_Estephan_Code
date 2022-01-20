package com.revature.stacklite.dl;

import java.util.List;

import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

/*
 * Interface for repository implementation
 * @author AnthonyEstephan
 */

public interface Archive {
    void addIssue(Issue issue);
    List<Issue> getIssues();
    Issue getIssueByID(int id) throws Exception;
    void addSolution(Solution solution);
}
