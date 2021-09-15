import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTests {
    @Test
    public void testQuatToDeci() {
        Calculator calc = new Calculator();
        assertEquals(62, calc.quatToDeci("332"));
    }

    @Test
    public void testDeciToQuat() {
        Calculator calc = new Calculator();
        assertEquals("321", calc.deciToQuat(57));
    }

    @Test
    public void testOperatePlus() {
        Calculator calc = new Calculator();
        assertEquals(121, calc.operate(33, "+", 22));
    }

    @Test
    public void testOperateSubtract() {
        Calculator calc = new Calculator();
        assertEquals(11, calc.operate(33, "-", 22));
    }

    @Test
    public void testOperateMultiply() {
        Calculator calc = new Calculator();
        assertEquals(30, calc.operate(10, "*", 3));
    }

    @Test
    public void testOperateDivide() {
        Calculator calc = new Calculator();
        assertEquals(11, calc.operate(33, "/", 3));
    }

    @Test
    public void testSquare() {
        Calculator calc = new Calculator();
        assertEquals(100, calc.square("10"));
    }

    @Test
    public void testSquareRoot() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.squareRoot("10"));
    }

    @Test
    public void testSplitInputPlus() {
        Calculator calc = new Calculator();
        assertEquals(20, calc.splitInput("10+10"));
    }

    @Test
    public void testSplitInputMinus() {
        Calculator calc = new Calculator();
        assertEquals(11, calc.splitInput("23-12"));
    }

    @Test
    public void testSplitInputMultiply() {
        Calculator calc = new Calculator();
        assertEquals(22, calc.splitInput("11*2"));
    }

    @Test
    public void testSplitInputDivide() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.splitInput("132/11"));
    }
}
