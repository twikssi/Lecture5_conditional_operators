package by.andrey.twikss.exer1signcomparator.service;

public class SignComparator {

    private SignComparator() {
    }

    public static String compare(int number){
        if (number > 0){
            return "Number is positive";
        } else if (number < 0){
            return "Number is negative";
        } else{
            return "Number is equal to zero";
        }
    }
}
