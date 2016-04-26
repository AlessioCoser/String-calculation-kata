import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void addEmptyStringIsZero() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void addOneNumberIsOne() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }
}
