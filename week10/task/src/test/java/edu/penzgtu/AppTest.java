package edu.penzgtu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testStackOperations() {
        Stack<Integer> stack = new StackImpl<>();

        assertTrue(stack.isEmpty(), "Стек должен быть пустым");

        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.peek(), "Вершина должна быть 20");
        assertEquals(20, stack.pop(), "Первым должно удалиться 20");
        assertEquals(10, stack.pop(), "Затем должно удалиться 10");
        assertTrue(stack.isEmpty(), "Стек снова должен быть пустым");
    }

    @Test
    public void testPopFromEmptyStack() {
        Stack<String> stack = new StackImpl<>();
        assertThrows(IllegalStateException.class, stack::pop, "Должно выбрасываться исключение при pop() из пустого стека");
    }
}