package assignments.triangle_ex;

/**
 * Created by RachelSmith on 09/09/2016.
 */
public class Triangle {

    public String justOneStar() {
        return "*";
    }

    public String lineOfStars(int n) {

        return new String(new char[n]).replace("\0", "*");

    }
}
