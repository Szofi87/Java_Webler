import calculator.Calculator;
import calculator.InvalidSyntaxException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator testCalculator;

    @BeforeEach
    public void beforeEach() {
        testCalculator = new Calculator();
    }

    @Test
    public void initialStateTest() {
        assertNull(testCalculator.getOperator());
        assertEquals(0, testCalculator.getOperand1());
        assertEquals(0, testCalculator.getOperand2());
    }

    @Test
    public void parseTest() {
        assertDoesNotThrow(() -> {
            testCalculator.parse("1+2");
            assertCalculatorState("+", 1, 2);

            testCalculator.parse("1-2");
            assertCalculatorState("-", 1, 2);

            testCalculator.parse("1*2");
            assertCalculatorState("*", 1, 2);

            testCalculator.parse("1/2");
            assertCalculatorState("/", 1, 2);

            testCalculator.parse("1^2");
            assertCalculatorState("^", 1, 2);

            testCalculator.parse("1.5+2");
            assertCalculatorState("+", 1.5, 2);

            testCalculator.parse("1+2.5");
            assertCalculatorState("+", 1, 2.5);

            testCalculator.parse("1.5+2.5");
            assertCalculatorState("+", 1.5, 2.5);
        });

        assertThrows(InvalidSyntaxException.class, () -> {
            testCalculator.parse("1+");
            testCalculator.parse("-2");
            testCalculator.parse("1*2-");
            testCalculator.parse("13");
            testCalculator.parse("ans");
            testCalculator.parse("a");
            testCalculator.parse("$");
            testCalculator.parse("");
        });
    }

    @Test
    public void basicEvaluationTest() {
        assertDoesNotThrow(() -> {
            assertEvaluationResult("1+2", 3);
            assertEvaluationResult("1-2", -1);
            assertEvaluationResult("1*2", 2);
            assertEvaluationResult("1/2", 0.5);
            assertEvaluationResult("2^3", 8);
            assertEvaluationResult("1.5+2", 3.5);
            assertEvaluationResult("1+2.5", 3.5);
            assertEvaluationResult("1.5+2.5", 4);
        });
    }

    @Test
    public void ansEvaluationTest() {
        assertDoesNotThrow(() -> {
            double lastResult = 0;
            testCalculator.parse("1+2");
            assertCalculatorState("+", 1, 2);

            testCalculator.evaluate();
            lastResult = testCalculator.getResult();

            assertEvaluationResult("ans+2", lastResult + 2);
            lastResult = testCalculator.getResult();

            assertEvaluationResult("ans+ans", lastResult + lastResult);
            lastResult = testCalculator.getResult();

            assertEvaluationResult("ans/2", lastResult / 2);
        });
    }

    @Test
    public void calculationTest() {
        assertDoesNotThrow(() -> {
            assertEquals(2, testCalculator.calculate("1+1"));
            assertEquals(4, testCalculator.calculate("ans*2"));
            assertEquals(8, testCalculator.calculate("ans+ans"));
            assertEquals(1, testCalculator.calculate("4/4"));
            assertEquals(100000, testCalculator.calculate("ans*100000"));
            assertEquals(1, testCalculator.calculate("100000/ans"));
        });

        assertThrows(InvalidSyntaxException.class, () -> {
            assertEquals(2, testCalculator.calculate("1+"));
            assertEquals(4, testCalculator.calculate("ans*2*"));
            assertEquals(8, testCalculator.calculate("an+ans"));
            assertEquals(1, testCalculator.calculate("44"));
            assertEquals(100000, testCalculator.calculate("*100000"));
            assertEquals(1, testCalculator.calculate("/"));
            assertEquals(1, testCalculator.calculate(""));
        });
    }

    @Test
    public void clearTest() {
        assertDoesNotThrow(() -> {
            testCalculator.parse("1+2");
            assertCalculatorState("+", 1, 2);
            testCalculator.evaluate();
            assertEquals(3, testCalculator.getResult());

            testCalculator.clear();

            assertCalculatorState(null, 0, 0);
            assertEquals(3, testCalculator.getResult());
        });
    }

    @Test
    public void executionOrderTest(){
        assertThrows(IllegalStateException.class, () -> {
            testCalculator.evaluate();
        });

        assertDoesNotThrow(() -> {
            testCalculator.parse("1+2");
            testCalculator.evaluate();
        });
    }

    private void assertCalculatorState(String operator, double operand1, double operand2) {
        assertEquals(operator, testCalculator.getOperator());
        assertEquals(operand1, testCalculator.getOperand1());
        assertEquals(operand2, testCalculator.getOperand2());
    }

    private void assertEvaluationResult(String input, double expectedResult) throws InvalidSyntaxException {
        testCalculator.parse(input);
        testCalculator.evaluate();
        assertEquals(expectedResult, testCalculator.getResult());
    }
}
