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
        boolean actual = user.toString().equals("User{login='twikss', password='lola345', blockedOrNot=false, amountTrySignIn=0, MAX_AMOUNT_TRY_SIGN_IN=3}");

        assertEquals(expected,actual);
    }
}