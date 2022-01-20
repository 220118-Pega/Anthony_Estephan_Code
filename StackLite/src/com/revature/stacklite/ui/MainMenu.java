package com.revature.stacklite.ui;

import java.util.Scanner;

import com.revature.stacklite.bl.IssueManager;
import com.revature.stacklite.models.Issue;

/*
 * Class to present UI to end users
 */

public class MainMenu {
    
    // FIELDS
    private Scanner myscanner;
    private IssueManager issueManager;

    
    //CONSTRUCTORS
    public MainMenu(Scanner myscanner, IssueManager issueManager) {
    
        this.myscanner = myscanner; 
        this.issueManager = issueManager;

    }

    
    //METHODS

    // method signature: access modifier, non access modifier, return type*, methodName*, (arg)*, throws exceptions
    // * is required
    public void start() {

        boolean keepGoing = true;
        
        do {

            System.out.println("Welcome to StackLite, how can we help you?\n[0] Create an issue\n[1] Get all issues\n[x] Exit\n");
            
            String userInput = myscanner.nextLine();

            switch(userInput) {
                
                case "0":
                    System.out.println("Creating an issue\n");
                    createIssue();
                    break;
                
                case "1":
                    System.out.println("Get issues\n");
                    getIssues();
                    break;

                case "x":
                    System.out.println("Goodbye!\n");
                    keepGoing = false;
                    break;
            
                default:
                    System.out.println("Please check your input.\n");
                    break;
            
            }

        } while(keepGoing);

    }

    private void createIssue() {
        
        // Get title from user
        System.out.print("Enter issue title: ");
        String title = myscanner.nextLine();
        
        // Get description from user
        System.out.print("Enter issue description: ");
        String description = myscanner.nextLine();

        Issue newIssue = new Issue(title, description);
        System.out.println(newIssue.toString());

        issueManager.addIssue(newIssue);
    }

    private void getIssues() { for (Issue issue:issueManager.getIssues()){ System.out.println(issue.toString() + "\n"); } }
}
