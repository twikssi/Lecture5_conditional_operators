package by.andrey.twikss.exer5userloginservice.bean;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private boolean blockedOrNot = false;
    private int amountTrySignIn = 0;
    private static final int MAX_AMOUNT_TRY_SIGN_IN = 3;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean isBlockedOrNot() {
        return blockedOrNot;
    }

    public void setBlockedOrNot(boolean blockedOrNot) {
        this.blockedOrNot = blockedOrNot;
    }

    public int getAmountTrySignIn() {
        return amountTrySignIn;
    }

    public void setAmountTrySignIn(int amountTrySignIn) {
        this.amountTrySignIn = amountTrySignIn;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return blockedOrNot == user.blockedOrNot &&
                amountTrySignIn == user.amountTrySignIn &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, blockedOrNot, amountTrySignIn);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", blockedOrNot=" + blockedOrNot +
                ", amountTrySignIn=" + amountTrySignIn +
                ", MAX_AMOUNT_TRY_SIGN_IN=" + MAX_AMOUNT_TRY_SIGN_IN +
                '}';
    }
}
