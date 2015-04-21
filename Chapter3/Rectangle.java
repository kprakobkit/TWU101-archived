package Chapter3;

/**
 * Created by kprakobkit on 4/7/15.
 */
public class Rectangle {
    int height;
    int width;

    public Rectangle (int initialHeight, int initialWidth) {
        height = initialHeight;
        width = initialWidth;
    }

    public int area() {
        return height * width;
    }
}
