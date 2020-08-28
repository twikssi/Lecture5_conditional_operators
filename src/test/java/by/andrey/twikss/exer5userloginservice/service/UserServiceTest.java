package by.andrey.twikss.exer5userloginservice.service;

import by.andrey.twikss.exer5userloginservice.bean.User;
import junit.framework.TestCase;
import org.junit.Test;

public class UserServiceTest extends TestCase {


    @Test
    public void testBlockUserOrIncreaseAmounTrySignInReturnNumber(){
        var user = new User("twikssi","robotPiter");
        var userService = new UserService(user);
        userService.blockUserOrIncreaseAmounTrySignIn();
        userService.blockUserOrIncreaseAmounTrySignIn();

        int expected = 2;
        int actual = user.getAmountTrySignIn();

        assertEquals(expected,actual);
    }

    @Test
    public void testBlockUserOrIncreaseAmounTrySignInReturnTrue(){
        var user = new User("twikssi","robotPiter");
        var userService = new UserService(user);
        userService.blockUserOrIncreaseAmounTrySignIn();
        userService.blockUserOrIncreaseAmounTrySignIn();
        userService.blockUserOrIncreaseAmounTrySignIn();

        boolean expected = true;
        boolean actual = user.isBlocked();

        assertEquals(expected,actual);
    }

    @Test
    public void testLoginReturnTrue(){
        var user = new User("twikssi","robotPiter");
        var userService = new UserService(user);

        boolean expected = true;
        boolean actual = userService.login("robotPiter");

        assertEquals(expected,actual);
    }

    @Test
    public void testLoginReturnFalse(){
        var user = new User("twikssi","robotPiter");
        var userService = new UserService(user);
        userService.login("dsfs");
        userService.login("ds");

        boolean expected = false;
        boolean actual = userService.login("robotPite");

        assertEquals(expected,actual);
    }

    @Test
    public void testLoginReturnSecondTrue(){
        var user = new User("twikssi","robotPiter");
        var userService = new UserService(user);
        userService.login("dsfs");

        boolean expected = false;
        boolean actual = userService.login("robotPite");

        assertEquals(expected,actual);
    }

    @Test
    public void testLoginReturnThirdFalse(){
        var user = new User("twikssi","robotPiter");
        var userService = new UserService(user);
        user.setBlocked(true);

        boolean expected = false;
        boolean actual = userService.login("robotPiter");

        assertEquals(expected,actual);
    }
}