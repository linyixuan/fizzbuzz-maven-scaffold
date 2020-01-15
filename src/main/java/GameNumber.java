import static java.lang.String.valueOf;

public class GameNumber {

    private final int num;

    public GameNumber(int i) {
        this.num = i;
    }

    @Override
    public String toString() {
        String result;
        if (isaBoolean(3) && isaBoolean(5)) {
            result = "FizzBuzz";
        } else if (isaBoolean(3)) {
            result = "Fizz";
        } else if (isaBoolean(5)) {
            result = "Buzz";
        } else {
            result = valueOf(num);
        }
        return result;
    }

    private boolean isaBoolean(int i) {
        return num % i == 0;
    }
}
