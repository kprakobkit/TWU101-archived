package Chapter4;

/**
 * Created by kprakobkit on 4/8/15.
 */
public class RectangleTwo {
    int height;
    int width;

    public RectangleTwo (int initialHeight, int initialWidth) {
        height = initialHeight;
        width = initialWidth;
    }

    public int area() {
        return height * width;
    }

    public int perimeter() {
        return 2 * height + 2 * width;
    }
}
