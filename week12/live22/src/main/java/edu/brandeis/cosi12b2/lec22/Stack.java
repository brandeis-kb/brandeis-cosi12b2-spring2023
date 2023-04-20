package edu.brandeis.cosi12b2.lec22;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> data;
    private int current;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        data = new ArrayList<T>(size);
        current = -1;
    }

    public void push(T item) {
        if (capacity == current + 1) {
            System.out.println("Stack Overflow");
        } else {
            current = current + 1;
            if (data.size() > current) {
                // we are overriding a value
                data.set(current, item);
            } else {
                // we are setting for first time
                data.add(item);
            }
        }
    }

    public T pop() {
        if (current == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            T rv = data.get(current);
            data.remove(current--);
            return rv;
        }
    }

    public boolean empty() {
        return false; //??
    }

    public T peek() {
        return null; // ??
    }

    @Override
    public String toString() {
        return "Stack{" +
                "data=" + data +
                ", current=" + current +
                ", capacity=" + capacity +
                '}';
    }
}
