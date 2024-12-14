import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void login(ArrayList<User> users, Menu menu) {


        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Will be used to check if the user has logged in
        boolean loggedIn = false;

        // Empty String value to start with.
        String inputUserName = "";
        String inputPassword = "";


        do {
            try {

                menu.showMenu();

                System.out.println("Welcome to the Login Script");


                // Validation - makes sure that username is entered. Will keep looping to makes sure that User types something.
                while (inputUserName.isEmpty()) {
                    System.out.println("Please enter your username: ");
                    inputUserName = scanner.nextLine().trim(); // Spaces cannot be entered. Will still request username.

                    if (inputUserName.isEmpty()) {
                        System.out.println("You are required to enter a username");
                    }
                }

                System.out.println("Please enter your password: ");
                inputPassword = scanner.nextLine().trim();

                // Need to loop through array of Objects where I have stored the usernames and passwords
                for (int i = 0; i < users.size(); i++) {
                    // NOTE: equalsIgnoreCase is case insensitive - does not matter if username is inputted as lower or uppercase.

                    if (users.get(i).getUserName().equalsIgnoreCase(inputUserName)) {
                        // .equals() passwords need to be case sensitive.
                        if (users.get(i).getPassword().equals(inputPassword)) {
                            loggedIn = true;
                            users.get(i).displaySuccessfulLoginMessage();
                        } else {
                            // NOTE: Message was showing for all arrays(3 times) - a break statement will resolve this.
                            //  System.out.println("Incorrect. This username and password do not exists. Please try again.");
                            users.get(i).displayFailedLoginMessage();
                            break;
                        }
                    }


                }

                // If username and password are incorrect. This message will print. Will restart the login proccess.
                if (!loggedIn) {
                    System.out.println("You are not logged in. Please try again.");
                    inputUserName = "";
                    inputPassword = "";
                    continue;
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            // While loggedIn is false it will continue to prompt user.
        } while (!loggedIn);
    }
}
