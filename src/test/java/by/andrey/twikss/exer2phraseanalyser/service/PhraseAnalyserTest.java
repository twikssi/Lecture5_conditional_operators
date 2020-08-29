package by.andrey.twikss.exer2phraseanalyser.service;

import junit.framework.TestCase;
import org.junit.Test;

public class PhraseAnalyserTest extends TestCase {

    @Test
    public void testAnalyseReturnItStandsNoChanceWithoutTrim() {

        String expected = "It stands no chance";
        String actual = PhraseAnalyser.analyse("Make and not make and great again");

        assertEquals(expected,actual);
    }

    @Test
    public void testAnalyseReturnItStandsNoChanceWithTrim() {

        String expected = "It stands no chance";
        String actual = PhraseAnalyser.analyse("     Make and not make and great again         ");

        assertEquals(expected,actual);
    }

    @Test
    public void testAnalyseReturnItIsFineReally() {

        String expected = "It is fine, really";
        String actual = PhraseAnalyser.analyse("Hi, mom");

        assertEquals(expected,actual);
    }

    @Test
    public void testAnalyseReturnWithWordMake() {

        String expected = "It could be worse";
        String actual = PhraseAnalyser.analyse("Make lola run");

        assertEquals(expected,actual);
    }

    @Test
    public void testAnalyseReturnWithWordGreatAgain() {

        String expected = "It could be worse";
        String actual = PhraseAnalyser.analyse("Hi, everyone lola run great again");

        assertEquals(expected,actual);
    }
}