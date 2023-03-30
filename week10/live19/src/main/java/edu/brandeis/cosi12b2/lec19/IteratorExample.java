package edu.brandeis.cosi12b2.lec19;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Create and populate the list
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jan");
        names.add("Levi");
        names.add("Tom");
        names.add("Jose");

        for (int i=0; i<names.size(); i++){
            String s = names.get(i);
            System.out.printf("`loop` name is [%s]\n", s);
        }

        // Create an iterator for the list
        Iterator<String> iter = names.iterator();

        // Use the iterator to visit each element
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.printf("`iter` name is [%s]\n", s);
        }

        for (String s: names) {
            System.out.printf("`for`  name is [%s]\n", s);
        }
    }
}
