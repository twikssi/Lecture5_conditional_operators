package by.andrey.twikss.exer5userloginservice.service;

import by.andrey.twikss.exer5userloginservice.bean.User;
import junit.framework.TestCase;
import org.junit.Test;

public class UserServiceTest extends TestCase {

    @Test
    public void testCheckUserAmountTrySignInIflessThenMaxAmountTrySignInReturnFalse(){
        var user = new User("twikssi","robotPiter");
        var userService = new UserService(user);
        user.setAmountTrySignIn(3);

        boolean expected = false;
        boolean actual = userService.checkUserAmountTrySignInIflessThenMaxAmountTrySignInReturnTrue();

        assertEquals(expected,actual);
    }

    @Test
    public void testCheckUserAmountTrySignInIflessThenMaxAmountTrySignInReturnTrue(){
        var user = new User("twikssi","robotPiter");
        var userService = new UserService(user);
        user.setAmountTrySignIn(2);

        boolean expected = true;
        boolean actual = userService.checkUserAmountTrySignInIflessThenMaxAmountTrySignInReturnTrue();

        assertEquals(expected,actual);
    }

    @Test
    public void testLogin(){
        var user = new User("twikssi","robotPiter");
        var userService = new UserService(user);

        userService.login();

        boolean expected = true;
        boolean actual = userService.login();
    }

}