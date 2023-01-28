package edu.brandeis.cosi12b2;

public class Question01 {

    public static void main(String[] args) {
        readFile("weather.txt");
    }

    public static void readFile(String filename) {
    	Scanner input = new Scanner(new File(filename));
    }
}
