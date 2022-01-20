package com.revature.stacklite.dl;

import java.util.List;

import com.revature.stacklite.models.Issue;

/*
 * Interface for repository implementation
 * @author AnthonyEstephan
 */

public interface Archive {
    void addIssue(Issue issue);
    List<Issue> getIssues();
}
