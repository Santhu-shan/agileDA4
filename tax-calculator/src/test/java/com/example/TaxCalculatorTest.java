import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorTest {

    TaxCalculator calculator = new TaxCalculator();

    @Test
    void testNoTax() {
        assertEquals(0, calculator.calculateTax(200000));
    }

    @Test
    void test5PercentTax() {
        assertEquals(12500, calculator.calculateTax(500000));
    }

    @Test
    void test20PercentTax() {
        assertEquals(32500, calculator.calculateTax(600000));
    }

    @Test
    void test30PercentTax() {
        assertEquals(142500, calculator.calculateTax(1100000));
    }
}