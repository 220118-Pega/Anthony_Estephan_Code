package com.revature.stacklite.models;

import java.util.Set;

/*
 * This is a class used to model coding issues
 * 
 * Class is a blue print or template
 *  
 * Members of a class are fields/attributes, methods, and constructors
 * 
 * Fields define characteristic of class and define dependencies of class 
 * 
 * Constructors are special methods to initialize properties of a class
 * Default constructor used if no constructor is created
 * 
 * 
 */

public class Issue {

    /*
     *  ATTRIBUTES
     */

    private String title;
    private String description;
    private int id;


    /*
     *  CONSTRUCTORS
     */

    //No Arg Constructor
    public Issue(){

        //Calls constructor of the base class
        // Implicitly calls super, just to remind self of term
        super();

    }

    //Parameterized Constructor
    public Issue(String title, String description) {

        //"this" refers to global instance in the object
        // Set the attribute to the parameter
        this.title = title;
        this.description = description;

    }

    public Issue(String title, String description, int id) {

        // "this" also used to call similar named constructors
        // Constructor chaining and overloading
        // Constructor call MUST be first line of runnable code in a statement
        this(title, description);
        this.id = id;

    }

    /*
     *  METHODS
     */

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Issue " + id +  "\nTitle: " + title + "\n" + description;
    }

}