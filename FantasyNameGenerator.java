import java.util.Scanner;
/**
 * Write a description of class FantasyNameGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FantasyNameGenerator
{
    /**
     * This function returns the user's new first name. To do so, concatenate 
     * the first 1-3 letters of their real first name and the *lowercased* 
     * first 1-2 letters of their real last name.
     * 
     * Notes: 
     * If the user's first name is less than 3 letters, use the first two letters.
     * If the user's first name is less than 2 letters, use the only letter.
     * If the user's last name is less than 2 letters, use the only letter.
     */
    public static String getNewFirstName(String firstName, String lastName) {

    }

    /**
     * This function returns the user's new last name. To do so, concatenate 
     * the first 1-2 letters of their mom's maiden name and the first 1-3 letters 
     * of the *lowercased* city where they were born.
     * 
     * Notes: 
     * If the user's mom's maiden name is less than 2 letters, use the only letter.
     * If the user's birth city is less than 3 letters, use the first two letters.
     * If the user's birth city is less than 2 letters, use the only letter.
     */
    public static String getNewLastName(String momMaidenName, String cityBorn) {

    }

    /**
     * This function returns the user's title. To do so, concatenate the last 
     * 1-3 letters of their real last name, reversed (uppercase the last 
     * letter of their real last name), and the *lowercased* model of their 
     * dream car.
     * 
     * Notes: 
     * If the user's last name is less than 3 letters, use the first 2.
     * If the user's last name is less than 2 letters, use the only letter.
     */
    public static String getTitle(String lastName, String dreamCar) {

    }

    /**
     * This function returns the user's full honorific. To do so, concatenate 
     * their title, " of ", and the name of the street they live on.
     */
    public static String getHonorific(String lastName, String dreamCar, String street) {

    }

    /**
     * This function runs the program. At the very least it should ask the 
     * user to answer a series of questions, each setting one of the global 
     * variables to what the user typed in. It should then call the functions 
     * above to produce the user's fantasy name (set fantasyName to that), 
     * and display it for the user to see.
     */
    public static void main(String[] args) {

    }
}
