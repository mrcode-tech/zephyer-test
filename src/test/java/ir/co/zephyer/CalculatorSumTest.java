package ir.co.zephyer;

import com.smartbear.zephyrscale.junit.annotation.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorSumTest {


        @Test
        @TestCase(key = "SAM-T26")
        public void sumTwoNumbersAndPass() {
            Calculator calculator = new Calculator();
            assertEquals(1, calculator.sum(1, 2));
        }

        @Test
        @TestCase(key = "SAM-T27")
        public void sumTwoNumbersAndFail() {
            Calculator calculator = new Calculator();
            assertNotEquals(2, calculator.sum(1, 2));
        }

        @Test
        public void notMappedToTestCaseAndPass() {
            Calculator calculator = new Calculator();
            assertEquals(1, calculator.sum(1, 2));
        }

        @Test
        @TestCase(name = "Mapped to Test Case Name and Pass")
        public void mappedToTestCaseNameAndPass() {
            Calculator calculator = new Calculator();
            assertEquals(1, calculator.sum(1, 2));
        }


}
