import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {
    User user = new User("John Doe", "Poodles123");

    // This makes sure that the getter method of accessing my username is working because I use this method in my loop.
    @Test
    void GetUsernameWillReturnUsername() {
        assertEquals("John Doe", user.getUserName());
    }


    // This is also another getter method that use in my login script, this test make sure it is calling the data correctly.
    @Test
    void GetPasswordWillReturnPassword() {
        assertEquals("Poodles123", user.getPassword());
    }






}