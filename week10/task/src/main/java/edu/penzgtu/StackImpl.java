package edu.penzgtu;

import java.util.LinkedList;

public class StackImpl<T> implements Stack<T> {
    private LinkedList<T> elements = new LinkedList<>();

    @Override
    public void push(T item) {
        elements.addFirst(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return elements.removeFirst();
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return elements.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }
}
