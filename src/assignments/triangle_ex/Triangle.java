package assignments.triangle_ex;

/**
 * Created by RachelSmith on 09/09/2016.
 */
public class Triangle {


    public void horizontalLine(int n) {

        String line = new String(new char[n]).replace("\0", "*");
        System.out.println(line);
    }

    public void verticalLine(int n) {

        while (n > 0) {
            System.out.println("*");
            n -= 1;
        }
    }

    public void rightTriangle(int n) {

        int i = 1;
        while (n >= i) {
            horizontalLine(i);
            i += 1;
        }
    }
}
