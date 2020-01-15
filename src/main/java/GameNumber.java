import static java.lang.String.valueOf;

public class GameNumber {
    private final int number;

    public GameNumber(int i) {
        this.number = i;
    }
    @Override
    public String toString() {
        if (isaBoolean(3) && isaBoolean(5)){
            return "FizzBuzz";
        }
        if (isaBoolean(3)){
            return "Fizz";
        }
        if (isaBoolean(5)){
            return "Buzz";
        }
        return valueOf(number);
    }

    private boolean isaBoolean(int i) {
        return number % i == 0;
    }
}
