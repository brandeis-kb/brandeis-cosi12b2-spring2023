package edu.brandeis.cosi12b2.lec15.gnrcs;

public class ObjectBox {
    private Object object;

    public void put(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}
