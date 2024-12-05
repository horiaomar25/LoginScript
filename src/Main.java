import java.util.Scanner;

/* TODO
 *   What I want to work on:
 *   - Trying to split the code up into different methods so it is easier to read.
 * */
public class Main {
    public static void main(String[] args) {

        // This is an array of holding 3 Objects with 3 sets of usernames and passwords.
        User[] users = new User[3];

        users[0] = new User("John Doe", "Poodles123");
        users[1] = new User("Jane Doe", "Oranges234");
        users[2] = new User("Jack Smith", "Pizza123");


        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Will be used to check if the user has logged in
        boolean loggedIn = false;

        // Empty String value to start with.
        String inputUserName = "";
        String inputPassword = "";


        do {

            try {

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
                for (int i = 0; i < users.length; i++) {


                    // NOTE: equalsIgnoreCase is case insensitive - does not matter if username is inputted as lower or uppercase.

                    if (users[i].getUserName().equalsIgnoreCase(inputUserName)) {
                        // .equals() passwords need to be case sensitive.
                        if (users[i].getPassword().equals(inputPassword)) {
                            loggedIn = true;
                            users[i].displaySuccessfulLoginMessage();
                        } else {
                            // NOTE: Message was showing for all arrays(3 times) - a break statement will resolve this.
                            //  System.out.println("Incorrect. This username and password do not exists. Please try again.");
                            users[i].displayFailedLoginMessage();
                            break;
                        }
                    }


                }

                // If username and password are incorrect. This message will print.
                if (!loggedIn) {
                    System.out.println("You are not logged in. Please try again.");
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            // While loggedIn is false it will continue to prompt user.
        } while (!loggedIn);


    }


}
