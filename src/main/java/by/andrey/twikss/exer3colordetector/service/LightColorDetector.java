package by.andrey.twikss.exer3colordetector.service;

public class LightColorDetector {

    private LightColorDetector() {
    }

    public static String detect(int waveLength){
        if (waveLength >= 380 && waveLength <= 449){
            return "Violet";
        } else {
            return "Invisible Light";
        }
    }
}
