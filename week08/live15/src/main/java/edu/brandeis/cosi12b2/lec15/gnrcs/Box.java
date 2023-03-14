package edu.brandeis.cosi12b2.lec15.gnrcs;

public class Box<T> {
    private T object;

    public void put(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }
}
