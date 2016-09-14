package assignments.triangle_ex;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


/**
 * Created by RachelSmith on 09/09/2016.
 */
public class TriangleTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void printsOnlyOneStar() throws Exception {
        new Triangle().justOneStar();
        assertEquals("*", outContent.toString());
    }


    @Test
    public void printsLineOfStarsOfAGivenNumber() throws Exception {
        new Triangle().lineOfStars(6);
        assertEquals("******", outContent.toString());
    }


    @Test
    public void printsMultipleLinesOfOneStarOfAGivenNumber() throws Exception {
        String testAnswer = "* \n"
                            + "* \n"
                            + "* \n";
        new Triangle().multipleLinesOfAStar(3);
        assertEquals(testAnswer, outContent.toString());
    }
}
