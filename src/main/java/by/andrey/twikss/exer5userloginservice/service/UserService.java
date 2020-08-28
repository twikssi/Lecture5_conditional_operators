package by.andrey.twikss.exer5userloginservice.service;

import by.andrey.twikss.exer5userloginservice.bean.User;

public class UserService {
    private User user;

    public UserService(User user) {
        this.user = user;
    }

    public boolean login(String password) {
        if (user.isBlocked()){
            return false;
        } else {
            if (user.getPassword().equals(password)){
                user.resetAmountTrySignIn();
                return true;
            } else {
                blockUserOrIncreaseAmounTrySignIn();
                return false;
            }
        }
    }

    public void blockUserOrIncreaseAmounTrySignIn() {
        if (user.getAmountTrySignIn() < User.MAX_AMOUNT_TRY_SIGN_IN){
            user.increaseAmountTrySignIn();
        } else {
            user.blockUser();
        }
    }
}
