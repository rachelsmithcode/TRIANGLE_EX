package assignments.triangle_ex;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Created by RachelSmith on 09/09/2016.
 */
public class TriangleTests {
    @Test
    public void printsOnlyOneStar() throws Exception {
        assertEquals("*", new Triangle().justOneStar());
    }


    @Test
    public void printsLineOfStarsOfAGivenNumber() throws Exception {
        assertEquals("******", new Triangle().lineOfStars(6));
    }


}
