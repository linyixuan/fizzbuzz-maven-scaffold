import static java.lang.String.valueOf;

public class GameNumber {
    private final int number;

    public GameNumber(int i) {
        this.number = i;
    }

    @Override
    public String toString() {
        String result;
        if (isaBoolean(3) && isaBoolean(5)) {
            result = "FizzBuzz";
        }
        if (isaBoolean(3)) {
            result = "Fizz";
        }
        if (isaBoolean(5)) {
            result = "Buzz";
        }
        result = valueOf(number);
        return result;
    }

    private boolean isaBoolean(int i) {
        return number % i == 0;
    }
}
