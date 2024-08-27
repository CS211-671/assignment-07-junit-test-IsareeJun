package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList userList ;
    @BeforeEach
    void init(){
        userList = new UserList();

    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        userList.addUser("Front","12345");
        userList.addUser("Back","56789");
        userList.addUser("fern","98765");

        // TODO: find one of them
        User user = userList.findUserByUsername("Front");

        // TODO: assert that UserList found User
         String expected = "Front";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }


    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("Front","12345");
        userList.addUser("Back","56789");
        userList.addUser("fern","98765");

        // TODO: change password of one user
        boolean actual = userList.changePassword("Front","12345","11111");

        // TODO: assert that user can change password

        assertTrue(actual);

    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Front","12345");
        userList.addUser("Back","56789");
        userList.addUser("fern","98765");

        // TODO: call login() with correct username and password
        User expected = userList.findUserByUsername("Back");
        User actual = userList.login("Back", "56789");
        // TODO: assert that User object is found
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Front","12345");
        userList.addUser("Back","56789");
        userList.addUser("fern","98765");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("fen","98765");
        // TODO: assert that the method return null
         assertNull(actual);
    }

}