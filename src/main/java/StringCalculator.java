import java.lang.reflect.Array;
import java.util.Arrays;

public class StringCalculator {
    public int add(String numbers) {
        int sum = 0;
        String[] parts = numbers.split(",");

        if (parts.length >= 1)
            sum += stringToInt(parts[0]);

        if (parts.length >= 2)
            sum += stringToInt(parts[1]);

        return sum;
    }

    private int stringToInt(String string) {
        if( string == "")
            return 0;
        return Integer.parseInt(string);
    }
}
