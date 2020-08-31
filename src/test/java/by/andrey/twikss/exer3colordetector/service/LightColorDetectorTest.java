package by.andrey.twikss.exer3colordetector.service;

import junit.framework.TestCase;
import org.junit.Test;

public class LightColorDetectorTest extends TestCase {

    @Test
    public void testDetectReturnViolet() {

        String expected = "Violet";
        String actual = LightColorDetector.detect(444);

        assertEquals(expected,actual);
    }

    @Test
    public void testDetectReturnVioletEdgeVariable() {

        String expected = "Violet";
        String actual = LightColorDetector.detect(449);

        assertEquals(expected,actual);
    }

    @Test
    public void testDetectReturnVioletEdgeVariableTwo() {

        String expected = "Violet";
        String actual = LightColorDetector.detect(380);

        assertEquals(expected,actual);
    }

    @Test
    public void testDetectReturnBlue() {

        String expected = "Blue";
        String actual = LightColorDetector.detect(456);

        assertEquals(expected,actual);
    }

    @Test
    public void testDetectReturnBluetEdgeVariable() {

        String expected = "Blue";
        String actual = LightColorDetector.detect(450);

        assertEquals(expected,actual);
    }

    @Test
    public void testDetectReturnBluetEdgeVariableTwo() {

        String expected = "Blue";
        String actual = LightColorDetector.detect(494);

        assertEquals(expected,actual);
    }

    @Test
    public void testDetectReturnGreen() {

        String expected = "Green";
        String actual = LightColorDetector.detect(512);

        assertEquals(expected,actual);
    }

    @Test
    public void testDetectReturnYellow() {

        String expected = "Yellow";
        String actual = LightColorDetector.detect(576);

        assertEquals(expected,actual);
    }

    @Test
    public void testDetectReturnOrange() {

        String expected = "Orange";
        String actual = LightColorDetector.detect(600);

        assertEquals(expected,actual);
    }

    @Test
    public void testDetectReturnRed() {

        String expected = "Red";
        String actual = LightColorDetector.detect(700);

        assertEquals(expected,actual);
    }

    @Test
    public void testDetectReturnInvisibleLightUp() {

        String expected = "Invisible Light";
        String actual = LightColorDetector.detect(890);

        assertEquals(expected,actual);
    }

    @Test
    public void testDetectReturnInvisibleLightDown() {

        String expected = "Invisible Light";
        String actual = LightColorDetector.detect(0);

        assertEquals(expected,actual);
    }
}