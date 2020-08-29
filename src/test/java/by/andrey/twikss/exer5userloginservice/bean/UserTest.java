package by.andrey.twikss.exer5userloginservice.bean;

import junit.framework.TestCase;
import org.junit.Test;

public class UserTest extends TestCase {

    @Test
    public void testTestEqualsReturnTrue() {
        var user1 = new User("twikss","lola345");
        var user2 = new User("twikss","lola345");

        boolean expected = true;
        boolean actual = user1.equals(user2);

        assertEquals(expected,actual);
    }

    @Test
    public void testTestEqualsReturnFalse() {
        var user1 = new User("twikss","lola345");
        var user2 = new User("twikssi","lola345");

        boolean expected = false;
        boolean actual = user1.equals(user2);

        assertEquals(expected,actual);
    }


    @Test
    public void testTestHashCode() {
        var user = new User("twikss","lola345");

        boolean expected = true;
        boolean actual = user.hashCode() == 2035939555;

        assertEquals(expected,actual);
    }

    @Test
    public void testTestToString() {
        var user = new User("twikss","lola345");

        boolean expected = true;
        boolean actual = user.toString().equals("User{login='twikss', password='lola345', blockedOrNot=false, amountTrySignIn=0, MAX_AMOUNT_TRY_SIGN_IN=2}");

        assertEquals(expected,actual);
    }

    @Test
    public void testResetAmountTrySignInReturnZero(){
        var user = new User("twikss","lola345");
        user.setAmountTrySignIn(34);
        user.resetAmountTrySignIn();

        int expected = 0;
        int actual = user.getAmountTrySignIn();

        assertEquals(expected,actual);
    }

    @Test
    public void testResetAmountTrySignInReturnFalse(){
        var user = new User("twikss","lola345");
        user.setAmountTrySignIn(3);
        user.resetAmountTrySignIn();

        boolean expected = false;
        boolean actual = user.getAmountTrySignIn() == 3;

        assertEquals(expected,actual);
    }

    @Test
    public void testGetAmountTrySignIn() {
        var user = new User("twikss","lola345");
        user.setAmountTrySignIn(3);

        boolean expected = true;
        boolean actual = user.getAmountTrySignIn() == 3 ;

        assertEquals(expected,actual);
    }

    @Test
    public void testBlockUserReturnTrue (){
        var user = new User("twikss","lola345");
        user.blockUser();

        boolean expected = true;
        boolean actual = user.isBlocked();

        assertEquals(expected,actual);
    }

    @Test
    public void testIsBlockedReturnFalse() {
        var user = new User("twikss","lola345");

        boolean expected = false;
        boolean actual = user.isBlocked();

        assertEquals(expected,actual);
    }

    @Test
    public void testIncreaseAmountTrySignInReturnNumber (){
        var user = new User("twikss","lola345");
        user.increaseAmountTrySignIn();
        user.increaseAmountTrySignIn();

        int expected = 2;
        int actual = user.getAmountTrySignIn();

        assertEquals(expected,actual);

    }
}
