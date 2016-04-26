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
}
