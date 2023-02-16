package edu.brandeis.cosi12b2.lec10;

/**
 * 
 * @author kbrumer
 *
 */
public class MethodOverload {
	public static void main(String[] args) {
		MethodOverload methodOverload = new MethodOverload();
		double int1 = methodOverload.calcInt(1000.0, 4);
		System.out.printf("int1 = %3.2f\n", int1);

		double int2 = methodOverload.calcInt(1000.0, 4.0);
		System.out.printf("int2 = %3.2f\n", int2);

//		double int3 = methodOverload.calcInt(1000, 4);
//		System.out.printf("int2 = %3.2f\n", int3);
}
	
	// constructor
	public MethodOverload() {
	}
	
	/**
	 * Calculate interest
	 * 
	 * @param balance - balance as a double
	 * @param rate - interest rate as decimal (e.g. 0.04)
	 * @return - the interest
	 */
	public double calcInt(double balance, double rate){
        return balance * rate;
	}
	
	/**
	 * Calculate interest
	 * 
	 * @param balance - balance as a double
	 * @param rate - interest rate as percentage (e.g. 4 for 4%)
	 * @return - the interest
	 */
	public double calcInt(double balance, int rate){
		double ratePercent = rate/100.0;
		return balance * ratePercent;
	}
	
	/**
	 * Calculate interest
	 * 
	 * @param balance - balance as a double
	 * @param rate - interest rate as percentage (e.g. 4 for 4%)
	 * @return - the interest
	 */
	public double calcInt(int balance, double rate){
		double ratePercent = rate/100.0;
		return balance * ratePercent;
	}

}
