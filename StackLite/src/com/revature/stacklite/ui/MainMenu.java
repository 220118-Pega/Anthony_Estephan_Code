package com.revature.stacklite.ui;

import java.util.Scanner;

import com.revature.stacklite.bl.IssueManager;
import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

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

            System.out.println("Welcome to StackLite, how can we help you?\n[0] Create an issue\n[1] Get all issues\n[2] Get Specific Solution\n[3] Propose solution\n[x] Exit\n");
            
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
                
                case "2":
                    System.out.println("Get specific issue\n");
                    getSpecificIssues();
                    break;

                case "3":
                    System.out.println("Add solution to issue\n");
                    addSolution();
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

    private void addSolution() {

        //Query for id
        System.out.println("Enter the id of the issue to solve: ");
        String stringId = myscanner.nextLine();
        System.out.println("Enter the solution for the issue: ");
        String answer = myscanner.nextLine();
        Solution solution = new Solution(answer);
        
        try {
            solution.setIssueID(Integer.parseInt(stringId)); 
            issueManager.addSolution(solution); }
        catch (NumberFormatException e) { System.out.println("ID must be a number"); }
        catch (Exception e) { System.out.println("No issue by this ID"); }

    }


    private void getSpecificIssues() {
        
        //Query for id
        System.out.println("Enter the id of the issue: ");
        String stringId = myscanner.nextLine();
        

        
        //try to find issue with id
        try{

            //Find the issue and print it
            Issue foundIssue = issueManager.getIssueByID(Integer.parseInt(stringId));
            System.out.println(foundIssue.toString());

            //Print solutions for issue
            for(Solution solution:foundIssue.getSolutions()){

                System.out.println(solution);

            }
        
        //else it doesnt exist
        } catch (NullPointerException e){ System.out.println("No issue by this ID"); }
        catch (Exception e) { System.out.println("No issue by this ID"); }

    }


    private void createIssue() {
        
        // Get title from user
        System.out.print("Enter issue title: ");
        String title = myscanner.nextLine();
        
        // Get description from user
        System.out.print("Enter issue description: ");
        String description = myscanner.nextLine();

        Issue newIssue = new Issue(title, description);

        issueManager.addIssue(newIssue);
    }

    private void getIssues() { for (Issue issue:issueManager.getIssues()){ System.out.println(issue.toString() + "\n"); } }
}
