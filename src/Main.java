import java.util.ArrayList;
import java.util.Scanner;


/* TODO
 *   What I want to work on:
 *   - Trying to split the code up into different classes so it is easier to read. - DONE
 *   - Create a menu where a user can pick a options - DONE
 *   - Want to create a sign up option in the menu
 *   - Make use of Exceptions
 * */
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        // This is an array of holding 3 Objects with 3 sets of usernames and passwords.
        ArrayList<User> users = new ArrayList<User>();

        users.add(new User("JohnDoe", "Poodles123"));
        users.add(new User("JaneDoe", "Oranges234"));
        users.add(new User("JackSmith", "Pizza123"));

        boolean exit = false;
        /* ----------------------------- Create While Loop to deal with the menu ------------------*/
        while (!exit) {
            menu.showMenu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Login.login(users, menu); // Calling to run to login logic when user presses 1
                    break;
                case 2:
                    System.out.println("Exiting program...");
                    exit = true;
                    break;
            }
        }


    }




}
