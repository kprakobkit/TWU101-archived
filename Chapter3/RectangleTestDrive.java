package Chapter3;

/**
 * Created by kprakobkit on 4/7/15.
 */
public class RectangleTestDrive {
    public static void main(String[] args) {
        Rectangle[] rectangles = rectanglesConstructor(5);
        double averageArea;

        averageArea = findAverageArea(rectangles);

        System.out.println("Average area = " + averageArea);
    }

    public static Rectangle[] rectanglesConstructor (int numOfRect) {
        Rectangle[] rectangles = new Rectangle[5];

        for (int i = 0; i < rectangles.length; i++) {
            int height = (int)(Math.random() * 20 + 1);
            int width = (int)(Math.random() * 20 + 1);
            rectangles[i] = new Rectangle(height, width);
        }

        return rectangles;
    }

    public static double findAverageArea(Rectangle[] rectangles) {
        double sumOfAreas = 0;

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("area = " + rectangles[i].area());
            sumOfAreas += rectangles[i].area();
        }

        return sumOfAreas / rectangles.length;
    }
}
