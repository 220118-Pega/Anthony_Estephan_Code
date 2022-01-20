package com.revature.stacklite;

import java.util.Scanner;

import com.revature.stacklite.bl.IssueBL;
import com.revature.stacklite.bl.IssueManager;
import com.revature.stacklite.dl.InMemoryRepo;
import com.revature.stacklite.models.Issue;
import com.revature.stacklite.ui.MainMenu;

public class Driver {
    public static void main(String[] args) {
        
        /*
        Issue issue = new Issue();
        Issue idIssue = new Issue("Title","This is an issue.",69);
        System.out.println(idIssue.toString());
        */

        MainMenu menu = new MainMenu(new Scanner(System.in), new IssueBL(new InMemoryRepo()));
        menu.start();
    }
}