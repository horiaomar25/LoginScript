
public class User {
    // Attributes to hold usernames and passwords
    // Do not want to change the usernames and passwords set - made use of final
    // Security to keep them as private
    private final String userName;
    private final String password;


    // Constructor
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    // Getter method to access usernames in the Main Class
    public String getUserName() {
        return userName;
    }

    // Getter method to access usernames in the Main Class
    public String getPassword() {
        return password;
    }

    public void displaySuccessfulLoginMessage() {
        System.out.println("Congratulations! You are logged in!");
        System.out.println("Welcome " + userName + "!");
    }

    public void displayFailedLoginMessage() {
        System.out.println("Incorrect. This username and password do not exists. Please try again.");
    }


}
