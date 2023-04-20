package edu.brandeis.cosi12b2.lec21;

import edu.brandeis.cosi12b2.lec21.LinkedListRec.Node;

public class LinkedListRecTest {
    private static LinkedListRec<String> linkedListRec;

    public static void main(String[] args) {
        setup();
        testHead();
//        testAdd();
//        testReplace();
//        testRemove();
    }


    public static void setup(){
        System.out.println("================================================================================");
        System.out.println("Setup");
        linkedListRec = new LinkedListRec<>();
        linkedListRec.add("Tiger");
        linkedListRec.add("Lion");
        linkedListRec.add("Elephant");
        linkedListRec.add("Penguin");
        showList();
    }

    public static void testHead(){
        System.out.println("================================================================================");
        System.out.println("Test Head");
        Node<String> head = linkedListRec.getHead().getNext().getNext();
        System.out.printf("head is [%s]\n", head);
    }
    
    public static void testAdd(){
        System.out.println("================================================================================");
        System.out.println("Test ADD");
        linkedListRec.add("Llama");
        showList();
    }

    public static void testReplace(){
        System.out.println("================================================================================");
        System.out.println("Test REPLACE");
        linkedListRec.replace("Elephant", "Hippo");
        showList();
    }

    public static void testRemove(){
        System.out.println("================================================================================");
        System.out.println("Test REMOVE");
        linkedListRec.remove("Tiger");
        showList();
    }

    public static void showList(){
        System.out.printf("The size of list is [%d]\nThe list contains: %s",
                linkedListRec.size(), linkedListRec.toString());
    }
}
