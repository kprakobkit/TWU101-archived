package Chapter2;

/**
 * Created by kprakobkit on 4/6/15 AD.
 */
public class IncrementorTestDrive {
    public static void main(String[] args) {
        Incrementor incrementor = new Incrementor();
        for (int i = 0; i < 5; i++) {
           incrementor.increment();
        }

        incrementor.total();
    }
}
