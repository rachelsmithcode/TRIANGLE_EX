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
    public void printsAStar() throws Exception {
        new Triangle().horizontalLine(1);
        assertEquals("*\n", outContent.toString());
    }


    @Test
    public void printsLineOfStarsOfAGivenNumber() throws Exception {
        new Triangle().horizontalLine(6);
        assertEquals("******\n", outContent.toString());
    }


    @Test
    public void printsAStarOnAGivenNumberOfLines() throws Exception {
        String testAnswer = "*\n"
                            + "*\n"
                            + "*\n";
        new Triangle().verticalLine(3);
        assertEquals(testAnswer, outContent.toString());
    }

    @Test
    public void printRightTriangleOfGivenHeight() throws Exception {
        String testAnswer = "*\n"
                + "**\n"
                + "***\n";
        new Triangle().rightTriangle(3);
        assertEquals(testAnswer, outContent.toString());
    }


}
