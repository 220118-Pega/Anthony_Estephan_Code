package com.reverature.hangman;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

    private static final int CHANCES_REMAINING = 6; // Number of tries before all body parts are hung

    public static void main(String[] args) {
        
        int chances = CHANCES_REMAINING;

        //Query user
        System.out.println("Enter word to guess: ");

        //Initiate scanner and get a word
        Scanner scanner = new Scanner(System.in);
        String mysteryWord = scanner.nextLine();

        System.out.println("The word is: " + mysteryWord);
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        //Query player for letter
        System.out.println("Guess a letter: ");

        //Initiate a scanner to get a letter
        Scanner letterScanner = new Scanner(System.in);
        
        String word = mysteryWord;
        List<String> correctlyGuessedLetters = new ArrayList<String>();

        while(chances != 0){
            
            //Get letter
            String guessedLetter = letterScanner.nextLine();

            //Check if letter is in the word
            if( mysteryWord.contains(guessedLetter)) {
            
                //Replace letter with blank (remove letter)
                word = word.replaceAll(guessedLetter,"");
                correctlyGuessedLetters.add(guessedLetter);
                System.out.println("Correct there is/are " + guessedLetter);

            } else {

                //Deduct chance
                chances--;
                System.out.println("Sorry there is/are no " + guessedLetter);
            
            }

            //Print current state of word Using wrapper class
            //Character in order to use toString method
            for(Character letter:mysteryWord.toCharArray()) {

                if(correctlyGuessedLetters.contains(letter.toString())){ System.out.print(letter.toString()); }
                else { System.out.print("_"); }

            }

            //Start new line
            System.out.println("");

            //Player guessed entire word
            if(word.length() == 0){
                
                System.out.println("Congratulations you guessed the word: " + mysteryWord);
                break;
            
            }

        }

        //Player ran out of guesses
        if(chances == 0){ System.out.println("Better luck next time!!!"); }

    }

}