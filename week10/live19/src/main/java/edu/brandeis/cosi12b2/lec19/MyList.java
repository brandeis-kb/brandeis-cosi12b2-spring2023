package edu.brandeis.cosi12b2.lec19;

public class MyList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E>{
        private E data;
        private Node<E> next;
        private Node<E> prev;

        private Node (E data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}

