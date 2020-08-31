package by.andrey.twikss.exer3colordetector.service;

public class LightColorDetector {

    private LightColorDetector() {
    }

    public static String detect(int waveLength){
        if (waveLength >= 380 && waveLength <= 449){
            return "Violet";
        } else if (waveLength >= 450 && waveLength <= 494) {
            return "Blue";
        }
            else {
            return "Invisible Light";
        }
    }
}
