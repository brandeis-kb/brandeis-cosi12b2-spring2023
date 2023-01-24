package edu.brandeis.cosi12b2;

// Thoughts:
// - change types? (floats)
// - use a CONSTANT
// - koans - https://github.com/matyb/java-koans/tree/master/koans/src/beginner
public class Live02 {
    public static final int LARGE_INT = 5736878;

    public static void main(String[] args) {
        // testIf();
        // testWhile();
        // testFor();
        // testDoWhile();
        // testSum(); // 1
        testPrePostIncrement();
        // 9
    }
    
    public static void testPrePostIncrement() {
    	// ++a increments and then uses the variable.
    	// a++ uses and then increments the variable.

    	int a = 1;
    	System.out.println(a++);
    	System.out.println(a); 
    	System.out.println(++a);    	
    }

    // what is the output of this method ??
	public static void testIf() {
		int a = 7;
		int b = 12;
		if ( b > a ) {
			System.out.println("'b' is bigger than 'a'");
		} else {
			// why not a is bigger than b ??
			System.out.println("'b' is not bigger than 'a'");
		}
	}

    // what is the output of this method ??
    public static void testWhile() {
        System.out.println("testWhile output");
        boolean b = !true;
        int i = 0;
        while (b) {
            // two ways to increment i , i+= or i++
            i++;
            System.out.print(i + ",");
            if (i > 5) {
                b = false;
            }
        }
        System.out.println("\n\n");
    }

    // what is the output of this method ??
    public static void testFor() {
        for (int i=0; i < 5; ++i) {
            System.out.print(i + ","); 
        	//i++;
        }
    }

    // what is the output of this method ??
    public static void testDoWhile() {
        System.out.println("testDoWhile output");
        boolean b = !true;
        int i = 0;
        do {
            // two ways to increment i , i+= or i++
            i++;
            System.out.print(i + ",");
            if (i > 5) {
                b = false;
            }
        } while (b);
        System.out.println("\n\n");
    }


    public static void testSum() {
        int a = 17; // 2
        int b = 12; // 3
        int sum = add(a, b); // 4
        System.out.printf("Sum is : %d \n", sum); // 8
    }

    public static int add(int num1, int num2) {
        int result = 0; // 5
        result = num1 + num2; // 6
        return result; // 7
    }
}
