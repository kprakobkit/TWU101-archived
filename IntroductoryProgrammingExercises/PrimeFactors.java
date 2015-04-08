package IntroductoryProgrammingExercises;
import java.util.ArrayList;

/**
 * Created by kprakobkit on 4/8/15.
 */
public class PrimeFactors {
    public static void main(String[] args) {
        ArrayList<Integer> primeFactors = getPrimeFactors(30);
        System.out.println("primeFactors = " + primeFactors);
    }

    public static ArrayList<Integer> getPrimeFactors(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    primeFactors.add(i);
                    n = n / i;
                    break;
                }
            }
        }

        return primeFactors;
    }
}
