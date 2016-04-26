import java.lang.reflect.Array;
import java.util.Arrays;

public class StringCalculator {
    public int add(String numbers) {
        int sum = 0;
        String[] parts = numbers.split("(,)|(\\n)");

        for (String part: parts)
            sum += stringToInt(part);

        return sum;
    }

    private int stringToInt(String string) {
        if (string.equals(""))
            return 0;
        return Integer.parseInt(string);
    }
}
