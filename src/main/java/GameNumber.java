import static java.lang.String.valueOf;

public class GameNumber {
    private final int number;

    public GameNumber(int i) {
        this.number = i;
    }

    @Override
    public String toString() {
        String result = null;
        if (isaBoolean(15)) {
            result = "FizzBuzz";
        } else if (isaBoolean(3)) {
            result = "Fizz";
        } else if (isaBoolean(5)) {
            result = "Buzz";
        } else {
            result = valueOf(number);

        }
        return result;
    }

    private boolean isaBoolean(int i) {
        return number % i == 0;
    }
}
