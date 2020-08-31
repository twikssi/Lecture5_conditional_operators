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
}