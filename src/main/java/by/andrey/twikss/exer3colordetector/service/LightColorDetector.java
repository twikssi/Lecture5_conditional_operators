package by.andrey.twikss.exer3colordetector.service;

public class LightColorDetector {

    private LightColorDetector() {
    }

    public static String detect(int waveLength){
        if (waveLength >= 380 && waveLength <= 449){
            return "Violet";
        } else if (waveLength >= 450 && waveLength <= 494) {
            return "Blue";
        } else if (waveLength >= 495 && waveLength <= 569){
            return "Green";
        } else if (waveLength >= 570 && waveLength <= 589){
            return "Yellow";
        }
            else {
            return "Invisible Light";
        }
    }
}
