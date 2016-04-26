
public class StringCalculator {

    public int add(String string) throws StringCalculatorException {
        int sum = 0;
        String[] parts = getNumberStrings(string);

        for (String part : parts) {
            if (stringToInt(part) < 0) {
                throw new StringCalculatorException("negatives not allowed");
            }
            sum += stringToInt(part);
        }

        return sum;
    }

    private String[] getNumberStrings(String string) {
        if (string.startsWith("//")) {
            String delimiter = string.substring(2, 3);
            return string.substring(4).split(delimiter);
        }

        return string.split(",");
    }

    private int stringToInt(String string) {
        if (string.equals(""))
            return 0;
        return Integer.parseInt(string);
    }
}
