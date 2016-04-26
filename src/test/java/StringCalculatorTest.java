import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void addEmptyStringIsZero() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
}
