import java.util.Scanner;


public class FamousQuotes {

    public static void main(String[] args) {
        // assignment scope
        // create an array of strings to store 10 quotes.
        // ask user to select quote

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

            try {
            // ask user to select a quote
            System.out.print("Choose a quote (1-10): ");
            int choice = scnr.nextInt();    // stores users input/choice

            choice--; // change number from range 1-10 to range 0-9

            // as long as user entered a number in the range
            //1-10 this will work, otherwise the index is out of range

            System.out.println(quotes[choice]);



        }
        catch (Exception e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();

        }
        scnr.close();
    }
}
