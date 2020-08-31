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
    public void testDetectReturnBlue() {

        String expected = "Blue";
        String actual = LightColorDetector.detect(456);

        assertEquals(expected,actual);
    }
}