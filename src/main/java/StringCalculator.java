import java.lang.reflect.Array;
import java.util.Arrays;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.equals(""))
            return 0;

        String[] parts = numbers.split(",");

            return Integer.parseInt(parts[0]);

    }
}
