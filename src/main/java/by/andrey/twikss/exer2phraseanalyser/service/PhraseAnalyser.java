package by.andrey.twikss.exer2phraseanalyser.service;

public class PhraseAnalyser {

    private PhraseAnalyser() {
    }

    public static String analyse(String text){
        if (text.trim().startsWith("Make") && text.trim().endsWith("great again")){
            return "It stands no chance";
        } else if (text.trim().startsWith("Make") || text.trim().endsWith("great again")) {
            return "It could be worse";
        } else {
            return "It is fine, really";
        }
    }
}
