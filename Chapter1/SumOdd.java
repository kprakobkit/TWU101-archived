package Chapter1;

/**
 * Created by kprakobkit on 4/6/15 AD.
 */
public class SumOdd {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("sum = " + sum);
    }
}
