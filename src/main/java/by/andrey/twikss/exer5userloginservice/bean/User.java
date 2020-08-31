package by.andrey.twikss.exer5userloginservice.bean;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private boolean blocked = false;
    private int amountTrySignIn = 0;
    public static final int MAX_AMOUNT_TRY_SIGN_IN = 2;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
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
        return blocked == user.blocked &&
                amountTrySignIn == user.amountTrySignIn &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, blocked, amountTrySignIn);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", blockedOrNot=" + blocked +
                ", amountTrySignIn=" + amountTrySignIn +
                ", MAX_AMOUNT_TRY_SIGN_IN=" + MAX_AMOUNT_TRY_SIGN_IN +
                '}';
    }

    public void resetAmountTrySignIn() {
        this.amountTrySignIn = 0;
    }

    public void blockUser() {
        this.blocked = true;
    }

    public void increaseAmountTrySignIn() {
        this.amountTrySignIn += 1;
    }
}
