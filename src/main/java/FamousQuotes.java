import java.util.Scanner;

import java.util.Random;

public class FamousQuotes {

    public static void main(String[] args) {
        // assignment scope
        // create an array of strings to store 10 quotes.
        // ask user to select a menu option to choose a quote, a random quote or exit the application

        // title
        System.out.println("Welcome to the Famous Quote Generator");

        //initializing an array called quotes
        String[] quotes = {
                "Genius has no race. Strength has no gender. Courage has no limit. - Hidden Figures",
                "I may walk slowly, but I never walk backwards. - Abraham Lincoln",
                "The future belongs to those who believe in the beauty of their dreams. -Eleanor Roosevelt",
                "I learned that courage was not the absence of fear, but the triumph over it. - Nelson Mandela",
                "Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill",
                "Be yourself; everyone else is already taken. - Oscar Wilde", "A journey of a thousand miles begins with a single step. - Lao Tsu",
                "Live long and prosper. - Spock", "Life will find a way. -Dr.Ian Malcom",
                "You must be the change you wish to see in the world. - Mahatma Gandhi"
        };

        // initialize scanner
        Scanner scnr = new Scanner(System.in);

        // adding menu here
        // keep the application running while user exits
        boolean running = true;

        while (running) {

            // Display main menu
            System.out.println("\n==== FAMOUS QUOTES ====");
            System.out.println("1. Choose a Quote");
            System.out.println("2. Random Quote");
            System.out.println("X. Exit");
            System.out.print("Enter your choice: ");

            String menuChoice = scnr.nextLine(); // store menu choice


            try {

                // option 1 - ask user to select a quote  repeating loop
                if (menuChoice.equals("1")) {

                    System.out.print("Choose a quote (1-" + quotes.length + "): ");
                    int choice = Integer.parseInt(scnr.nextLine());

                    choice--; // converts user choice to array index

                    // display selected quote
                    System.out.println("\n" + quotes[choice]);
                }

                // option 2 - display a random quote
                else if (menuChoice.equals("2")) {

                    //generate a random array index
                    int randomIndex = (int) (Math.random() * quotes.length);

                    //display random quote
                    System.out.print("\n" + quotes[randomIndex]);
                }


                // option X - exit application
                else if (menuChoice.equalsIgnoreCase("x")) {

                    System.out.println("\nThank you! Goodbye.");
                    running = false;

                }

                // handle invalid menu options
                else {
                    System.out.println("Invalid menu option!");
                }


            }
            // handles invalid quote number or text input
            catch (Exception e) {
                System.out.println("Your number was out of range!");

            }

        }
        scnr.close();
    }

}
