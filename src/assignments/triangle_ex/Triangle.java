package assignments.triangle_ex;

/**
 * Created by RachelSmith on 09/09/2016.
 */
public class Triangle {

    public void justOneStar() {

        System.out.println("*");
    }

    public void lineOfStars(int n) {

        String line = new String(new char[n]).replace("\0", "*");
        System.out.println(line);
    }

    public void multipleLinesOfAStar(int n) {

        while (n > 0) {
            System.out.println("*");
            n -= 1;
        }
    }

    public void rightTriangleOfHeight(int n) {

        int i = 1;
        while (n >= i) {
          lineOfStars(i);
            i += 1;
        }
    }
}
