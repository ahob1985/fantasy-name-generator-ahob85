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
        String newFirstName = "";
        if(firstName.length() < 3) {
            newFirstName += firstName.substring(0, firstName.length());
        } else {
            newFirstName += firstName.substring(0, 3);
        }
        if(lastName.length() < 2) {
            newFirstName += lastName.toLowerCase(); 
        } else {
            newFirstName += lastName.substring(0, 2).toLowerCase();
        }
        return newFirstName;
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
        String newLastName = "";
        if(momMaidenName.length() < 2) {
            newLastName += momMaidenName;
        } else {
            newLastName += momMaidenName.substring(0, 2);
        }
        if(cityBorn.length() < 3) {
            newLastName += cityBorn.substring(0, cityBorn.length()).toLowerCase();
        } else {
            newLastName += cityBorn.substring(0, 3).toLowerCase();
        }
        return newLastName;
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
        String title = "";
        if(lastName.length() >= 1) {
            title += String.valueOf(lastName.charAt(lastName.length() - 1)).toUpperCase();
        }
        if(lastName.length() >= 2) {
            title += String.valueOf(lastName.charAt(lastName.length() - 2)).toLowerCase();
        }
        if(lastName.length() >= 3) {
            title += String.valueOf(lastName.charAt(lastName.length() - 3)).toLowerCase();
        }
        return title + dreamCar.toLowerCase();
    }

    /**
     * This function returns the user's full honorific. To do so, concatenate 
     * their title, " of ", and the name of the street they live on.
     */
    public static String getHonorific(String lastName, String dreamCar, String street) {
        return getTitle(lastName, dreamCar) + " of " + street;
    }

    /**
     * This function runs the program. At the very least it should ask the 
     * user to answer a series of questions, each setting a variable relevant
     * to what the user typed in (e.g., firstName). It should then call the 
     * functions above to produce the user's fantasy name and display it for 
     * the user to see.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fantasy Name Generator");
        System.out.println("By: Hidden Genius");
        System.out.println("To generate your fantasy name, please answer these questions.");
        System.out.print("Your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Your last name: ");
        String lastName = sc.nextLine();
        System.out.print("Your mom's maiden name: ");
        String momMaidenName = sc.nextLine();
        System.out.print("The city where you were born: ");
        String cityBorn = sc.nextLine();
        System.out.print("The model of your dream car: ");
        String dreamCar = sc.nextLine();
        System.out.print("The name of the street you live on: ");
        String street = sc.nextLine();
        String fantasyName = getNewFirstName(firstName, lastName) + " " + 
            getNewLastName(momMaidenName, cityBorn) + ", " + 
            getHonorific(lastName, dreamCar, street);
        System.out.println("All hail " + fantasyName + "!");
        System.out.println("Thank you! Goodbye!");
    }
}
