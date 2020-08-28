package by.andrey.twikss.exer5userloginservice.service;

import by.andrey.twikss.exer5userloginservice.bean.User;

public class UserService {
    private User user;

    public UserService(User user) {
        this.user = user;
    }

    public boolean login() {
        return true;
    }

    public boolean checkUserAmountTrySignInIflessThenMaxAmountTrySignInReturnTrue() {
        if (user.getAmountTrySignIn() < User.MAX_AMOUNT_TRY_SIGN_IN){
            return true;
        } else
            return false;
    }
}
