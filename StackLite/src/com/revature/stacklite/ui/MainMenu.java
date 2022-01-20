package com.revature.stacklite.ui;

import java.util.Scanner;

import com.revature.stacklite.models.Issue;

/*
 * Class to present UI to end users
 */

public class MainMenu {
    
    // FIELDS
    private Scanner myscanner;

    
    //CONSTRUCTORS
    public MainMenu(Scanner myscanner) { this.myscanner = myscanner; }

    
    //METHODS

    // method signature: access modifier, non access modifier, return type*, methodName*, (arg)*, throws exceptions
    // * is required
    public void start() {

        boolean keepGoing = true;
        
        do {

            System.out.println("Welcome to StackLite, how can we help you?\n[0] Create an issue\n[x] Exit\n");
            
            String userInput = myscanner.nextLine();

            switch(userInput) {
                
                case "0":
                    System.out.println("Creating an issue\n");
                    Issue newIssue = new Issue();
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

}
