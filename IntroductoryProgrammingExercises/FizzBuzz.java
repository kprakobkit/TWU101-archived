package IntroductoryProgrammingExercises;

/**
 * Created by kprakobkit on 4/8/15.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz();
    }

    public static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            String output = "";

            if (i % 3 == 0) output += "Fizz";
            if (i % 5 == 0) output += "Buzz";
            if (output.length() == 0) output += i;

            System.out.println(output);
        }
    }
}
