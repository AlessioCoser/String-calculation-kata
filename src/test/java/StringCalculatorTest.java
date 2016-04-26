import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void addEmptyStringIsZero() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void addOneNumberIsTheNumber() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
        assertEquals(2, calculator.add("2"));
        assertEquals(3, calculator.add("3"));
    }

    @Test
    public void addTwoNumberIsSumOfNumbers() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
        assertEquals(7, calculator.add("3,4"));
        assertEquals(2, calculator.add("0,2"));
    }

    @Test
    public void addUnknownAmountOfNumber() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(13, calculator.add("1,2,5,3,2"));

    }

    @Test
    public void addNumbersWithNewLineDelimiter() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(8, calculator.add("//\n\n1\n2\n5"));
    }

    @Test
    public void setDelimiterOnFirstLine() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(8, calculator.add("//;\n1;2;5"));
        assertEquals(8, calculator.add("//:\n1:2:5"));
        assertEquals(8, calculator.add("//,\n1,2,5"));
    }

    @Test
    public void trowExceptionIfNegativeNumber() throws Exception {
        StringCalculator calculator = new StringCalculator();
        try {
            calculator.add("//;\n1;-2;5");
        }catch (StringCalculatorException e) {
            assertEquals("negatives not allowed", e.getMessage());
        }
    }
}