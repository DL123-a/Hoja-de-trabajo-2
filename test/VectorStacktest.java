

import static org.junit.Assert.*;
import org.junit.Test;


public class VectorStacktest {

    @Test
    public void testPushPop() {
        Stack<Integer> stack = new VectorStack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(20, (int) stack.pop());
    }

    @Test
    public void testSize() {
        Stack<Integer> stack = new VectorStack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
    }
}
