

import static org.junit.Assert.*;
import org.junit.Test;



public class CalculadoraPostfixTest {

    @Test
    public void testSuma() {
        Stack<Integer> stack = new VectorStack<>();
        CalculadoraPostfix calc = new CalculadoraPostfix(stack);
        assertEquals(5, calc.evaluar("2 3 +"));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionEntreCero() {
        Stack<Integer> stack = new VectorStack<>();
        CalculadoraPostfix calc = new CalculadoraPostfix(stack);
        calc.evaluar("8 0 /");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExpresionInvalida() {
        Stack<Integer> stack = new VectorStack<>();
        CalculadoraPostfix calc = new CalculadoraPostfix(stack);
        calc.evaluar("1 +");
    }
}
