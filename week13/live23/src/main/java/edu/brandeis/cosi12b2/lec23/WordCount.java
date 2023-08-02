package edu.brandeis.cosi12b2.lec23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) throws Exception {
        countWords();
    }

    public static void countWords() throws FileNotFoundException {
        Set<String> words = new HashSet<String>();
        // InputStream is = WordCount.class.getResourceAsStream("./mobydick.txt");
        Scanner in = new Scanner(new File("mobydick.txt"));
        while(in.hasNext()) {
            String word = in.next();
            word = word.toLowerCase();
            words.add(word);
        }
        System.out.println("Number of unique words =" + words.size());
    }
}
