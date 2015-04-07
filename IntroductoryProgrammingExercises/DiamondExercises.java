package IntroductoryProgrammingExercises;

/**
 * Created by kprakobkit on 4/7/15.
 */
public class DiamondExercises {
    public static void main(String[] args) {
        System.out.println("Isosceles Triangle:");
        drawIsoscelesTriangle(5);
    }

    public static void drawIsoscelesTriangle(int height) {
        int currentHeight = 1;

        for (int i = 0; i < height; i++) {
            printSpaces(height - currentHeight);
            TriangleExercises.drawHorizontalLine((currentHeight * 2) - 1);
            currentHeight++;
        }
    }

    public static void printSpaces(int numOfSpaces) {
        for (int i = 0; i < numOfSpaces; i++) {
            System.out.print(" ");
        }
    }

}
