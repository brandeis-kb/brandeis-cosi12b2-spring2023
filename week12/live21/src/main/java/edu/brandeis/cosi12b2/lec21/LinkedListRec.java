package edu.brandeis.cosi12b2.lec21;

public class LinkedListRec<E> {

    public static class Node<E>{
        private E data;

        private Node<E> next;

        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }
        
        public String toString() {
        	return data.toString();
        }
        
        public Node<E> getNext() {
        	return next;
        }
    }

    private Node<E> head;
    
    public Node<E> getHead() {
    	return head;
    }

    private int size(Node<E> head) {
        if (head == null) {
            return 0;
        } else {
            return 1 + size(head.next);
        }
    }

    public int size() {
        return size(head);
    }

    private String toString(Node<E> head) {
        if (head == null) {
            return "";
        } else {
            return head.data + "; " + toString(head.next);
        }
    }

    public String toString() {
        return toString(head) + "\n";
    }

    private void replace (Node<E> head, E src, E dst) {
        if (head != null) {
            if (src.equals(head.data)) {
                head.data = dst;
            }
            replace(head.next, src, dst);
        }
    }

    public void replace (E src, E dst) {
        replace(head, src, dst);
    }

    private void add(Node<E> head, E data) {
//    	if (head != null) {
//            System.out.printf("data=[%s], head=[%s]\n", data, head.data);    		
//        	if (head.next != null) {
//                System.out.printf("head.next=[%s]\n", head.next.data);    		
//        	} else {
//        		System.out.println("head.next is null");
//        	}
//    	} else {
//    		System.out.println("head is null");
//    	}
    	if (head.next == null) {
            head.next = new Node<E>(data);
        } else {
            add(head.next, data);
        }
    }

    public void add(E data) {
    	if (head == null) {
            head = new Node<E>(data);
        } else {
            add(head, data);
        }
    }

    private boolean remove(Node<E> head, Node<E> pred, E out) {
        if (head == null) {
            return false;
        } else if (head.data.equals(out)) {
            pred.next = head.next;
            return true;
        } else {
            return remove (head.next, head, out);
        }
    }

    public boolean remove (E out) {
        if (head == null) {
            return false;
        } else if (head.data.equals(out)) {
            head = head.next;
            return true;
        } else {
            return remove(head.next, head, out);
        }
    }

    
}
