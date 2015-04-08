package Chapter4;

/**
 * Created by kprakobkit on 4/8/15.
 */
public class RectangleTwoTestDrive {
    public static void main(String[] args) {
        RectangleTwo[] rectangles = rectanglesConstructor(5);

        for (int i = 0; i < rectangles.length; i++) {
            RectangleTwo rectangle = rectangles[i];
            System.out.println("Rectangle " + (i+1) + " Height: " + rectangle.height + " Width: " + rectangle.width);
            System.out.println("Area = " + rectangle.area());
            System.out.println("Perimeter = " + rectangle.perimeter());
        }
    }

    public static RectangleTwo[] rectanglesConstructor (int numOfRect) {
        RectangleTwo[] rectangles = new RectangleTwo[5];

        for (int i = 0; i < rectangles.length; i++) {
            int height = (int)(Math.random() * 20 + 1);
            int width = (int)(Math.random() * 20 + 1);
            rectangles[i] = new RectangleTwo(height, width);
        }

        return rectangles;
    }
}
