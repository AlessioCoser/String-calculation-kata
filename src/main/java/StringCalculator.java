import java.lang.reflect.Array;
import java.util.Arrays;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.equals(""))
            return 0;

        String[] parts = numbers.split(",");
        if (parts.length == 1) {
            return Integer.parseInt(parts[0]);
        }else if (parts.length == 2) {
            return Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
        }

        return 0;
    }
}
