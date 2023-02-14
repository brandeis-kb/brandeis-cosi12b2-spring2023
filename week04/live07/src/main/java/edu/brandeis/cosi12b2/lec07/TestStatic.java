package edu.brandeis.cosi12b2.lec07;

import java.util.Arrays;

public class TestStatic {

	public static void main(String[] args) {
		int[][] array2d = {
				ArrayExample.x,
				ArrayExample.y,
				ArrayExample.z
		};

		ArrayExample.printMatrix(array2d);
		ArrayExample.matrixAddOne(array2d);
		ArrayExample.printMatrix(array2d);
		
		ArrayExample ae = new ArrayExample();
		System.out.println(Arrays.toString(ae.xx));

	}

}
