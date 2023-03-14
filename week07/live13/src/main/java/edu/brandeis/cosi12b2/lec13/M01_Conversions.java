package edu.brandeis.cosi12b2.lec13;

public class M01_Conversions {
    public static void main(String[] args) {
        float f1 = 7.0f;
        int i1 = 1;
        // assignment conversion
        f1 = i1;  // f1 = 1.0f;
        System.out.printf("f1 is %.2f\n", f1);

        // arithmetic promotion
        float f2 = f1 + i1;
        System.out.printf("f2 is %.2f\n", f2);

        // cast
        float f3 = (float) i1;
        System.out.printf("f3 is %.2f\n", f3);

    }

}
