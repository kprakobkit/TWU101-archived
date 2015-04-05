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
    }

    public static void easiestExercisesEver() {
        System.out.println("*");
    }

    public static void drawHorizontalLine(int lineWidth) {
        for (int i = 0; i < lineWidth; i++) {
            System.out.print("*");
        }
    }
}
