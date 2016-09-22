package assignments.triangle_ex;

/**
 * Created by RachelSmith on 09/09/2016.
 */
public class Triangle {

    public static void main (String[] args) {
        new Triangle().runExamples();
    }


    private void printToConsole(String message) {
        System.out.println(message);
    }

    private void runExamples() {

        printToConsole("Print one asterisk to the console.\n");
        new Triangle().horizontalLine(1);

        printToConsole("\nDraw a horizontal line of n asterisk, eg n=8\n");
        new Triangle().horizontalLine(8);

        printToConsole("\nDraw a vertical line of n asterisk, eg n=3\n");
        new Triangle().verticalLine(3);

        printToConsole("\nDraw a right triangle of n lines, eg n=3\n");
        new Triangle().rightTriangle(3);

    }

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
