package edu.brandeis.cosi12b2.lec07;

public class Lec07 {
    public static void main(String[] args) {
    	dotEqualsVsDoubleEquals();
//    	int p1 = Integer.parseInt("357");
//    	System.out.printf("p1 is [%d]\n", p1);
    }
    
    
    public static void dotEqualsVsDoubleEquals() {
    	int ival1 = 7;
    	long ival2 = 3L + 4;
    	if (ival1 == ival2) {
    		System.out.println("vals are equals");
    	}
    	// if (ival1.equals(ival2)) {

//    	Integer i1 = 7;
//    	Integer i2 = 3 + 4;
//    	if (i1.intValue() == i2.intValue()) {
//    		System.out.println("They are ==");
//    	}
//    	if (i1.equals(i2)) {
//    		System.out.println("They are .equals");
//    	}

//    	Integer l1 = 7;
//    	Long l2 = 3L + 4;
//    	if (l1 == l2) {
//    		System.out.println("They are ==");
//    	}
//    	if (l1.equals(l2)) {
//    		System.out.println("They are .equals");
//    	}

    	
    }
    
    public boolean assertTrue(Object lhs, Object rhs) {
    	if (lhs.equals(rhs)) {
    		return true;
    	} else {
    		return false;
    	}    	
    }
}
