import java.util.Scanner;

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
        String inputUsername = "";
        String inputPassword = "";


        do {

            try {

                System.out.println("Welcome to the Login Script");


                System.out.println("Please enter your username: ");

                // Prompts user to enter username
                inputUsername = scanner.nextLine();

                System.out.println("Please enter your password: ");
                inputPassword = scanner.nextLine();

                // Need to loop through array of Objects where I have stored the usernames and passwords
                for (int i = 0; i < users.length; i++) {


                    // users[i].getPassword(); - access to all passwords
                    // System.out.println(users[i].getUserName()); - access to all usernames

                    // NOTE: equalsIgnoreCase is case insensitive - does not matter if username is inputted as lower or uppercase.

                    if (users[i].getUserName().equalsIgnoreCase(inputUsername)) {
                        System.out.println("Correct username"); // Will let the user know if they inputted the correct username.
                    }

                    // .equals() passwords need to be case sensitive.
                    if (users[i].getPassword().equals(inputPassword)) {
                        loggedIn = true;
                        System.out.println("Congratulations! You are logged in!");
                    } else {
                        // NOTE: Message was showing for all arrays(3 times) - a break statement will resolve this.
                        System.out.println("Incorrect. This username and password do not exists. Please try again.");
                        break;
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
