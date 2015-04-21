package IntroductoryProgrammingExercises;

/**
 * Created by kprakobkit on 4/6/15 AD.
 */
public class TriangleExercises {
    public static void main(String[] args) {
        System.out.println("Easiest exercise ever:");
        easiestExercisesEver();

        System.out.println("Draw a horizontal line;");
        drawHorizontalLine(5);

        System.out.println("Draw a vertical line;");
        drawVerticalLine(3);

        System.out.println("Draw a right triangle:");
        drawRightTriangle(3);
    }

    public static void easiestExercisesEver() {
        System.out.println("*");
    }

    public static void drawHorizontalLine(int lineWidth) {
        for (int i = 0; i < lineWidth; i++) {
            System.out.print("*");
        }
        System.out.println(); // add line break at the end
    }

    public static void drawVerticalLine(int lineHeight) {
        for (int i = 0; i < lineHeight; i++) {
            System.out.println("*");
        }
    }

    public static void  drawRightTriangle(int triangleHeight) {
        int currentHeight = 1;

        while (currentHeight <= triangleHeight) {
            drawHorizontalLine(currentHeight);
            currentHeight++;
        }
    }
}
