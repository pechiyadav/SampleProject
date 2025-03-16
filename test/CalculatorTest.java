import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calc.subtract(3, 2));
    }
}
